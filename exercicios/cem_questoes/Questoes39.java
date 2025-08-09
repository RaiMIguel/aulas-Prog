import java.util.Random;
import java.util.Scanner;

public class Questoes39 {

    /**
     * @param args
     * Enunciado: Implemente um jogo de adivinhação. O computador escolhe um número
     * de 1 a 100 e o usuário tem 7 tentativas para adivinhar.
     *
     * Objetivos:
     * - Usar números aleatórios
     * - Controlar tentativas
     * - Dar dicas ao usuário
     */
    public static void main(String[] args) {
        jogarAdivinhacao();
    }

    /**
     * Executa o jogo de adivinhação completo.
     */
    public static void jogarAdivinhacao() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int NUMERO_SECRETO = random.nextInt(100) + 1;
        final int MAX_TENTATIVAS = 7;
        
        System.out.println("Adivinhe o número secreto entre 1 e 100.");
        
        boolean acertou = false;
        for (int tentativa = 1; tentativa <= MAX_TENTATIVAS; tentativa++) {
            System.out.print("Tentativa " + tentativa + ": ");
            int palpite = scanner.nextInt();
            
            if (palpite == NUMERO_SECRETO) {
                System.out.println("Parabéns! Você acertou o número " + NUMERO_SECRETO + " em " + tentativa + " tentativas!");
                acertou = true;
                break;
            } else if (palpite < NUMERO_SECRETO) {
                System.out.println("Muito baixo!");
            } else {
                System.out.println("Muito alto!");
            }
        }
        
        if (!acertou) {
            System.out.println("\nVocê excedeu as 7 tentativas. O número era " + NUMERO_SECRETO + ".");
        }
        
        scanner.close();
    }
}