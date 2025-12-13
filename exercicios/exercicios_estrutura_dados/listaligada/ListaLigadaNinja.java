package exercicios.exercicios_estrutura_dados.listaligada;

public class ListaLigadaNinja {

    public class NinjaNode {
        String name;
        int powerChakra;
        String village;
        NinjaNode next;

        public NinjaNode(String name, int powerChakra, String village){
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

    public boolean isempty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    // ---------------- CREATE ----------------

    public void insertBeginning(String nameIB, int powerIB, String villageIB){
        NinjaNode newNinja = new NinjaNode(nameIB, powerIB, villageIB);
        newNinja.next = head;
        head = newNinja;
        size++;
    }

    public void insertEnd(String nameIE, int powerIE, String villageIE){
        NinjaNode newNinja = new NinjaNode(nameIE, powerIE, villageIE);
        if (isempty()){
            head = newNinja;
        } else {
            NinjaNode actual = head;
            while (actual.next != null){
                actual = actual.next;
            }
            actual.next = newNinja;
        }
        size++;
    }

    // ---------------- DELETE ----------------

    public void removeBeginning(){
        if (isempty()){
            System.out.println("vazio!");
            return;
        }
        head = head.next;
        size--;
    }

    public void removeForName(String name){
        if (isempty()){
            System.out.println("vazio");
            return;
        }

        if (head.name.equals(name)){
            removeBeginning();
            return;
        }

        NinjaNode actual = head;
        while (actual.next != null && !actual.next.name.equals(name)){
            actual = actual.next;
        }

        if (actual.next != null){
            actual.next = actual.next.next;
            size--;
            System.out.println(name + " removido da missão");
        } else {
            System.out.println("Não encontrado");
        }
    }

    // ---------------- READ ----------------

    public NinjaNode searchForName(String name){
        NinjaNode actual = head;
        while (actual != null){
            if (actual.name.equals(name)){
                return actual;
            }
            actual = actual.next;
        }
        return null;
    }

    public void display(){
        if (isempty()){
            System.out.println("Não existe Ninja ainda!");
            return;
        }

        System.out.println("----------EQUIPE----------");
        NinjaNode actual = head;
        int pos = 0;

        while (actual != null){
            System.out.println(
                    (pos + 1) + ". " + actual.name +
                            " | PODER: " + actual.powerChakra +
                            " | Aldeia: " + actual.village
            );
            actual = actual.next;
            pos++;
        }
        System.out.println("Quantidade de ninjas: " + size);
    }

    // ---------------- UPDATE ----------------

    public void updateForName(String name, String newName, int newPower, String newVillage){
        if (isempty()){
            System.out.println("Lista vazia!");
            return;
        }

        NinjaNode actual = head;

        while (actual != null){
            if (actual.name.equals(name)){
                actual.name = newName;
                actual.powerChakra = newPower;
                actual.village = newVillage;
                System.out.println("Ninja atualizado com sucesso!");
                return;
            }
            actual = actual.next;
        }

        System.out.println("Ninja não encontrado para atualização.");
    }
}
