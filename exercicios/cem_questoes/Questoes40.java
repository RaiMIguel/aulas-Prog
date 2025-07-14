import java.util.Scanner;

public class Questoes40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        System.out.println("Números primos até " + n + ":");
        int contadorPrimos = 0;

        for (int i = 2; i <= n; i++) {
            boolean ehPrimo = true;
            if (i <= 1) {
                ehPrimo = false;
            } else {
                for (int j = 2; j * j <= i; j++) { 
                    if (i % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            if (ehPrimo) {
                System.out.print(i + " ");
                contadorPrimos++;
            }
        }
        System.out.println("\n");
        System.out.println("Total de primos encontrados: " + contadorPrimos);

        scanner.close();
    }
}