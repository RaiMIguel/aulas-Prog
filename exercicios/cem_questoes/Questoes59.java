import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Questoes59 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(45, 23, 67, 12, 89, 34));

        System.out.println("Lista original: " + numeros.toString());

        // Ordenar crescente
        ArrayList<Integer> numerosCrescente = new ArrayList<>(numeros); // Criar cópia
        Collections.sort(numerosCrescente);
        System.out.println("\nOrdem crescente: " + numerosCrescente.toString());

        // Ordenar decrescente
        ArrayList<Integer> numerosDecrescente = new ArrayList<>(numeros); // Criar outra cópia
        Collections.sort(numerosDecrescente, Collections.reverseOrder());
        System.out.println("Ordem decrescente: " + numerosDecrescente.toString());
    }
}