import java.util.Arrays;

public class Questoes50 {

    /**
     * @param args
     * Enunciado: Ordene um array usando bubble sort e mostre cada etapa.
     * Dados: {64, 34, 25, 12, 22, 11, 90}
     *
     * Objetivos:
     * - Implementar algoritmo de ordenação
     * - Mostrar processo passo a passo
     * - Entender comparações e trocas
     */
    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array inicial: " + Arrays.toString(numeros));
        
        bubbleSort(numeros);
        
        System.out.println("\nArray ordenado: " + Arrays.toString(numeros));
    }

    /**
     * Ordena um array usando o algoritmo Bubble Sort, exibindo cada etapa.
     * @param array O array a ser ordenado.
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("Etapa " + (i + 1) + ": " + Arrays.toString(array));
        }
    }
}