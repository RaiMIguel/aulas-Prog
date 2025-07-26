import java.util.Scanner;
import java.util.Arrays;

public class Questoes42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavraSecreta = "JAVA".toUpperCase();
        char[] letrasDescobertas = new char[palavraSecreta.length()];
        Arrays.fill(letrasDescobertas, '_');

        int tentativasRestantes = 6;
        String letrasTentadas = "";
        boolean jogoGanho = false;

        System.out.println("Bem-vindo ao Jogo da Forca!");

        while (tentativasRestantes > 0 && !jogoGanho) {
            System.out.println("\nPalavra: " + String.valueOf(letrasDescobertas));
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.println("Letras tentadas: " + letrasTentadas);

            System.out.print("Letra: ");
            String entrada = scanner.next().toUpperCase();

            if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                System.out.println("Por favor, digite apenas uma letra.");
                continue;
            }

            char letra = entrada.charAt(0);

            if (letrasTentadas.indexOf(letra) != -1) {
                System.out.println("Você já tentou esta letra. Tente outra.");
                continue;
            }

            letrasTentadas += letra;
            boolean letraEncontrada = false;

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    letrasDescobertas[i] = letra;
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                System.out.println("Letra não encontrada!");
                tentativasRestantes--;
            }

            if (String.valueOf(letrasDescobertas).equals(palavraSecreta)) {
                jogoGanho = true;
            }
        }

        System.out.println("\nPalavra: " + String.valueOf(letrasDescobertas));
        if (jogoGanho) {
            System.out.println("Parabéns! Você venceu!");
        } else {
            System.out.println("Suas tentativas acabaram! A palavra era: " + palavraSecreta);
            System.out.println("Game Over!");
        }

        scanner.close();
    }
}