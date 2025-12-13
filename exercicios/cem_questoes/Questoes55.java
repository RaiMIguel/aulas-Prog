import java.util.ArrayList;
import java.util.Scanner;

public class Questoes55 {

    /**
     * @param args
     * Enunciado: Remova um ninja específico da lista e mostre a lista atualizada.
     *
     * Objetivos:
     * - Remover elemento específico
     * - Verificar se remoção funcionou
     * - Exibir estado antes e depois
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Hinata");

        System.out.println("Lista original: " + ninjas);
        
        System.out.print("Digite o nome do ninja a remover: ");
        String ninjaParaRemover = scanner.nextLine();
        
        System.out.println("Removendo: " + ninjaParaRemover);
        boolean removido = ninjas.remove(ninjaParaRemover);

        if (removido) {
            System.out.println("Lista atualizada: " + ninjas);
            System.out.println(ninjaParaRemover + " foi removido com sucesso!");
        } else {
            System.out.println("Ninja não encontrado na lista.");
        }
        
        scanner.close();
    }
}