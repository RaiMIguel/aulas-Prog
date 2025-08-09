import java.util.Arrays;

public class Questoes44 {

    /**
     * @param args
     * Enunciado: Encontre o maior elemento em um array de números.
     * Dados: {45, 23, 67, 89, 12, 56, 78}
     *
     * Objetivos:
     * - Percorrer array completo
     * - Comparar elementos
     * - Manter controle do maior
     */
    public static void main(String[] args) {
        int[] numeros = {45, 23, 67, 89, 12, 56, 78};
        
        System.out.println("Array: " + Arrays.toString(numeros));
        
        int maior = encontrarMaior(numeros);
        int posicao = encontrarPosicao(numeros, maior);
        
        System.out.println("Maior elemento: " + maior);
        System.out.println("Posição: " + posicao);
    }

    /**
     * Encontra o maior elemento em um array de inteiros.
     * @param array O array a ser analisado.
     * @return O maior valor encontrado no array.
     */
    public static int encontrarMaior(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    /**
     * Encontra a primeira posição de um valor em um array.
     * @param array O array a ser analisado.
     * @param valor O valor a ser procurado.
     * @return O índice do valor, ou -1 se não for encontrado.
     */
    public static int encontrarPosicao(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}