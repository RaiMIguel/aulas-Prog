public class Questoes43 {

    /**
     * @param args
     * Enunciado: Declare um array de 5 inteiros, inicialize com os valores
     * {10, 25, 30, 15, 40} e exiba todos os elementos.
     *
     * Objetivos:
     * - Declarar e inicializar arrays
     * - Percorrer arrays
     * - Acessar elementos por índice
     */
    public static void main(String[] args) {
        int[] numeros = {10, 25, 30, 15, 40};
        exibirElementosArray(numeros);
    }

    /**
     * Exibe a posição e o valor de cada elemento de um array de inteiros.
     * @param array O array a ser exibido.
     */
    public static void exibirElementosArray(int[] array) {
        System.out.println("Array criado com " + array.length + " elementos:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posição " + i + ": " + array[i]);
        }
    }
}