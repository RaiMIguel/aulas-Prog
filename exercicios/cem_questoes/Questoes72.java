import java.util.Scanner;

public class Questoes72 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16}
        };

        System.out.println("Matriz ordenada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o valor a buscar: ");
        int valorBuscar = scanner.nextInt();

        System.out.println("Buscando " + valorBuscar + " na matriz ordenada...");

        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int linhaAtual = 0;
        int colunaAtual = colunas - 1; // Começa do canto superior direito

        int comparacoes = 0;
        String caminho = "";
        boolean encontrado = false;

        while (linhaAtual < linhas && colunaAtual >= 0) {
            comparacoes++;
            caminho += "(" + linhaAtual + "," + colunaAtual + ") ";

            if (matriz[linhaAtual][colunaAtual] == valorBuscar) {
                encontrado = true;
                caminho += "→ Encontrado!";
                break;
            } else if (matriz[linhaAtual][colunaAtual] > valorBuscar) {
                colunaAtual--; // Valor atual é maior, move para a esquerda
            } else {
                linhaAtual++; // Valor atual é menor, move para baixo
            }
        }

        System.out.println("Caminho: " + caminho);
        if (encontrado) {
            System.out.println("Valor " + valorBuscar + " encontrado na posição [" + linhaAtual + "][" + colunaAtual + "]");
        } else {
            System.out.println("Valor " + valorBuscar + " não encontrado.");
        }
        System.out.println("Comparações realizadas: " + comparacoes);

        scanner.close();
    }
}