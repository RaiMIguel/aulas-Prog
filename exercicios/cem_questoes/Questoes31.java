public class Questoes31 {

    /**
     * @param args
     * Enunciado: Imprima os números de 1 a 10 usando um laço for.
     *
     * Objetivos:
     * - Usar laço for básico
     * - Controlar incremento
     * - Formatação simples
     */
    public static void main(String[] args) {
        imprimirNumerosFor();
    }

    /**
     * Imprime os números de 1 a 10, separados por espaço, usando um laço for.
     */
    public static void imprimirNumerosFor() {
        System.out.println("Contando de 1 a 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}