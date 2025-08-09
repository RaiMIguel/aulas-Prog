import java.util.Scanner;

public class Questoes32 {

    /**
     * @param args
     * Enunciado: Calcule e exiba a tabuada de um número usando while.
     *
     * Objetivos:
     * - Usar laço while
     * - Realizar multiplicações
     * - Formatar tabuada
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        exibirTabuadaWhile(numero);
        
        scanner.close();
    }

    /**
     * Exibe a tabuada de um número de 1 a 10 usando um laço while.
     * @param numero O número cuja tabuada será exibida.
     */
    public static void exibirTabuadaWhile(int numero) {
        System.out.println("\n=== TABUADA DO " + numero + " ===");
        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }
}