import java.util.Scanner;

public class Questoes19 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        while (true) {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();

            if (idade >= 0 && idade <= 120) {
                break; // Idade válida, sai do loop
            } else {
                System.out.println("Idade inválida! Digite novamente:");
            }
        }

        System.out.println("Idade válida registrada: " + idade + " anos");

        scanner.close();
    }
}
