import java.util.Scanner;

public class Questoes17 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Remove espaços extras no início e fim, e divide a frase por um ou mais espaços
        String[] palavras = frase.trim().split("\\s+");

        // Conta o número de elementos no array de palavras
        // Se a frase for vazia ou contiver apenas espaços, split() pode retornar um array com um elemento vazio.
        // É importante verificar se a frase original não é vazia antes de contar.
        int numeroDePalavras = 0;
        if (!frase.trim().isEmpty()) {
            numeroDePalavras = palavras.length;
        }

        System.out.println("Frase digitada: \"" + frase + "\"");
        System.out.println("Número de palavras: " + numeroDePalavras);

        scanner.close();
    }
}
