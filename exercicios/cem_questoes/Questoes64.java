public class Questoes64 {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 8, 12},
            {15, 3, 7},
            {9, 11, 6}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }

        int somaTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaTotal += matriz[i][j];
            }
        }

        System.out.println("\nSoma de todos os elementos: " + somaTotal);
    }
}