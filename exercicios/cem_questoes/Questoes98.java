import java.util.Scanner;

public class Questoes98 {

    /**
     * @param args
     * Enunciado: Implemente um conversor de notas numéricas para conceitos usando switch case.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== CONVERSOR DE NOTAS ===");
        System.out.print("\nDigite a nota (0-100): ");
        int nota = scanner.nextInt();

        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 100.");
        } else {
            converterNotaParaConceito(nota);
        }
        
        scanner.close();
    }

    /**
     * Converte uma nota numérica para um conceito e exibe o resultado detalhado.
     * @param nota A nota numérica (0-100).
     */
    public static void converterNotaParaConceito(int nota) {
        String conceito;
        String status;
        String observacao;
        
        switch (nota / 10) {
            case 10:
            case 9:
                conceito = "A";
                status = "Aprovado";
                observacao = "Excelente";
                break;
            case 8:
                conceito = "B";
                status = "Aprovado";
                observacao = "Bom desempenho";
                break;
            case 7:
                conceito = "C";
                status = "Aprovado";
                observacao = "Desempenho regular";
                break;
            case 6:
                conceito = "D";
                status = "Reprovado";
                observacao = "Desempenho insuficiente";
                break;
            default:
                conceito = "F";
                status = "Reprovado";
                observacao = "Reprovado";
                break;
        }

        System.out.println("\nNota inserida: " + nota);
        System.out.println("\nAnálise:");
        System.out.println("Conceito: " + conceito);
        System.out.println("Status: " + status);
        System.out.println("Observação: " + observacao);
        
        System.out.println("\nDistribuição de conceitos:");
        System.out.println("A (90-100): Excelente");
        System.out.println("B (80-89): Bom");
        System.out.println("C (70-79): Regular");
        System.out.println("D (60-69): Insuficiente");
        System.out.println("F (0-59): Reprovado");
    }
}