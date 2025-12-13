import java.util.Scanner;

public class Questoes22 {

    /**
     * @param args
     * Enunciado: Verifique se um número inteiro é par ou ímpar.
     *
     * Objetivos:
     * - Usar operador módulo (%)
     * - Entender resto da divisão
     * - Classificação matemática
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        String resultado = ehPar(numero) ? "par" : "ímpar";
        
        System.out.println("O número " + numero + " é " + resultado + ".");
        
        scanner.close();
    }

    /**
     * Verifica se um número é par.
     * @param numero O número a ser verificado.
     * @return true se o número for par, false caso contrário.
     */
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}