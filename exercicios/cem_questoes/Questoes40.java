import java.util.Scanner;

public class Questoes40 {

    /**
     * @param args
     * Enunciado: Encontre todos os números primos até N (fornecido pelo usuário).
     *
     * Objetivos:
     * - Combinar algoritmos
     * - Otimizar performance
     * - Trabalhar com listas (ou apenas exibição, para simplificar)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número limite (N): ");
        int limite = scanner.nextInt();
        
        encontrarPrimosAte(limite);
        
        scanner.close();
    }

    /**
     * Encontra e exibe todos os números primos até um limite N.
     * @param limite O número máximo a ser verificado.
     */
    public static void encontrarPrimosAte(int limite) {
        int contadorPrimos = 0;
        System.out.println("\nNúmeros primos até " + limite + ":");
        
        for (int i = 2; i <= limite; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
                contadorPrimos++;
            }
        }
        
        System.out.println("\n\nTotal de primos encontrados: " + contadorPrimos);
    }
    
    /**
     * Verifica se um número é primo.
     * @param numero O número a ser verificado.
     * @return true se o número for primo, false caso contrário.
     */
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}