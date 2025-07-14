import java.util.Scanner;

public class Questoes37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Verificando se " + numero + " é primo...");

        if (numero <= 1) {
            System.out.println("O número " + numero + " não é primo.");
        } else {
            boolean ehPrimo = true;
            System.out.print("Testando divisores: ");
            for (int i = 2; i < numero; i++) {
                System.out.print(i + (i == numero - 1 ? "" : " "));
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            System.out.println();

            if (ehPrimo) {
                System.out.println("O número " + numero + " é primo!");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }

        scanner.close();
    }
}