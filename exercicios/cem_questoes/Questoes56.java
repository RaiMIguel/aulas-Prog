import java.util.ArrayList;
import java.util.Arrays;

public class Questoes56 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(15, 23, 8, 42, 17, 31));

        int somaTotal = 0;
        StringBuilder processoSoma = new StringBuilder();

        System.out.println("Lista de números: " + numeros.toString());
        System.out.println("Calculando soma...");

        boolean primeiro = true;
        for (int numero : numeros) {
            if (!primeiro) {
                processoSoma.append(" + ");
            }
            processoSoma.append(numero);
            somaTotal += numero;
            primeiro = false;
        }

        System.out.println(processoSoma.toString() + " = " + somaTotal);
        System.out.println("Soma total: " + somaTotal);
    }
}