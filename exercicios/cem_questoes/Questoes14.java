import java.util.Scanner;

public class Questoes14 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("\n=== CALCULADORA BÁSICA ===");

        // Soma
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        // Subtração
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        // Multiplicação
        System.out.println(num1 + " × " + num2 + " = " + (num1 * num2));

        // Divisão: Garanta que um dos operandos seja double para resultado decimal
        // Isso força a promoção de tipo e a divisão de ponto flutuante
        System.out.println(num1 + " ÷ " + num2 + " = " + String.format("%.2f", (double) num1 / num2));

        scanner.close();
    }
}
