import java.util.Random;
import java.util.Scanner;

public class Questoes27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Escolha: 1-Pedra, 2-Papel, 3-Tesoura: ");
        int escolhaUsuario = scanner.nextInt();

        int escolhaComputador = random.nextInt(3) + 1; // 1, 2 ou 3

        String nomeEscolhaUsuario = "";
        String nomeEscolhaComputador = "";
        String resultado = "";

        switch (escolhaUsuario) {
            case 1:
                nomeEscolhaUsuario = "Pedra";
                break;
            case 2:
                nomeEscolhaUsuario = "Papel";
                break;
            case 3:
                nomeEscolhaUsuario = "Tesoura";
                break;
            default:
                System.out.println("Escolha inválida. Por favor, digite 1, 2 ou 3.");
                scanner.close();
                return;
        }

        switch (escolhaComputador) {
            case 1:
                nomeEscolhaComputador = "Pedra";
                break;
            case 2:
                nomeEscolhaComputador = "Papel";
                break;
            case 3:
                nomeEscolhaComputador = "Tesoura";
                break;
        }

        System.out.println("Você escolheu: " + nomeEscolhaUsuario);
        System.out.println("Computador escolheu: " + nomeEscolhaComputador);

        if (escolhaUsuario == escolhaComputador) {
            resultado = "Empate!";
        } else if ((escolhaUsuario == 1 && escolhaComputador == 3) ||
                   (escolhaUsuario == 2 && escolhaComputador == 1) ||
                   (escolhaUsuario == 3 && escolhaComputador == 2)) {
            resultado = "Você ganhou!";
        } else {
            resultado = "Computador ganhou!";
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}