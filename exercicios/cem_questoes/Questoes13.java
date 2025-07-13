import java.util.Scanner;

public class Questoes13 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Bem-vindo(a) à Vila da Folha, " + nomeUsuario + "!");

        scanner.close();
    }
}
