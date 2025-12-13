import java.util.Scanner;

public class Questoes38 {

    /**
     * @param args
     * Enunciado: Calcule a soma dos dígitos de um número.
     *
     * Objetivos:
     * - Extrair dígitos individuais
     * - Usar divisão e módulo
     * - Acumular resultados
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        mostrarProcessoSomaDigitos(numero);
        int soma = somarDigitos(numero);
        
        System.out.println("Soma dos dígitos: " + soma);
        
        scanner.close();
    }

    /**
     * Calcula a soma dos dígitos de um número.
     * @param numero O número a ser somado.
     * @return A soma dos dígitos do número.
     */
    public static int somarDigitos(int numero) {
        int soma = 0;
        int temp = numero;
        while (temp > 0) {
            soma += temp % 10;
            temp /= 10;
        }
        return soma;
    }

    /**
     * Mostra o processo de extração e soma dos dígitos de um número.
     * @param numero O número a ser exibido.
     */
    public static void mostrarProcessoSomaDigitos(int numero) {
        System.out.println("\nNúmero: " + numero);
        System.out.print("Dígitos: ");
        
        int temp = numero;
        String processo = "";
        while (temp > 0) {
            processo = (temp % 10) + ((temp > 9) ? " + " : "") + processo;
            temp /= 10;
        }
        System.out.println(processo);
    }
}