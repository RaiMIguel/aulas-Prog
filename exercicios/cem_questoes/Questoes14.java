import java.util.Scanner;

public class Questoes14 {

    /**
     * @param args
     * Enunciado: Leia dois números inteiros e exiba sua soma, subtração,
     * multiplicação e divisão.
     *
     * Objetivos:
     * - Ler múltiplas entradas
     * - Realizar operações básicas
     * - Formatar saídas
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("\n=== CALCULADORA BÁSICA ===");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " × " + num2 + " = " + (num1 * num2));
        System.out.printf("%d ÷ %d = %.2f%n", num1, num2, (double) num1 / num2);
        
        scanner.close();
    }
}