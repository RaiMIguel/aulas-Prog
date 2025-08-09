import java.util.Arrays;

public class Questoes45 {

    /**
     * @param args
     * Enunciado: Calcule a média dos elementos de um array.
     * Dados: {8, 6, 9, 7, 10, 5, 8, 9}
     *
     * Objetivos:
     * - Somar elementos do array
     * - Calcular média aritmética
     * - Trabalhar com decimais
     */
    public static void main(String[] args) {
        int[] notas = {8, 6, 9, 7, 10, 5, 8, 9};
        
        System.out.println("Notas: " + Arrays.toString(notas));

        int soma = somarElementos(notas);
        double media = calcularMedia(soma, notas.length);

        System.out.println("Soma total: " + soma);
        System.out.println("Quantidade de notas: " + notas.length);
        System.out.printf("Média: %.2f%n", media);
    }

    /**
     * Soma todos os elementos de um array de inteiros.
     * @param array O array de números.
     * @return A soma total dos elementos.
     */
    public static int somarElementos(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    /**
     * Calcula a média de uma soma de valores.
     * @param soma A soma total dos valores.
     * @param quantidade A quantidade de valores.
     * @return A média dos valores.
     */
    public static double calcularMedia(int soma, int quantidade) {
        return (double) soma / quantidade;
    }
}