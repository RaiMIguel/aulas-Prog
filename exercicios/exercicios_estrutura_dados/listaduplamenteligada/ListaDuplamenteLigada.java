package exercicios.exercicios_estrutura_dados.listaduplamenteligada;

public class ListaDuplamenteLigada {

    public class NinjaNode {
        int id;
        String name;
        int powerChakra;
        String village;
        NinjaNode next;
        NinjaNode prev;

        public NinjaNode(int id, String name, int powerChakra, String village) {
            this.id = id;
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

    private int nextId;

    public ListaDuplamenteLigada() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.nextId = 1;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    private int generateId() {
        int id = nextId;
        nextId++;
        return id;
    }


    public int insertOrdered(String name, int power, String village) {
        int id = generateId();
        NinjaNode newNinja = new NinjaNode(id, name, power, village);

        if (isEmpty()) {
            head = newNinja;
            tail = newNinja;
            size++;
            return id;
        }

        if (id < head.id) {
            newNinja.next = head;
            head.prev = newNinja;
            head = newNinja;
            size++;
            return id;
        }

        NinjaNode actual = head;
        while (actual.next != null && actual.next.id < id) {
            actual = actual.next;
        }

        newNinja.next = actual.next;
        newNinja.prev = actual;

        if (actual.next != null) {
            actual.next.prev = newNinja;
        } else {
            tail = newNinja;
        }

        actual.next = newNinja;
        size++;
        return id;
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }

        System.out.println("===== EQUIPE NINJA (ORDEM POR ID) =====");
        NinjaNode actual = head;

        while (actual != null) {
            System.out.println(
                    actual.id + " - " + actual.name +
                            " | Poder: " + actual.powerChakra +
                            " | Aldeia: " + actual.village
            );
            actual = actual.next;
        }
        System.out.println("======================================");
        System.out.println("Quantidade de ninjas: " + size);
    }

    public void displayReverse() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }

        System.out.println("===== EQUIPE NINJA (REVERSO POR ID) =====");
        NinjaNode actual = tail;

        while (actual != null) {
            System.out.println(
                    actual.id + " - " + actual.name +
                            " | Poder: " + actual.powerChakra +
                            " | Aldeia: " + actual.village
            );
            actual = actual.prev;
        }
        System.out.println("========================================");
        System.out.println("Quantidade de ninjas: " + size);
    }

    public NinjaNode searchForId(int id) {
        NinjaNode actual = head;

        while (actual != null) {
            if (actual.id == id) {
                return actual;
            }
            if (actual.id > id) {
                return null;
            }
            actual = actual.next;
        }

        return null;
    }

    public void updateForId(int id, String newName, int newPower, String newVillage) {
        NinjaNode ninja = searchForId(id);

        if (ninja == null) {
            System.out.println("ID não encontrado!");
            return;
        }

        ninja.name = newName;
        ninja.powerChakra = newPower;
        ninja.village = newVillage;
        System.out.println("Ninja atualizado com sucesso!");
    }

    public void removeForId(int id) {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }

        NinjaNode actual = searchForId(id);

        if (actual == null) {
            System.out.println("ID não encontrado!");
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
        System.out.println("ID " + id + " removido da equipe!");
    }
}
