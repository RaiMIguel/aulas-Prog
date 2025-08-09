import java.util.Arrays;

public class Questoes53 {

    /**
     * @param args
     * Enunciado: Intercale dois arrays ordenados em um terceiro array também ordenado.
     *
     * Objetivos:
     * - Mesclar arrays mantendo ordem
     * - Lidar com tamanhos diferentes
     * - Usar algoritmo eficiente
     */
    public static void main(String[] args) {
        int[] array1 = {1, 5, 9, 12};
        int[] array2 = {3, 6, 8, 15, 20};
        
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        
        System.out.println("\nIntercalando arrays...");
        int[] resultado = intercalarArrays(array1, array2);
        
        System.out.println("Array resultado: " + Arrays.toString(resultado));
    }

    /**
     * Intercala dois arrays ordenados em um novo array ordenado.
     * @param arr1 O primeiro array ordenado.
     * @param arr2 O segundo array ordenado.
     * @return Um novo array contendo todos os elementos dos arrays de entrada, ordenados.
     */
    public static int[] intercalarArrays(int[] arr1, int[] arr2) {
        int[] resultado = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                resultado[k++] = arr1[i++];
            } else {
                resultado[k++] = arr2[j++];
            }
        }
        
        while (i < arr1.length) {
            resultado[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            resultado[k++] = arr2[j++];
        }
        
        return resultado;
    }
}