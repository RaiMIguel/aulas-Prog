import java.util.Scanner;

public class Questoes41 {

    /**
     * @param args
     * Enunciado: Calcule o MDC (Máximo Divisor Comum) de dois números usando o
     * algoritmo de Euclides.
     *
     * Objetivos:
     * - Implementar algoritmo clássico
     * - Usar laços com condições
     * - Entender matemática aplicada
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("\nCalculando MDC de " + num1 + " e " + num2 + ":");
        mostrarProcessoMDC(num1, num2);
        int mdc = calcularMDC(num1, num2);
        System.out.println("MDC(" + num1 + ", " + num2 + ") = " + mdc);

        scanner.close();
    }

    /**
     * Mostra o processo do algoritmo de Euclides para o cálculo do MDC.
     * @param a O primeiro número.
     * @param b O segundo número.
     */
    public static void mostrarProcessoMDC(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            int quociente = a / b;
            System.out.println(a + " = " + b + " × " + quociente + " + " + resto);
            a = b;
            b = resto;
        }
    }

    /**
     * Calcula o Máximo Divisor Comum (MDC) de dois números usando o algoritmo de Euclides.
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O MDC dos dois números.
     */
    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}