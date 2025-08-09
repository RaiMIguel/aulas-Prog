import java.util.Scanner;

public class Questoes70 {

    /**
     * @param args
     * Enunciado: Implemente o jogo da velha usando uma matriz 3x3.
     *
     * Objetivos:
     * - Criar tabuleiro 3x3
     * - Alternar jogadores (X e O)
     * - Verificar vitória e empate
     */
    public static void main(String[] args) {
        jogarJogoDaVelha();
    }

    /**
     * Implementa a lógica completa do jogo da velha.
     */
    public static void jogarJogoDaVelha() {
        char[][] tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
        
        Scanner scanner = new Scanner(System.in);
        char jogadorAtual = 'X';
        boolean jogoTerminado = false;
        int jogadas = 0;

        while (!jogoTerminado) {
            exibirTabuleiro(tabuleiro);
            System.out.println("\nJogador " + jogadorAtual + ", digite linha e coluna (0-2):");
            
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();
            
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;
                jogadas++;
                
                if (verificarVitoria(tabuleiro, jogadorAtual)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("\nParabéns! O jogador " + jogadorAtual + " venceu!");
                    jogoTerminado = true;
                } else if (jogadas == 9) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("\nO jogo terminou em empate!");
                    jogoTerminado = true;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Posição inválida ou já ocupada. Tente novamente.");
            }
        }
        
        scanner.close();
    }

    /**
     * Exibe o estado atual do tabuleiro do jogo da velha.
     * @param tabuleiro A matriz 3x3 do jogo.
     */
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("\n  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j] + " " + (j < 2 ? "|" : ""));
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----------");
            }
        }
    }

    /**
     * Verifica se o jogador atual venceu o jogo.
     * @param tabuleiro A matriz 3x3 do jogo.
     * @param jogador O caractere do jogador ('X' ou 'O').
     * @return true se o jogador venceu, false caso contrário.
     */
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        // Checar linhas e colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) return true;
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) return true;
        }
        // Checar diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) return true;
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) return true;
        
        return false;
    }
}