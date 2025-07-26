import java.util.Scanner;
import java.util.Arrays;

public class Questoes52 {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 18, 25, 33, 47, 56, 69, 78, 84};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
        System.out.print("Digite o valor a buscar: ");
        int valorBuscar = scanner.nextInt();

        System.out.println("Busca binária por " + valorBuscar + ":");

        int inicio = 0;
        int fim = numeros.length - 1;
        int meio;
        int comparacoes = 0;
        int posicao = -1;

        while (inicio <= fim) {
            meio = inicio + (fim - inicio) / 2;
            comparacoes++;
            System.out.println("Início=" + inicio + ", Fim=" + fim + ", Meio=" + meio + ", Valor=" + numeros[meio]);

            if (numeros[meio] == valorBuscar) {
                posicao = meio;
                System.out.println("Valor encontrado na posição " + posicao + " ✓");
                break;
            } else if (numeros[meio] < valorBuscar) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (posicao == -1) {
            System.out.println("Valor " + valorBuscar + " não encontrado.");
        }
        System.out.println("Comparações realizadas: " + comparacoes);

        scanner.close();
    }
}