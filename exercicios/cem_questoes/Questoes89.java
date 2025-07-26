import java.util.Arrays;

public class Questoes89 {

    // Implementa o Bubble Sort
    public static int[] ordenarArray(int[] array) {
        int n = array.length;
        int comparacoes = 0;
        int trocas = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (array[j] > array[j + 1]) {
                    // Troca array[j] e array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocas++;
                }
            }
        }
        System.out.println("Método utilizado: Bubble Sort");
        System.out.println("Comparações realizadas: " + comparacoes);
        System.out.println("Trocas realizadas: " + trocas);
        return array;
    }

    public static void main(String[] args) {
        int[] arrayTeste = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array original: " + Arrays.toString(arrayTeste));
        System.out.println("Ordenando array...");
        
        long startTime = System.nanoTime();
        int[] arrayOrdenado = ordenarArray(arrayTeste); // O método modifica o array original
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // Tempo em milissegundos

        System.out.println("Array ordenado: " + Arrays.toString(arrayOrdenado));
        System.out.println("Tempo de execução: " + duration + " ms");
    }
}