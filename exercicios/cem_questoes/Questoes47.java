import java.util.Arrays;

public class Questoes47 {

    /**
     * @param args
     * Enunciado: Conte quantos números pares e ímpares existem em um array.
     * Dados: {12, 7, 18, 23, 4, 15, 30, 9}
     *
     * Objetivos:
     * - Classificar elementos
     * - Contar categorias
     * - Usar operador módulo
     */
    public static void main(String[] args) {
        int[] numeros = {12, 7, 18, 23, 4, 15, 30, 9};
        
        System.out.println("Array: " + Arrays.toString(numeros));
        
        contarParesEImpares(numeros);
    }

    /**
     * Conta e exibe a quantidade de números pares e ímpares em um array.
     * @param array O array de números a ser analisado.
     */
    public static void contarParesEImpares(int[] array) {
        int pares = 0;
        int impares = 0;
        StringBuilder paresValores = new StringBuilder();
        StringBuilder imparesValores = new StringBuilder();

        for (int numero : array) {
            if (numero % 2 == 0) {
                pares++;
                paresValores.append(numero).append(", ");
            } else {
                impares++;
                imparesValores.append(numero).append(", ");
            }
        }
        
        String strPares = paresValores.length() > 0 ? paresValores.substring(0, paresValores.length() - 2) : "";
        String strImpares = imparesValores.length() > 0 ? imparesValores.substring(0, imparesValores.length() - 2) : "";

        System.out.println("Números pares: " + pares + " (valores: " + strPares + ")");
        System.out.println("Números ímpares: " + impares + " (valores: " + strImpares + ")");
    }
}