import java.util.Scanner;

public class Questoes98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONVERSOR DE NOTAS ===");
        System.out.print("\nDigite a nota (0-100): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            System.out.print("Digite a nota (0-100): ");
            scanner.next();
        }
        int nota = scanner.nextInt();

        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Por favor, insira um valor entre 0 e 100.");
            scanner.close();
            return;
        }

        System.out.println("\nNota inserida: " + nota);
        System.out.println("\nAnálise:");

        String conceito;
        String status;
        String observacao;

        // Usando divisão por 10 para criar faixas para o switch
        int faixa = nota / 10;

        switch (faixa) {
            case 10: // Notas 100
            case 9:  // Notas 90-99
                conceito = "A";
                status = "Aprovado";
                observacao = "Excelente desempenho";
                break;
            case 8:  // Notas 80-89
                conceito = "B";
                status = "Aprovado";
                observacao = "Bom desempenho";
                break;
            case 7:  // Notas 70-79
                conceito = "C";
                status = "Aprovado";
                observacao = "Regular";
                break;
            case 6:  // Notas 60-69
                conceito = "D";
                status = "Insuficiente";
                observacao = "Precisa melhorar";
                break;
            default: // Notas 0-59
                conceito = "F";
                status = "Reprovado";
                observacao = "Reprovado";
                break;
        }

        System.out.println("Faixa: " + (faixa * 10) + "-" + ((faixa * 10) + 9));
        System.out.println("Conceito: " + conceito);
        System.out.println("Status: " + status);
        System.out.println("Observação: " + observacao);

        System.out.println("\nDistribuição de conceitos:");
        System.out.println("A (90-100): Excelente");
        System.out.println("B (80-89): Bom");
        System.out.println("C (70-79): Regular");
        System.out.println("D (60-69): Insuficiente");
        System.out.println("F (0-59): Reprovado");

        scanner.close();
    }
}