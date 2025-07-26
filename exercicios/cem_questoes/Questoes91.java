import java.util.Scanner;

public class Questoes91 {

    private static int operacoesRealizadas = 0;
    private static int somaCount = 0;
    private static int subtracaoCount = 0;
    private static int multiplicacaoCount = 0;
    private static int divisaoCount = 0;
    private static int potenciaCount = 0;
    private static int divisaoPorZeroEvitada = 0;

    public static double somar(double a, double b) {
        somaCount++;
        return a + b;
    }

    public static double subtrair(double a, double b) {
        subtracaoCount++;
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        multiplicacaoCount++;
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não permitida!");
            divisaoPorZeroEvitada++;
            return Double.NaN; // Not a Number
        }
        divisaoCount++;
        return a / b;
    }

    public static double potencia(double base, double expoente) {
        potenciaCount++;
        return Math.pow(base, expoente);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("=== CALCULADORA MODULAR ===");

        do {
            System.out.println("\n1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            // Validação de entrada
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número para a opção.");
                System.out.print("Opção: ");
                scanner.next();
            }
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 5) {
                System.out.print("Primeiro número: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Entrada inválida. Digite um número.");
                    System.out.print("Primeiro número: ");
                    scanner.next();
                }
                double num1 = scanner.nextDouble();

                System.out.print("Segundo número: ");
                 while (!scanner.hasNextDouble()) {
                    System.out.println("Entrada inválida. Digite um número.");
                    System.out.print("Segundo número: ");
                    scanner.next();
                }
                double num2 = scanner.nextDouble();
                
                double resultado = 0;
                boolean operacaoValida = true;
                String operacaoSimbolo = "";

                switch (opcao) {
                    case 1:
                        resultado = somar(num1, num2);
                        operacaoSimbolo = "+";
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        operacaoSimbolo = "-";
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        operacaoSimbolo = "*";
                        break;
                    case 4:
                        resultado = dividir(num1, num2);
                        operacaoSimbolo = "/";
                        if (Double.isNaN(resultado)) operacaoValida = false; // Divisão por zero
                        break;
                    case 5:
                        resultado = potencia(num1, num2);
                        operacaoSimbolo = "^";
                        break;
                }

                if (operacaoValida) {
                    System.out.printf("%.1f %s %.1f = %.1f%n", num1, operacaoSimbolo, num2, resultado);
                    operacoesRealizadas++;
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }

            if (opcao != 0) {
                System.out.print("\nDeseja fazer outra operação? (s/n): ");
                scanner.nextLine(); // Consumir a nova linha pendente
                String continuar = scanner.nextLine().trim().toLowerCase();
                if (!continuar.equals("s")) {
                    opcao = 0; // Sai do loop
                }
            }

        } while (opcao != 0);

        System.out.println("\nCalculadora encerrada!");
        System.out.println("\nEstatísticas da sessão:");
        System.out.println("- Operações realizadas: " + operacoesRealizadas);
        System.out.println("- Soma: " + somaCount + " vez(es)");
        System.out.println("- Subtração: " + subtracaoCount + " vez(es)");
        System.out.println("- Multiplicação: " + multiplicacaoCount + " vez(es)");
        System.out.println("- Divisão: " + divisaoCount + " vez(es)");
        System.out.println("- Potência: " + potenciaCount + " vez(es)");
        System.out.println("- Divisão por zero evitada: " + divisaoPorZeroEvitada + " vez(es)");

        scanner.close();
    }
}