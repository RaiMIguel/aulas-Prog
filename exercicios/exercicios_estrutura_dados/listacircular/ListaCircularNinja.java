package exercicios.exercicios_estrutura_dados.listacircular;

public class ListaCircularNinja {

    public class NinjaNode {
        int id;
        String name;
        int powerChakra;
        String village;
        NinjaNode next;

        public NinjaNode(int id, String name, int powerChakra, String village) {
            this.id = id;
            this.name = name;
            this.powerChakra = powerChakra;
            this.village = village;
            this.next = null;
        }
    }

    private NinjaNode head;
    private NinjaNode tail;
    private int size;

    public ListaCircularNinja() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean insertOrdered(int id, String name, int power, String village) {
        if (id <= 0) return false;
        if (searchForId(id) != null) return false;

        NinjaNode newNinja = new NinjaNode(id, name, power, village);

        if (isEmpty()) {
            head = newNinja;
            tail = newNinja;
            newNinja.next = head; // Fecha o círculo
        }
        else if (id < head.id) { // Novo menor ID (Novo Head
            newNinja.next = head;
            head = newNinja;
            tail.next = head; // O tail agora aponta para o novo head
        }
        else {
            NinjaNode actual = head;
            // Percorre até o penúltimo ou até encontrar a posição
            // Condição atual.next != head substitui o atual.next != null
            while (actual.next != head && actual.next.id < id) {
                actual = actual.next;
            }

            newNinja.next = actual.next;
            actual.next = newNinja;

            if (actual == tail) {
                tail = newNinja;
            }
        }
        size++;
        return true;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }

        System.out.println("===== EQUIPE NINJA (CIRCULAR POR ID) =====");
        NinjaNode actual = head;
        do {
            System.out.println(actual.id + " - " + actual.name + " | Poder: " + actual.powerChakra);
            actual = actual.next;
        } while (actual != head);

        System.out.println("==========================================");
        System.out.println("Quantidade de ninjas: " + size);
    }

    public NinjaNode searchForId(int id) {
        if (isEmpty()) return null;
        NinjaNode actual = head;
        do {
            if (actual.id == id) return actual;
            if (actual.id > id) return null;
            actual = actual.next;
        } while (actual != head);
        return null;
    }

    public boolean removeForId(int id) {
        if (isEmpty()) return false;

        // Caso 1: Remover o Head
        if (head.id == id) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            size--;
            return true;
        }

        NinjaNode actual = head;
        // Busca o nó ANTERIOR ao que queremos remover
        while (actual.next != head && actual.next.id < id) {
            actual = actual.next;
        }

        if (actual.next != head && actual.next.id == id) {
            if (actual.next == tail) {
                tail = actual; // Se remover o último, o anterior vira tail
            }
            actual.next = actual.next.next; // "Pula" o nó removido
            size--;
            return true;
        }

        return false;
    }

    public boolean updateForId(int id, String newName, int newPower, String newVillage) {
        NinjaNode ninja = searchForId(id);
        if (ninja == null) return false;

        if (newName != null && !newName.equals("-") && !newName.isEmpty()) ninja.name = newName;
        if (newPower != -1) ninja.powerChakra = newPower;
        if (newVillage != null && !newVillage.equals("-") && !newVillage.isEmpty()) ninja.village = newVillage;

        return true;
    }
}