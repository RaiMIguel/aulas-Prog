import java.util.Scanner;

public class Questoes15 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = 2024;
        int idade;

        while (true) {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();

            if (idade >= 0) {
                break;
            } else {
                System.out.println("Idade inválida. Por favor, digite um número positivo.");
            }
        }

        int anoNascimento = anoAtual - idade;

        System.out.println("Você tem " + idade + " anos.");
        System.out.println("Você nasceu em: " + anoNascimento);

        scanner.close();
    }
}
