public class Questoes68 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {2, 5, 4},
            {3, 4, 6}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        if (linhas != colunas) {
            System.out.println("\nMatriz deve ser quadrada para verificar simetria.");
            return;
        }

        boolean simetrica = true;
        System.out.println("\nVerificando simetria...");
        for (int i = 0; i < linhas; i++) {
            for (int j = i + 1; j < colunas; j++) { // Percorre apenas a parte superior da matriz
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) {
                break;
            }
        }

        if (simetrica) {
            System.out.println("A matriz É simétrica!");
        } else {
            System.out.println("A matriz NÃO é simétrica!");
        }
    }
}