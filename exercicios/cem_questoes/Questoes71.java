import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Questoes71 {

    /**
     * @param args
     * Enunciado: Encontre o elemento mais frequente em uma matriz.
     *
     * Objetivos:
     * - Contar frequência de elementos
     * - Encontrar o mais comum
     * - Lidar com empates
     */
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 2},
            {4, 2, 1, 3},
            {2, 4, 2, 1}
        };

        System.out.println("Matriz:");
        exibirMatriz(matriz);

        encontrarMaisFrequente(matriz);
    }

    /**
     * Exibe uma matriz de inteiros, formatada.
     * @param matriz A matriz a ser exibida.
     */
    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%d ", elemento);
            }
            System.out.println();
        }
    }

    /**
     * Encontra e exibe o elemento mais frequente em uma matriz.
     * @param matriz A matriz de inteiros.
     */
    public static void encontrarMaisFrequente(int[][] matriz) {
        Map<Integer, Integer> frequencias = new HashMap<>();
        
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                frequencias.put(elemento, frequencias.getOrDefault(elemento, 0) + 1);
            }
        }
        
        System.out.println("\nContagem de frequências:");
        int maxFrequencia = 0;
        for (Map.Entry<Integer, Integer> entry : frequencias.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " vezes");
            if (entry.getValue() > maxFrequencia) {
                maxFrequencia = entry.getValue();
            }
        }
        
        System.out.print("\nElemento mais frequente: ");
        StringBuilder maisFrequentes = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : frequencias.entrySet()) {
            if (entry.getValue() == maxFrequencia) {
                maisFrequentes.append(entry.getKey()).append(" ");
            }
        }
        System.out.println(maisFrequentes.toString().trim() + " (aparece " + maxFrequencia + " vezes)");
    }
}