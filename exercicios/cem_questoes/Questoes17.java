import java.util.Scanner;

public class Questoes17 {

    /**
     * @param args
     * Enunciado: Use Scanner para ler uma frase completa e exiba quantas
     * palavras ela contém.
     *
     * Objetivos:
     * - Ler linha completa
     * - Manipular strings básico
     * - Contar elementos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        int numeroDePalavras = contarPalavras(frase);
        
        System.out.println("Frase digitada: \"" + frase + "\"");
        System.out.println("Número de palavras: " + numeroDePalavras);
        
        scanner.close();
    }

    /**
     * Conta o número de palavras em uma frase.
     * @param frase A frase a ser analisada.
     * @return O número de palavras na frase.
     */
    public static int contarPalavras(String frase) {
        String[] palavras = frase.trim().split("\\s+");
        return frase.trim().isEmpty() ? 0 : palavras.length;
    }
}