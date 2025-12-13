import java.util.Scanner;

public class Questoes37 {

    /**
     * @param args
     * Enunciado: Verifique se um número é primo.
     *
     * Objetivos:
     * - Implementar algoritmo de verificação
     * - Otimizar laços
     * - Usar flags booleanos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (ehPrimo(numero)) {
            System.out.println("\nO número " + numero + " é primo!");
        } else {
            System.out.println("\nO número " + numero + " não é primo.");
        }
        
        scanner.close();
    }

    /**
     * Verifica se um número é primo, mostrando o processo de verificação.
     * @param numero O número a ser verificado.
     * @return true se o número for primo, false caso contrário.
     */
    public static boolean ehPrimo(int numero) {
        System.out.println("Verificando se " + numero + " é primo...");
        if (numero <= 1) {
            return false;
        }
        
        System.out.print("Testando divisores: ");
        for (int i = 2; i < numero; i++) {
            System.out.print(i + " ");
            if (numero % i == 0) {
                System.out.println();
                return false;
            }
        }
        System.out.println();
        return true;
    }
}