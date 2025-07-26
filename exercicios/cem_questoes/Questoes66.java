public class Questoes66 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Matriz " + matriz.length + "x" + matriz[0].length + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }

        if (matriz.length != matriz[0].length) {
            System.out.println("\nA matriz não é quadrada, não é possível calcular a diagonal principal.");
            return;
        }

        int somaDiagonal = 0;
        StringBuilder processo = new StringBuilder();

        System.out.print("\nDiagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
            processo.append(matriz[i][i]);
            if (i < matriz.length - 1) {
                processo.append(" + ");
            }
        }
        System.out.println(processo.toString() + " = " + somaDiagonal);
    }
}