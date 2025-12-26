package exercicios.exercicios_estrutura_dados.listaligada;

public class ListaLigadaNinja {

    public class NinjaNode {
        String name;
        int powerChakra;
        String village;
        NinjaNode next;
        NinjaNode prev;

        public NinjaNode(String name, int powerChakra, String village) {
            this.name = name;
            this.powerChakra = powerChakra;
            this.village = village;
            this.next = null;
            this.prev = null;
        }
    }

    private NinjaNode head;
    private NinjaNode tail;
    private int size;

    public ListaLigadaNinja() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void insertEnd(String name, int power, String village) {
        NinjaNode newNinja = new NinjaNode(name, power, village);

        if (isEmpty()) {
            head = newNinja;
            tail = newNinja;
        } else {
            tail.next = newNinja;
            newNinja.prev = tail;
            tail = newNinja;
        }
        size++;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }

        System.out.println("===== EQUIPE NINJA =====");
        NinjaNode actual = head;
        int pos = 0;

        while (actual != null) {
            System.out.println(
                    pos + ". " + actual.name +
                            " | Poder: " + actual.powerChakra +
                            " | Aldeia: " + actual.village
            );
            actual = actual.next;
            pos++;
        }
        System.out.println("========================");
    }

    public void displayReverse() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }

        System.out.println("===== EQUIPE NINJA (REVERSO) =====");
        NinjaNode actual = tail;
        int pos = size - 1;

        while (actual != null) {
            System.out.println(
                    pos + ". " + actual.name +
                            " | Poder: " + actual.powerChakra +
                            " | Aldeia: " + actual.village
            );
            actual = actual.prev;
            pos--;
        }
        System.out.println("===============================");
    }

    public NinjaNode searchForName(String name) {
        NinjaNode actual = head;

        while (actual != null) {
            if (actual.name.equals(name)) {
                return actual;
            }
            actual = actual.next;
        }
        return null;
    }

    public void updateForName(String name, String newName, int newPower, String newVillage) {
        NinjaNode ninja = searchForName(name);

        if (ninja == null) {
            System.out.println("Ninja não encontrado!");
            return;
        }

        ninja.name = newName;
        ninja.powerChakra = newPower;
        ninja.village = newVillage;
        System.out.println("Ninja atualizado com sucesso!");
    }

    public void removeForName(String name) {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }

        NinjaNode actual = searchForName(name);

        if (actual == null) {
            System.out.println("Ninja não encontrado!");
            return;
        }

        if (actual == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
        else if (actual == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        }
        else {
            actual.prev.next = actual.next;
            actual.next.prev = actual.prev;
        }

        size--;
        System.out.println(name + " removido da equipe!");
    }
}
