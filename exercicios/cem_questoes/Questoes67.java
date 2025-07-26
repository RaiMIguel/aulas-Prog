public class Questoes67 {
    public static void main(String[] args) {
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int linhasOriginal = matrizOriginal.length;
        int colunasOriginal = matrizOriginal[0].length;

        int[][] matrizTransposta = new int[colunasOriginal][linhasOriginal];

        System.out.println("Matriz original (" + linhasOriginal + "x" + colunasOriginal + "):");
        for (int i = 0; i < linhasOriginal; i++) {
            for (int j = 0; j < colunasOriginal; j++) {
                System.out.print(matrizOriginal[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < linhasOriginal; i++) {
            for (int j = 0; j < colunasOriginal; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        System.out.println("\nMatriz transposta (" + colunasOriginal + "x" + linhasOriginal + "):");
        for (int i = 0; i < colunasOriginal; i++) {
            for (int j = 0; j < linhasOriginal; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}