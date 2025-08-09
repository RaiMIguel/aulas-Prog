import java.util.Scanner;

public class Questoes23 {

    /**
     * @param args
     * Enunciado: Implemente uma calculadora simples que leia dois números e
     * uma operação (+, -, *, /) e execute o cálculo.
     *
     * Objetivos:
     * - Usar múltiplas estruturas de decisão
     * - Trabalhar com caracteres
     * - Implementar operações matemáticas
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        calcularEResultado(num1, operacao, num2);
        
        scanner.close();
    }

    /**
     * Realiza um cálculo com base em dois números e uma operação.
     * @param num1 O primeiro número.
     * @param operacao A operação a ser realizada (+, -, *, /).
     * @param num2 O segundo número.
     */
    public static void calcularEResultado(double num1, char operacao, double num2) {
        double resultado;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.printf("Resultado: %.1f %c %.1f = %.1f%n", num1, operacao, num2, resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.printf("Resultado: %.1f %c %.1f = %.1f%n", num1, operacao, num2, resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.printf("Resultado: %.1f %c %.1f = %.1f%n", num1, operacao, num2, resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("Resultado: %.1f %c %.1f = %.1f%n", num1, operacao, num2, resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Erro: Operação inválida.");
                break;
        }
    }
}