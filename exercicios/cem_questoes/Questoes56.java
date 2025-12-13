import java.util.ArrayList;
import java.util.Arrays;

public class Questoes56 {

    /**
     * @param args
     * Enunciado: Percorra um ArrayList de números usando for-each e calcule a soma.
     * Números: {15, 23, 8, 42, 17, 31}
     *
     * Objetivos:
     * - Usar for-each loop
     * - Acumular valores
     * - Trabalhar com generics
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(15, 23, 8, 42, 17, 31));
        
        System.out.println("Lista de números: " + numeros);
        
        calcularESomar(numeros);
    }

    /**
     * Calcula e exibe a soma dos elementos de um ArrayList de inteiros.
     * @param numeros A lista de números.
     */
    public static void calcularESomar(ArrayList<Integer> numeros) {
        System.out.println("Calculando soma...");
        int soma = 0;
        
        StringBuilder processo = new StringBuilder();
        for (Integer num : numeros) {
            soma += num;
            processo.append(num).append(" + ");
        }
        
        // Remove o último " + "
        if (processo.length() > 0) {
            processo.setLength(processo.length() - 3);
        }
        
        System.out.println(processo.toString() + " = " + soma);
        System.out.println("Soma total: " + soma);
    }
}