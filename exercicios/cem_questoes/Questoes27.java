import java.util.Random;
import java.util.Scanner;

public class Questoes27 {

    /**
     * @param args
     * Enunciado: Implemente o jogo Pedra, Papel, Tesoura contra o computador.
     *
     * Objetivos:
     * - Usar números aleatórios
     * - Implementar lógica de jogo
     * - Comparar escolhas
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escolha: 1-Pedra, 2-Papel, 3-Tesoura");
        System.out.print("Sua escolha: ");
        int escolhaUsuario = scanner.nextInt();

        int escolhaComputador = random.nextInt(3) + 1;

        String nomeEscolhaUsuario = converterEscolha(escolhaUsuario);
        String nomeEscolhaComputador = converterEscolha(escolhaComputador);
        String resultado = determinarVencedor(escolhaUsuario, escolhaComputador);

        System.out.println("\nVocê escolheu: " + nomeEscolhaUsuario);
        System.out.println("Computador escolheu: " + nomeEscolhaComputador);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    /**
     * Converte um número para a escolha correspondente no jogo.
     * @param escolha O número (1, 2 ou 3).
     * @return O nome da escolha ("Pedra", "Papel" ou "Tesoura").
     */
    public static String converterEscolha(int escolha) {
        if (escolha == 1) return "Pedra";
        if (escolha == 2) return "Papel";
        if (escolha == 3) return "Tesoura";
        return "Inválida";
    }

    /**
     * Determina o vencedor do jogo.
     * @param escolhaUsuario A escolha do usuário (1, 2 ou 3).
     * @param escolhaComputador A escolha do computador (1, 2 ou 3).
     * @return A string do resultado ("Você ganhou!", "Você perdeu!" ou "Empate!").
     */
    public static String determinarVencedor(int escolhaUsuario, int escolhaComputador) {
        if (escolhaUsuario == escolhaComputador) {
            return "Empate!";
        }
        if ((escolhaUsuario == 1 && escolhaComputador == 3) ||
            (escolhaUsuario == 2 && escolhaComputador == 1) ||
            (escolhaUsuario == 3 && escolhaComputador == 2)) {
            return "Você ganhou!";
        } else {
            return "Você perdeu!";
        }
    }
}