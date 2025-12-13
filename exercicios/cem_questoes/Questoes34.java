import java.util.Scanner;

public class Questoes34 {

    /**
     * @param args
     * Enunciado: Calcule o fatorial de um número fornecido pelo usuário.
     *
     * Objetivos:
     * - Implementar cálculo matemático
     * - Usar acumulador
     * - Validar entrada
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não definido para números negativos.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("\nCalculando fatorial de " + numero + ":");
            mostrarProcessoFatorial(numero);
            System.out.println(numero + "! = " + fatorial);
        }

        scanner.close();
    }

    /**
     * Calcula o fatorial de um número inteiro.
     * @param numero O número a ser calculado.
     * @return O valor do fatorial, ou 1 se o número for 0.
     */
    public static long calcularFatorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Mostra o processo de cálculo do fatorial.
     * @param numero O número a ser exibido no processo.
     */
    public static void mostrarProcessoFatorial(int numero) {
        System.out.print(numero + "! = ");
        for (int i = numero; i > 0; i--) {
            System.out.print(i + ((i > 1) ? " × " : ""));
        }
        System.out.println();
    }
}