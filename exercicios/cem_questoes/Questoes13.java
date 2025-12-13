import java.util.Scanner;

public class Questoes13 {

    /**
     * @param args
     * Enunciado: Use Scanner para ler o nome do usuário e exiba uma
     * mensagem de boas-vindas personalizada.
     *
     * Objetivos:
     * - Importar e usar Scanner
     * - Ler entrada do usuário
     * - Concatenar strings
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Bem-vindo(a) à Vila da Folha, " + nome + "!");
        
        scanner.close();
    }
}