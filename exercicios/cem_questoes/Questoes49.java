import java.util.Arrays;
import java.util.Scanner;

public class Questoes49 {

    /**
     * @param args
     * Enunciado: Implemente busca linear em um array. Procure por um valor específico.
     * Dados: {10, 25, 14, 37, 22, 18, 41}
     *
     * Objetivos:
     * - Implementar algoritmo de busca
     * - Retornar posição encontrada
     * - Tratar caso não encontrado
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 25, 14, 37, 22, 18, 41};

        System.out.println("Array: " + Arrays.toString(numeros));
        System.out.print("Digite o valor a buscar: ");
        int valor = scanner.nextInt();

        System.out.println("\nBuscando " + valor + " no array...");
        int posicao = buscaLinear(numeros, valor);

        if (posicao != -1) {
            System.out.println("Valor encontrado na posição " + posicao);
        } else {
            System.out.println("Valor não encontrado");
        }
        
        scanner.close();
    }

    /**
     * Realiza uma busca linear em um array de inteiros.
     * @param array O array onde a busca será realizada.
     * @param valor O valor a ser procurado.
     * @return A posição do valor se for encontrado, ou -1 caso contrário.
     */
    public static int buscaLinear(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}