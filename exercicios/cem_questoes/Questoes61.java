import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Questoes61 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(12, 7, 18, 23, 4, 15, 30, 9, 6));

        System.out.println("Lista original: " + numeros.toString());
        System.out.println("\nRemovendo números pares...");

        StringBuilder numerosRemovidosStr = new StringBuilder();
        int contRemovidos = 0;

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (numero % 2 == 0) {
                numerosRemovidosStr.append(numero).append(", ");
                iterator.remove();
                contRemovidos++;
            }
        }
        
        if (numerosRemovidosStr.length() > 0) {
            numerosRemovidosStr.setLength(numerosRemovidosStr.length() - 2); // Remove a última ", "
        }
        System.out.println("Números removidos: " + numerosRemovidosStr.toString());

        System.out.println("\nLista final: " + numeros.toString());
        System.out.println("Elementos removidos: " + contRemovidos);
    }
}