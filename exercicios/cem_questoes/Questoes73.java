import java.util.Random;

public class Questoes73 {
    public static void main(String[] args) {
        int linhas = 5;
        int colunas = 5;
        int numMinas = 5;
        char[][] campo = new char[linhas][colunas];
        Random random = new Random();

        // Inicializa o campo com espaços
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                campo[i][j] = ' ';
            }
        }

        // Distribui as minas aleatoriamente
        int minasColocadas = 0;
        while (minasColocadas < numMinas) {
            int r = random.nextInt(linhas);
            int c = random.nextInt(colunas);
            if (campo[r][c] != 'M') {
                campo[r][c] = 'M';
                minasColocadas++;
            }
        }

        // Calcula os números de minas adjacentes
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (campo[i][j] == 'M') {
                    continue; // Pula a mina
                }

                int countMinasAdjacentes = 0;
                // Verifica as 8 direções ao redor
                for (int dr = -1; dr <= 1; dr++) {
                    for (int dc = -1; dc <= 1; dc++) {
                        if (dr == 0 && dc == 0) continue; // Não verifica a própria célula

                        int ni = i + dr;
                        int nj = j + dc;

                        // Verifica se a posição adjacente está dentro dos limites do campo
                        if (ni >= 0 && ni < linhas && nj >= 0 && nj < colunas) {
                            if (campo[ni][nj] == 'M') {
                                countMinasAdjacentes++;
                            }
                        }
                    }
                }
                if (countMinasAdjacentes > 0) {
                    campo[i][j] = (char) (countMinasAdjacentes + '0'); // Converte int para char
                }
            }
        }

        System.out.println("Gerando campo minado " + linhas + "x" + colunas + " com " + numMinas + " minas...");
        System.out.println("Campo Minado (" + linhas + "x" + colunas + "):");

        // Exibe o campo
        System.out.print("   ");
        for (int j = 0; j < colunas; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < linhas; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < colunas; j++) {
                System.out.print(campo[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nLegenda: M=Mina, números=minas adjacentes");
        System.out.println("Total de minas: " + numMinas);
    }
}