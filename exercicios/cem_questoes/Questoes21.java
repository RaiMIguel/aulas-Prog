import java.util.Scanner;

public class Questoes21 {

    /**
     * @param args
     * Enunciado: Leia a idade de uma pessoa e determine se ela é maior de idade (≥18 anos).
     *
     * Objetivos:
     * - Comparação com valor fixo
     * - Decisão binária simples
     * - Validação de idade
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        String status = (idade >= 18) ? "maior de idade" : "menor de idade";
        
        System.out.println("Com " + idade + " anos, você é " + status + ".");
        
        scanner.close();
    }
}