import java.util.Scanner;

public class Questoes14 {

    /**
     * @param args
     *             Enunciado: Leia dois números inteiros e exiba sua soma,
     *             subtração,
     *             multiplicação e divisão.
     *
     *             Objetivos:
     *             - Ler múltiplas entradas
     *             - Realizar operações básicas
     *             - Formatar saídas
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = {0,0};
        System.out.print("Digite o primeiro número: ");
        valores[0] = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        valores[1] = scanner.nextInt();


        exibirValores(valores);



        scanner.close();
    }

    public static double soma(int[] valores) {
        double resultado = 0;
        for (int valor : valores) {
            resultado += valor;
        }

        return resultado;
    }

    public static double subtrai(int[] valores) {
        double resultado = valores[0];

        for (int i = 1; i < valores.length; i++) {
            resultado -= valores[i];
        }

        return resultado;
    }

    public static double multiplica(int[] valores) {
        double resultado = 1;
        for (int valor : valores) {
            resultado *= valor;
        }
        return resultado;
    }

    public static double divide(int[] valores) {
        double resultado = valores[0];

        for (int i = 1; i < valores.length; i++) {
            resultado /= valores[i];
        }

        return resultado;
    
    }

     public static void exibirValores(int[] valores) {
               System.out.println("\n=== CALCULADORA BÁSICA ===");
        System.out.println(valores[0] + " + " + valores[1] + " = " + soma(valores));
        System.out.println(valores[0] + " - " + valores[1] + " = " + subtrai(valores));
        System.out.println(valores[0] + " × " + valores[1] + " = " + multiplica(valores));
        System.out.printf("%d ÷ %d = %.2f%n", valores[0], valores[1], divide(valores));
        
     }
}

