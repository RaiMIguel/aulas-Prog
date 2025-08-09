public class Questoes64 {

    /**
     * @param args
     * Enunciado: Calcule a soma de todos os elementos de uma matriz.
     *
     * Objetivos:
     * - Percorrer matriz completa
     * - Acumular valores
     * - Usar laços aninhados
     */
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 8, 12},
            {15, 3, 7},
            {9, 11, 6}
        };
        
        System.out.println("Matriz:");
        exibirMatriz(matriz);
        
        int soma = somarMatriz(matriz);
        System.out.println("\nSoma de todos os elementos: " + soma);
    }

    /**
     * Exibe uma matriz de inteiros, formatada.
     * @param matriz A matriz a ser exibida.
     */
    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%3d", elemento);
            }
            System.out.println();
        }
    }

    /**
     * Soma todos os elementos de uma matriz.
     * @param matriz A matriz de inteiros.
     * @return A soma total de todos os elementos.
     */
    public static int somarMatriz(int[][] matriz) {
        int soma = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                soma += elemento;
            }
        }
        return soma;
    }
}