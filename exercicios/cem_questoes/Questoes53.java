import java.util.Arrays;

public class Questoes53 {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 9, 12};
        int[] array2 = {3, 6, 8, 15, 20};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("\nIntercalando arrays...");

        int[] resultado = new int[array1.length + array2.length];
        int i = 0; // ponteiro para array1
        int j = 0; // ponteiro para array2
        int k = 0; // ponteiro para array resultado

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                resultado[k++] = array1[i++];
            } else {
                resultado[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            resultado[k++] = array1[i++];
        }

        while (j < array2.length) {
            resultado[k++] = array2[j++];
        }

        System.out.println("Array resultado: " + Arrays.toString(resultado));
    }
}