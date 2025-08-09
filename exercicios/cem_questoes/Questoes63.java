public class Questoes63 {

    /**
     * @param args
     * Enunciado: Declare uma matriz 3x3 e preencha com valores de 1 a 9.
     *
     * Objetivos:
     * - Declarar matriz bidimensional
     * - Preencher com laços aninhados
     * - Exibir formatado
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int valor = 1;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = valor++;
            }
        }
        
        System.out.println("Matriz 3x3:");
        exibirMatriz(matriz);
    }

    /**
     * Exibe uma matriz de inteiros, formatada.
     * @param matriz A matriz a ser exibida.
     */
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}