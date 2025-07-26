public class Questoes46 {
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        
        System.out.print("Array original: [");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print(arrayOriginal[i] + (i == arrayOriginal.length - 1 ? "" : ", "));
        }
        System.out.println("]");

        // Inverter o array
        int inicio = 0;
        int fim = arrayOriginal.length - 1;
        while (inicio < fim) {
            int temp = arrayOriginal[inicio];
            arrayOriginal[inicio] = arrayOriginal[fim];
            arrayOriginal[fim] = temp;
            inicio++;
            fim--;
        }

        System.out.print("Array invertido: [");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print(arrayOriginal[i] + (i == arrayOriginal.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}