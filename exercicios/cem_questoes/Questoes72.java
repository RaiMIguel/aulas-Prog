import java.util.Scanner;

public class Questoes72 {

    /**
     * @param args
     * Enunciado: Implemente busca em matriz ordenada (ordenada por linhas e colunas).
     *
     * Objetivos:
     * - Implementar algoritmo eficiente
     * - Usar divisão e conquista
     * - Mostrar processo de busca
     */
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matriz ordenada:");
        exibirMatriz(matriz);
        System.out.print("\nDigite o valor a buscar: ");
        int valor = scanner.nextInt();
        
        System.out.println("\nBuscando " + valor + " na matriz ordenada...");
        buscaMatrizOrdenada(matriz, valor);
        
        scanner.close();
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
     * Realiza uma busca em matriz ordenada, mostrando o caminho.
     * @param matriz A matriz ordenada.
     * @param valor O valor a ser buscado.
     */
    public static void buscaMatrizOrdenada(int[][] matriz, int valor) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int i = 0;
        int j = colunas - 1;
        int comparacoes = 0;
        StringBuilder caminho = new StringBuilder("Caminho:");

        while (i < linhas && j >= 0) {
            comparacoes++;
            caminho.append(" (" + i + "," + j + ")");
            if (matriz[i][j] == valor) {
                caminho.append(" -> Encontrado!");
                System.out.println(caminho.toString());
                System.out.println("Valor " + valor + " encontrado na posição [" + i + "][" + j + "]");
                System.out.println("Comparações realizadas: " + comparacoes);
                return;
            }
            if (matriz[i][j] > valor) {
                j--;
            } else {
                i++;
            }
        }
        
        System.out.println(caminho.toString() + " -> Não encontrado.");
        System.out.println("Valor " + valor + " não encontrado na matriz.");
        System.out.println("Comparações realizadas: " + comparacoes);
    }
}