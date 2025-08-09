import java.util.Scanner;

public class Questoes26 {

    /**
     * @param args
     * Enunciado: Crie um sistema de conceitos baseado na nota: A (90-100),
     * B (80-89), C (70-79), D (60-69), F (0-59). Notas fora da faixa são inválidas.
     *
     * Objetivos:
     * - Trabalhar com faixas numéricas
     * - Validar intervalos
     * - Sistema de classificação
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota (0-100): ");
        double nota = scanner.nextDouble();
        
        String conceito = obterConceito(nota);
        String status = obterStatus(conceito);

        if (conceito.equals("Nota inválida")) {
            System.out.println(conceito);
        } else {
            System.out.println("Nota: " + (int) nota);
            System.out.println("Conceito: " + conceito);
            System.out.println("Status: " + status);
        }
        
        scanner.close();
    }

    /**
     * Obtém o conceito (A, B, C, D, F) de uma nota.
     * @param nota A nota a ser avaliada.
     * @return A string do conceito ou "Nota inválida" se fora da faixa.
     */
    public static String obterConceito(double nota) {
        if (nota >= 90 && nota <= 100) {
            return "A";
        } else if (nota >= 80 && nota < 90) {
            return "B";
        } else if (nota >= 70 && nota < 80) {
            return "C";
        } else if (nota >= 60 && nota < 70) {
            return "D";
        } else if (nota >= 0 && nota < 60) {
            return "F";
        } else {
            return "Nota inválida";
        }
    }

    /**
     * Obtém o status de aprovação com base no conceito.
     * @param conceito O conceito (A, B, C, D, F).
     * @return O status de aprovação.
     */
    public static String obterStatus(String conceito) {
        return (conceito.equals("A") || conceito.equals("B")) ? "Aprovado" :
               (conceito.equals("C")) ? "Aprovado com ressalvas" :
               (conceito.equals("D") || conceito.equals("F")) ? "Reprovado" : "";
    }
}