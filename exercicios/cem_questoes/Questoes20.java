import java.util.Scanner;

public class Questoes20 {

    /**
     * @param args
     * Enunciado: Leia um número e verifique se ele é positivo, negativo ou zero.
     *
     * Objetivos:
     * - Usar estruturas if/else
     * - Fazer comparações numéricas
     * - Classificar valores
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String classificacao = classificarNumero(numero);
        System.out.println("O número " + numero + " é " + classificacao + ".");
        
        scanner.close();
    }

    /**
     * Classifica um número como "positivo", "negativo" ou "zero".
     * @param numero O número a ser classificado.
     * @return Uma string com a classificação do número.
     */
    public static String classificarNumero(int numero) {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "zero";
        }
    }
}