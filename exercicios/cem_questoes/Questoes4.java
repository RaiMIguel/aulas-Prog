
public class Questoes4 {

    /**
     * @param args
     *             Escreva um programa que determine qual dos três números é o
     *             maior. Use os valores: 23, 67, 45.
     *             Objetivos**:
     *             - Usar estruturas de decisão (if/else)
     *             - Comparar múltiplos valores
     *             - Trabalhar com variáveis
     * @Return O maior número é: maiorValor
     */
    public static void main(String[] args) {
       int[] valores = {23,67,45};

       int maiorValor = valores[0];
       for (int i = 1; i < valores.length; i++) {
            if (maiorValor < valores[i]) {
                maiorValor = valores[i];
            }
       }
        System.out.println("O maior número é: " + maiorValor);
    }
}
