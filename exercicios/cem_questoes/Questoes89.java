import java.util.Arrays;

public class Questoes89 {

    /**
     * @param args
     * Enunciado: Crie um método que ordene um array e retorne o array ordenado.
     *
     * Objetivos:
     * - Método que modifica array
     * - Implementar algoritmo de ordenação
     * - Retornar resultado
     */
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Ordenando array...");
        
        ordenarArray(array);
        
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

    /**
     * Ordena um array de inteiros usando o algoritmo Bubble Sort e exibe estatísticas.
     * @param array O array a ser ordenado.
     */
    public static void ordenarArray(int[] array) {
        System.out.println("Método utilizado: Bubble Sort");
        int comparacoes = 0;
        int trocas = 0;
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocas++;
                }
            }
        }
        
        System.out.println("Comparações realizadas: " + comparacoes);
        System.out.println("Trocas realizadas: " + trocas);
    }
}