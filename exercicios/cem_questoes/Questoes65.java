public class Questoes65 {

    /**
     * @param args
     * Enunciado: Encontre o maior elemento em uma matriz e sua posição.
     *
     * Objetivos:
     * - Encontrar máximo global
     * - Armazenar posição
     * - Percorrer bidimensional
     */
    public static void main(String[] args) {
        int[][] matriz = {
            {23, 45, 12},
            {67, 89, 34},
            {56, 78, 91}
        };
        
        System.out.println("Matriz:");
        exibirMatriz(matriz);
        
        encontrarMaiorElemento(matriz);
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
     * Encontra e exibe o maior elemento e sua posição em uma matriz.
     * @param matriz A matriz de inteiros.
     */
    public static void encontrarMaiorElemento(int[][] matriz) {
        int maior = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        
        System.out.println("\nMaior elemento: " + maior);
        System.out.println("Posição: linha " + linhaMaior + ", coluna " + colunaMaior);
    }
}