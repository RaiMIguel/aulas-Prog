public class Questoes68 {

    /**
     * @param args
     * Enunciado: Verifique se uma matriz quadrada é simétrica (igual à sua transposta).
     *
     * Objetivos:
     * - Comparar com transposta
     * - Verificar propriedade matemática
     * - Implementar validação
     */
    public static void main(String[] args) {
        int[][] matrizTeste = {
            {1, 2, 3},
            {2, 5, 4},
            {3, 4, 6}
        };
        
        System.out.println("Matriz:");
        exibirMatriz(matrizTeste);
        
        System.out.println("\nVerificando simetria...");
        if (isSimetrica(matrizTeste)) {
            System.out.println("A matriz É simétrica!");
        } else {
            System.out.println("A matriz NÃO é simétrica.");
        }
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
     * Verifica se uma matriz quadrada é simétrica.
     * @param matriz A matriz a ser verificada.
     * @return true se a matriz for simétrica, false caso contrário ou se não for quadrada.
     */
    public static boolean isSimetrica(int[][] matriz) {
        if (matriz.length != matriz[0].length) {
            System.out.println("Matriz deve ser quadrada");
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}