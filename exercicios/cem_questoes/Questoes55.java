import java.util.ArrayList;
import java.util.Scanner;

public class Questoes55 {
    public static void main(String[] args) {
        ArrayList<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Hinata");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista original: " + ninjas.toString());
        System.out.print("Digite o nome do ninja a remover: ");
        String nomeRemover = scanner.nextLine();

        System.out.println("Removendo: " + nomeRemover);

        boolean removido = ninjas.remove(nomeRemover);

        if (removido) {
            System.out.println("Lista atualizada: " + ninjas.toString());
            System.out.println(nomeRemover + " foi removido com sucesso!");
        } else {
            System.out.println("Ninja " + nomeRemover + " não encontrado.");
        }

        scanner.close();
    }
}