import java.util.Scanner;

public class Questoes41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.println("Calculando MDC de " + a + " e " + b + ":");

        int dividendo = a;
        int divisor = b;
        int resto;
        int mdc = 0;

        while (divisor != 0) {
            resto = dividendo % divisor;
            System.out.println(dividendo + " = " + divisor + " × " + (dividendo / divisor) + " + " + resto);
            dividendo = divisor;
            divisor = resto;
        }
        mdc = dividendo;

        System.out.println("MDC(" + a + ", " + b + ") = " + mdc);

        scanner.close();
    }
}