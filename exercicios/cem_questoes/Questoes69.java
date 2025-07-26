public class Questoes69 {
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

        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int linhasB = matrizB.length;
        int colunasB = matrizB[0].length;

        System.out.println("Matriz A (" + linhasA + "x" + colunasA + "):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.printf("%3d", matrizA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz B (" + linhasB + "x" + colunasB + "):");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.printf("%3d", matrizB[i][j]);
            }
            System.out.println();
        }

        if (colunasA != linhasB) {
            System.out.println("\nErro: As matrizes não podem ser multiplicadas.");
            System.out.println("Número de colunas da Matriz A deve ser igual ao número de linhas da Matriz B.");
            return;
        }

        int[][] matrizC = new int[linhasA][colunasB];

        System.out.println("\nMatriz C = A × B (" + linhasA + "x" + colunasB + "):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) { // colunasA == linhasB
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
                System.out.printf("%4d", matrizC[i][j]);
            }
            System.out.println();
        }
    }
}