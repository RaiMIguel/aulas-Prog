import java.util.Scanner;

public class Questoes34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não definido para números negativos.");
        } else if (numero == 0) {
            System.out.println("Calculando fatorial de 0:");
            System.out.println("0! = 1");
        } else {
            long fatorial = 1;
            StringBuilder processo = new StringBuilder();
            processo.append(numero).append("! = ");

            for (int i = numero; i >= 1; i--) {
                fatorial *= i;
                processo.append(i);
                if (i > 1) {
                    processo.append(" × ");
                }
            }
            System.out.println("Calculando fatorial de " + numero + ":");
            System.out.println(processo.toString() + " = " + fatorial);
        }

        scanner.close();
    }
}