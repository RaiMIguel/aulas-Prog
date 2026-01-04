package exercicios.exercicios_estrutura_dados.listaligada;

public class ListaLigadaNinja {

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
    private int size;

    public ListaLigadaNinja() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public boolean insertOrdered(int id, String name, int power, String village) {

        if (id <= 0) {
            System.out.println("ID inválido! Use um número maior que 0.");
            return false;
        }

        if (searchForId(id) != null) {
            System.out.println("ID já existe!");
            return false;
        }

        NinjaNode newNinja = new NinjaNode(id, name, power, village);

        if (isEmpty()) {
            head = newNinja;
            size++;
            return true;
        }

        if (id < head.id) {
            newNinja.next = head;
            head = newNinja;
            size++;
            return true;
        }

        NinjaNode actual = head;
        while (actual.next != null && actual.next.id < id) {
            actual = actual.next;
        }

        newNinja.next = actual.next;
        actual.next = newNinja;

        size++;
        return true;
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

    public NinjaNode searchForId(int id) {
        NinjaNode actual = head;

        while (actual != null) {
            if (actual.id == id) return actual;
            if (actual.id > id) return null;
            actual = actual.next;
        }

        return null;
    }

    public boolean updateForId(int id, String newName, int newPower, String newVillage) {
        NinjaNode ninja = searchForId(id);

        if (ninja == null) {
            System.out.println("ID não encontrado!");
            return false;
        }

        if (newName != null && !newName.equals("-") && !newName.isEmpty()) {
            ninja.name = newName;
        }

        if (newPower != -1) {
            ninja.powerChakra = newPower;
        }

        if (newVillage != null && !newVillage.equals("-") && !newVillage.isEmpty()) {
            ninja.village = newVillage;
        }

        System.out.println("Ninja atualizado com sucesso!");
        return true;
    }

    public boolean removeForId(int id) {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return false;
        }

        if (head.id == id) {
            head = head.next;
            size--;
            System.out.println("ID " + id + " removido da equipe!");
            return true;
        }

        NinjaNode actual = head;

        while (actual.next != null && actual.next.id < id) {
            actual = actual.next;
        }

        if (actual.next != null && actual.next.id == id) {
            actual.next = actual.next.next;
            size--;
            System.out.println("ID " + id + " removido da equipe!");
            return true;
        }

        System.out.println("ID não encontrado!");
        return false;
    }
}
