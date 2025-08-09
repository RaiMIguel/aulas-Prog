public class Questoes67 {

    /**
     * @param args
     * Enunciado: Transponha uma matriz (transforme linhas em colunas).
     *
     * Objetivos:
     * - Criar matriz transposta
     * - Trocar dimensões
     * - Preservar dados
     */
    public static void main(String[] args) {
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        System.out.println("Matriz original (2x3):");
        exibirMatriz(matrizOriginal);
        
        int[][] matrizTransposta = transporMatriz(matrizOriginal);
        
        System.out.println("\nMatriz transposta (3x2):");
        exibirMatriz(matrizTransposta);
    }

    /**
     * Exibe uma matriz de inteiros, formatada.
     * @param matriz A matriz a ser exibida.
     */
    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%d ", elemento);
            }
            System.out.println();
        }
    }

    /**
     * Transpõe uma matriz.
     * @param original A matriz a ser transposta.
     * @return A matriz transposta.
     */
    public static int[][] transporMatriz(int[][] original) {
        int linhas = original.length;
        int colunas = original[0].length;
        int[][] transposta = new int[colunas][linhas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = original[i][j];
            }
        }
        return transposta;
    }
}