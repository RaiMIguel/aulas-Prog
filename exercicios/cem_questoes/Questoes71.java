import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Questoes71 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 2},
            {4, 2, 1, 3},
            {2, 4, 2, 1}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        Map<Integer, Integer> frequencias = new HashMap<>();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int elemento = matriz[i][j];
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
        ArrayList<Integer> elementosMaisFrequentes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencias.entrySet()) {
            if (entry.getValue() == maxFrequencia) {
                elementosMaisFrequentes.add(entry.getKey());
            }
        }

        for (int i = 0; i < elementosMaisFrequentes.size(); i++) {
            System.out.print(elementosMaisFrequentes.get(i));
            if (i < elementosMaisFrequentes.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" (aparece " + maxFrequencia + " vezes)");
    }
}