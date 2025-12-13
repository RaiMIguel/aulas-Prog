import java.util.ArrayList;

public class Questoes54 {

    /**
     * @param args
     * Enunciado: Crie um ArrayList de strings com 5 nomes de ninjas e exiba todos.
     *
     * Objetivos:
     * - Importar ArrayList
     * - Adicionar elementos
     * - Percorrer ArrayList
     */
    public static void main(String[] args) {
        ArrayList<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Kakashi");
        ninjas.add("Hinata");
        
        exibirNinjas(ninjas);
    }

    /**
     * Exibe os nomes de uma lista de ninjas.
     * @param ninjas A lista de nomes de ninjas.
     */
    public static void exibirNinjas(ArrayList<String> ninjas) {
        System.out.println("=== LISTA DE NINJAS ===");
        int contador = 1;
        for (String ninja : ninjas) {
            System.out.println(contador + ". " + ninja);
            contador++;
        }
        System.out.println("\nTotal de ninjas: " + ninjas.size());
    }
}