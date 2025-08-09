import java.util.Scanner;

public class Questoes18 {

    /**
     * @param args
     *             Enunciado: Leia números inteiros do usuário até que ele digite 0.
     *             Ao final, exiba quantos números foram digitados e a soma total.
     *
     *             Objetivos:
     *             - Usar laços com condição de parada
     *             - Acumular valores
     *             - Contar iterações
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaTotal = 0;
        int numero = 0;
        int contador = 0;

        System.out.println("Digite números (0 para parar):");
        while (true) {
            contador ++;
            somaTotal += numero;
            System.out.println("deseja parar digite 0 para isso: ");
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }

        }

        System.out.println("\n=== RELATÓRIO ===");
        System.out.println("Números digitados: " + contador);
        System.out.println("Soma total: " + somaTotal);
        System.out.println("Programa encerrado.");

        scanner.close();
    }
}