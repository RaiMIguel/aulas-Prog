import java.util.Arrays;
import java.util.Scanner;

public class Questoes42 {

    /**
     * @param args
     * Enunciado: Implemente o jogo da forca com uma palavra predefinida.
     * O jogador tem 6 tentativas erradas. Palavra: “JAVA”.
     *
     * Objetivos:
     * - Manipular strings
     * - Controlar estado do jogo
     * - Interface de usuário
     */
    public static void main(String[] args) {
        jogarForca();
    }

    /**
     * Implementa a lógica do jogo da forca.
     */
    public static void jogarForca() {
        Scanner scanner = new Scanner(System.in);
        String palavraSecreta = "JAVA";
        char[] palavraAdivinhada = new char[palavraSecreta.length()];
        Arrays.fill(palavraAdivinhada, '_');

        int tentativasRestantes = 6;
        boolean venceu = false;

        while (tentativasRestantes > 0 && !venceu) {
            System.out.println("\nPalavra: " + String.valueOf(palavraAdivinhada));
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            
            System.out.print("\nLetra: ");
            char palpite = scanner.nextLine().toUpperCase().charAt(0);
            
            boolean letraEncontrada = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == palpite) {
                    palavraAdivinhada[i] = palpite;
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                tentativasRestantes--;
                System.out.println("Letra não encontrada!");
            }
            
            if (String.valueOf(palavraAdivinhada).equals(palavraSecreta)) {
                venceu = true;
            }
        }

        System.out.println("\nPalavra: " + String.valueOf(palavraAdivinhada));
        if (venceu) {
            System.out.println("Parabéns! Você venceu!");
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
        }

        scanner.close();
    }
}