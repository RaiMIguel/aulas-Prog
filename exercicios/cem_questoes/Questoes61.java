import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Questoes61 {

    /**
     * @param args
     * Enunciado: Implemente remoção de elementos por critério específico.
     * Remova todos os números pares de um ArrayList.
     *
     * Objetivos:
     * - Remover múltiplos elementos
     * - Usar critério para remoção
     * - Evitar problemas de índice
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(12, 7, 18, 23, 4, 15, 30, 9, 6));
        
        System.out.println("Lista original: " + numeros);
        System.out.println("\nRemovendo números pares...");
        
        removerPares(numeros);
        
        System.out.println("Lista final: " + numeros);
        System.out.println("Elementos removidos: " + (9 - numeros.size()));
    }

    /**
     * Remove todos os números pares de um ArrayList, mostrando o processo.
     * @param lista A lista de números a ser modificada.
     */
    public static void removerPares(ArrayList<Integer> lista) {
        Iterator<Integer> iterator = lista.iterator();
        StringBuilder removidos = new StringBuilder();

        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (numero % 2 == 0) {
                removidos.append(numero).append(", ");
                iterator.remove();
            }
        }
        
        String strRemovidos = removidos.length() > 0 ? removidos.substring(0, removidos.length() - 2) : "";
        System.out.println("Números removidos: " + strRemovidos);
        System.out.println();
    }
}