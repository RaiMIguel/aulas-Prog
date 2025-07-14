import java.util.Scanner;

public class Questoes26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota (0-100): ");
        int nota = scanner.nextInt();

        String conceito;
        String status;

        if (nota >= 0 && nota <= 100) {
            if (nota >= 90) {
                conceito = "A";
                status = "Aprovado";
            } else if (nota >= 80) {
                conceito = "B";
                status = "Aprovado";
            } else if (nota >= 70) {
                conceito = "C";
                status = "Aprovado com ressalvas";
            } else if (nota >= 60) {
                conceito = "D";
                status = "Reprovado";
            } else {
                conceito = "F";
                status = "Reprovado";
            }
            System.out.println("Nota: " + nota);
            System.out.println("Conceito: " + conceito);
            System.out.println("Status: " + status);
        } else {
            System.out.println("Erro: Nota inválida. Digite um valor entre 0 e 100.");
        }

        scanner.close();
    }
}