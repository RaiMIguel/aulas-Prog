import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questoes91 {

    /**
     * @param args
     * Enunciado: Crie uma calculadora usando métodos para cada operação.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> estatisticas = new HashMap<>();
        estatisticas.put("Soma", 0);
        estatisticas.put("Subtração", 0);
        estatisticas.put("Multiplicação", 0);
        estatisticas.put("Divisão", 0);
        estatisticas.put("Potência", 0);
        int divisoesPorZeroEvitadas = 0;
        int operacoesRealizadas = 0;

        int opcao;
        do {
            System.out.println("\n=== CALCULADORA MODULAR ===");
            System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Potência\n0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 5) {
                System.out.print("Primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.printf("%.1f + %.1f = %.1f%n", num1, num2, somar(num1, num2));
                        estatisticas.put("Soma", estatisticas.get("Soma") + 1);
                        break;
                    case 2:
                        System.out.printf("%.1f - %.1f = %.1f%n", num1, num2, subtrair(num1, num2));
                        estatisticas.put("Subtração", estatisticas.get("Subtração") + 1);
                        break;
                    case 3:
                        System.out.printf("%.1f * %.1f = %.1f%n", num1, num2, multiplicar(num1, num2));
                        estatisticas.put("Multiplicação", estatisticas.get("Multiplicação") + 1);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                            divisoesPorZeroEvitadas++;
                        } else {
                            System.out.printf("%.1f / %.1f = %.2f%n", num1, num2, dividir(num1, num2));
                            estatisticas.put("Divisão", estatisticas.get("Divisão") + 1);
                        }
                        break;
                    case 5:
                        System.out.printf("%.1f ^ %.1f = %.2f%n", num1, num2, potencia(num1, num2));
                        estatisticas.put("Potência", estatisticas.get("Potência") + 1);
                        break;
                }
                operacoesRealizadas++;
            } else if (opcao != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("\nCalculadora encerrada!");
        System.out.println("\nEstatísticas da sessão:");
        System.out.println("- Operações realizadas: " + operacoesRealizadas);
        System.out.println("- Soma: " + estatisticas.get("Soma") + " vez(es)");
        System.out.println("- Subtração: " + estatisticas.get("Subtração") + " vez(es)");
        System.out.println("- Multiplicação: " + estatisticas.get("Multiplicação") + " vez(es)");
        System.out.println("- Divisão: " + estatisticas.get("Divisão") + " vez(es)");
        System.out.println("- Potência: " + estatisticas.get("Potência") + " vez(es)");
        System.out.println("- Divisão por zero evitada: " + divisoesPorZeroEvitadas + " vez(es)");

        scanner.close();
    }

    public static double somar(double a, double b) { return a + b; }
    public static double subtrair(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) { return a / b; }
    public static double potencia(double a, double b) { return Math.pow(a, b); }
}