public class Questoes50 {
    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.print("Array inicial: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i == numeros.length - 1 ? "" : ", "));
        }
        System.out.println("]\n");

        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troca numeros[j] e numeros[j+1]
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
            System.out.print("Etapa " + (i + 1) + ": [");
            for (int k = 0; k < numeros.length; k++) {
                System.out.print(numeros[k] + (k == numeros.length - 1 ? "" : ", "));
            }
            System.out.println("]");
        }

        System.out.print("\nArray ordenado: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i == numeros.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}