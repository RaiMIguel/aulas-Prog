import java.util.Scanner;

public class Questoes23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0.0;
        boolean operacaoValida = true;

        if (operacao == '+') {
            resultado = num1 + num2;
        } else if (operacao == '-') {
            resultado = num1 - num2;
        } else if (operacao == '*') {
            resultado = num1 * num2;
        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisão por zero não permitida.");
                operacaoValida = false;
            }
        } else {
            System.out.println("Erro: Operação inválida.");
            operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.printf("Resultado: %.1f %c %.1f = %.1f%n", num1, operacao, num2, resultado);
        }

        scanner.close();
    }
}