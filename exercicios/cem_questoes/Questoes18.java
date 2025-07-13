import java.util.Scanner;

public class Questoes18 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int soma = 0;
        int numero;

        System.out.println("Digite números (0 para parar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            soma += numero;
            contador++;
        }

        System.out.println("\n=== RELATÓRIO ===");
        System.out.println("Números digitados: " + contador);
        System.out.println("Soma total: " + soma);
        System.out.println("Programa encerrado.");

        scanner.close();
    }
}
