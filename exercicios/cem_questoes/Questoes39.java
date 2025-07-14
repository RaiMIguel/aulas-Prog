import java.util.Random;
import java.util.Scanner;

public class Questoes39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
        int tentativasMaximas = 7;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar um número entre 1 e 100.");
        System.out.println("Você tem " + tentativasMaximas + " tentativas.");

        for (int tentativa = 1; tentativa <= tentativasMaximas; tentativa++) {
            System.out.print("Tentativa " + tentativa + ": ");
            int palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativa + " tentativas!");
                acertou = true;
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else {
                System.out.println("Muito alto!");
            }
        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram! O número secreto era " + numeroSecreto + ".");
        }

        scanner.close();
    }
}