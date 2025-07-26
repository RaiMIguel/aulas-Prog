public class Questoes45 {
    public static void main(String[] args) {
        int[] notas = {8, 6, 9, 7, 10, 5, 8, 9};

        int somaTotal = 0;

        System.out.print("Notas: [");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + (i == notas.length - 1 ? "" : ", "));
            somaTotal += notas[i];
        }
        System.out.println("]");

        int quantidadeNotas = notas.length;
        double media = (double) somaTotal / quantidadeNotas;

        System.out.println("Soma total: " + somaTotal);
        System.out.println("Quantidade de notas: " + quantidadeNotas);
        System.out.printf("Média: %.2f%n", media);
    }
}