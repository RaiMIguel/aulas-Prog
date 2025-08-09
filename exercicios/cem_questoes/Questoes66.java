public class Questoes66 {

    /**
     * @param args
     * Enunciado: Calcule a soma da diagonal principal de uma matriz quadrada.
     *
     * Objetivos:
     * - Identificar diagonal principal
     * - Somar elementos específicos
     * - Trabalhar com índices
     */
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        System.out.println("Matriz 4x4:");
        exibirMatriz(matriz);
        
        somarDiagonalPrincipal(matriz);
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
     * Calcula e exibe a soma da diagonal principal de uma matriz quadrada.
     * @param matriz A matriz quadrada de inteiros.
     */
    public static void somarDiagonalPrincipal(int[][] matriz) {
        if (matriz.length != matriz[0].length) {
            System.out.println("\nErro: A matriz não é quadrada.");
            return;
        }

        int soma = 0;
        StringBuilder processo = new StringBuilder();
        
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
            processo.append(matriz[i][i]);
            if (i < matriz.length - 1) {
                processo.append(" + ");
            }
        }
        
        System.out.println("\nDiagonal principal: " + processo.toString() + " = " + soma);
    }
}