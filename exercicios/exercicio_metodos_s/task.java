package exercicios.exercicio_metodos_s;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "A vontade do fogo vive em Konoha";

        System.out.println("Tamanho da frase: " + frase.length());
        String fraseTrocada = frase.replace("fogo", "raio");
        System.out.println("Frase com troca: " + fraseTrocada);
        System.out.println("Frase em maiúsculas: " + frase.toUpperCase());

        System.out.print("Digite o nome de um personagem: ");
        String personagem = scanner.nextLine();

        if (personagem.toUpperCase().startsWith("N")) {
            System.out.println("O nome começa com a letra N.");
        } else {
            System.out.println("O nome NÃO começa com a letra N.");
        }

        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Naruto");
        mensagem.append(" treinou com ");
        mensagem.append("Jiraiya");
        mensagem.append(" em ");
        mensagem.append("Konoha.");

        System.out.println("Mensagem montada: " + mensagem.toString());

        scanner.close();
    }
}
