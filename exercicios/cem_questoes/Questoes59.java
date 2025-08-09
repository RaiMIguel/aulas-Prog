import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Questoes59 {

    /**
     * @param args
     * Enunciado: Ordene um ArrayList de números em ordem crescente e decrescente.
     *
     * Objetivos:
     * - Usar Collections.sort()
     * - Ordenar em ambas as direções
     * - Comparar resultados
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(45, 23, 67, 12, 89, 34));
        
        System.out.println("Lista original: " + numeros);
        
        // Cópia para preservar a original
        ArrayList<Integer> listaCrescente = new ArrayList<>(numeros);
        Collections.sort(listaCrescente);
        System.out.println("\nOrdem crescente: " + listaCrescente);

        // Cópia para decrescente
        ArrayList<Integer> listaDecrescente = new ArrayList<>(numeros);
        Collections.sort(listaDecrescente, Collections.reverseOrder());
        System.out.println("Ordem decrescente: " + listaDecrescente);
    }
}