import java.util.Arrays;

public class Questoes46 {

    /**
     * @param args
     * Enunciado: Inverta os elementos de um array.
     * Dados: {1, 2, 3, 4, 5}
     *
     * Objetivos:
     * - Manipular posições do array
     * - Trocar elementos de lugar
     * - Preservar dados originais
     */
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        
        System.out.println("Array original: " + Arrays.toString(numeros));
        
        inverterArray(numeros);
        
        System.out.println("Array invertido: " + Arrays.toString(numeros));
    }

    /**
     * Inverte os elementos de um array in-place.
     * @param array O array a ser invertido.
     */
    public static void inverterArray(int[] array) {
        int inicio = 0;
        int fim = array.length - 1;
        
        while (inicio < fim) {
            int temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            
            inicio++;
            fim--;
        }
    }
}