import java.util.Arrays;
import java.util.Scanner;

public class Questoes52 {

    /**
     * @param args
     * Enunciado: Implemente busca binária em um array ordenado.
     *
     * Objetivos:
     * - Implementar algoritmo eficiente
     * - Usar divisão e conquista
     * - Mostrar processo de busca
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {5, 12, 18, 25, 33, 47, 56, 69, 78, 84};
        
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
        System.out.print("Digite o valor a buscar: ");
        int valor = scanner.nextInt();
        
        System.out.println("\nBusca binária por " + valor + ":");
        int comparacoes = 0;
        int posicao = buscaBinaria(numeros, valor, comparacoes);
        
        if (posicao != -1) {
            System.out.println("Valor encontrado na posição " + posicao);
        } else {
            System.out.println("Valor não encontrado.");
        }
        
        scanner.close();
    }

    /**
     * Realiza uma busca binária em um array ordenado, mostrando o processo.
     * @param array O array ordenado para a busca.
     * @param valor O valor a ser procurado.
     * @param contador Referência para um contador de comparações.
     * @return A posição do valor se encontrado, ou -1 caso contrário.
     */
    public static int buscaBinaria(int[] array, int valor, int contador) {
        int inicio = 0;
        int fim = array.length - 1;
        
        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            contador++;
            System.out.println("Início=" + inicio + ", Fim=" + fim + ", Meio=" + meio + ", Valor=" + array[meio] + ((array[meio] == valor) ? " ✓" : ""));
            
            if (array[meio] == valor) {
                System.out.println("Comparações realizadas: " + contador);
                return meio;
            }
            if (array[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("Comparações realizadas: " + contador);
        return -1;
    }
}