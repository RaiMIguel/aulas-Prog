import java.util.Arrays;
import java.util.Random;

public class Questoes73 {

    /**
     * @param args
     * Enunciado: Crie um campo minado usando matriz. Use 'M' para minas,
     * números para minas adjacentes, e ' ' para vazio.
     *
     * Objetivos:
     * - Gerar campo aleatório
     * - Calcular números de minas adjacentes
     * - Implementar interface básica
     */
    public static void main(String[] args) {
        final int TAMANHO = 5;
        final int MINAS = 5;
        
        System.out.println("Gerando campo minado " + TAMANHO + "x" + TAMANHO + " com " + MINAS + " minas...");
        char[][] campo = gerarCampoMinado(TAMANHO, MINAS);
        
        System.out.println("\nCampo Minado (" + TAMANHO + "x" + TAMANHO + "):");
        exibirCampoMinado(campo);
        System.out.println("\nLegenda: M=Mina, números=minas adjacentes");
        System.out.println("Total de minas: " + MINAS);
    }

    /**
     * Exibe o campo minado formatado.
     * @param campo A matriz do campo minado.
     */
    public static void exibirCampoMinado(char[][] campo) {
        System.out.print("   ");
        for (int i = 0; i < campo.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < campo.length; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < campo[i].length; j++) {
                System.out.print(campo[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Gera um campo minado com minas aleatórias e contagem de adjacentes.
     * @param tamanho O tamanho do lado do campo quadrado.
     * @param numMinas O número de minas a serem colocadas.
     * @return A matriz de caracteres do campo minado.
     */
    public static char[][] gerarCampoMinado(int tamanho, int numMinas) {
        char[][] campo = new char[tamanho][tamanho];
        Random random = new Random();
        
        for (int i = 0; i < tamanho; i++) {
            Arrays.fill(campo[i], ' ');
        }
        
        int minasColocadas = 0;
        while (minasColocadas < numMinas) {
            int linha = random.nextInt(tamanho);
            int coluna = random.nextInt(tamanho);
            if (campo[linha][coluna] != 'M') {
                campo[linha][coluna] = 'M';
                minasColocadas++;
            }
        }
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (campo[i][j] != 'M') {
                    int contagem = contarMinasAdjacentes(campo, i, j);
                    if (contagem > 0) {
                        campo[i][j] = (char) ('0' + contagem);
                    }
                }
            }
        }
        return campo;
    }

    /**
     * Conta o número de minas nas células adjacentes a uma posição.
     * @param campo O campo minado.
     * @param linha A linha da célula.
     * @param coluna A coluna da célula.
     * @return O número de minas adjacentes.
     */
    public static int contarMinasAdjacentes(char[][] campo, int linha, int coluna) {
        int contagem = 0;
        int tamanho = campo.length;
        for (int i = linha - 1; i <= linha + 1; i++) {
            for (int j = coluna - 1; j <= coluna + 1; j++) {
                if (i >= 0 && i < tamanho && j >= 0 && j < tamanho) {
                    if (campo[i][j] == 'M') {
                        contagem++;
                    }
                }
            }
        }
        return contagem;
    }
}
