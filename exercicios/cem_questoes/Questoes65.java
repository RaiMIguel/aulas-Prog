public class Questoes65 {
    public static void main(String[] args) {
        int[][] matriz = {
            {23, 45, 12},
            {67, 89, 34},
            {56, 78, 91}
        };

        int maiorElemento = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("\nMaior elemento: " + maiorElemento);
        System.out.println("Posição: linha " + linhaMaior + ", coluna " + colunaMaior);
    }
}