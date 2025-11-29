package exercicios.exercicios_estrutura_dados.listaligada;

public class main {
    public static void main(String[] args){
        ListaLigadaNinja equipe = new ListaLigadaNinja();

        System.out.println("------------inserir dados-------------");

        equipe.insertEnd("Naruto", 9000, "Konoha");
        equipe.insertEnd("Sasuke", 8500, "Konoha");
        equipe.insertEnd("Sakura", 7000, "Konoha");
        equipe.insertEnd("Kakashi", 7500, "Konoha");

        equipe.display();

        System.out.println("------------remover dados-------------");
        equipe.removeForName("Sakura");
        equipe.display();

        System.out.println("------------buscar dados-------------");
        var searchName = equipe.searchForName("Kakashi");
        if (searchName != null) {
            System.out.println(searchName.name + " encontrado! Poder: " + searchName.powerChakra);
        }
    }
}
