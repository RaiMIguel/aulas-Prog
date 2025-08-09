public class Questoes69 {

    /**
     * @param args
     * Enunciado: Implemente multiplicação de duas matrizes.
     *
     * Objetivos:
     * - Implementar algoritmo de multiplicação
     * - Validar dimensões compatíveis
     * - Calcular produto corretamente
     */
    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrizB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        
        System.out.println("Matriz A (2x3):");
        exibirMatriz(matrizA);
        
        System.out.println("\nMatriz B (3x2):");
        exibirMatriz(matrizB);
        
        int[][] resultado = multiplicarMatrizes(matrizA, matrizB);
        
        if (resultado != null) {
            System.out.println("\nMatriz C = A × B (2x2):");
            exibirMatriz(resultado);
        }
    }

    /**
     * Exibe uma matriz de inteiros, formatada.
     * @param matriz A matriz a ser exibida.
     */
    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%3d ", elemento);
            }
            System.out.println();
        }
    }

    /**
     * Multiplica duas matrizes.
     * @param a A primeira matriz.
     * @param b A segunda matriz.
     * @return O resultado da multiplicação ou null se as dimensões forem incompatíveis.
     */
    public static int[][] multiplicarMatrizes(int[][] a, int[][] b) {
        int linhasA = a.length;
        int colunasA = a[0].length;
        int linhasB = b.length;
        int colunasB = b[0].length;
        
        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar. Colunas de A devem ser iguais às linhas de B.");
            return null;
        }
        
        int[][] resultado = new int[linhasA][colunasB];
        
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return resultado;
    }
}