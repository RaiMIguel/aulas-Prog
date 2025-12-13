public class Questoes36 {

    /**
     * @param args
     * Enunciado: Implemente a sequência de Fibonacci até o 15º termo.
     *
     * Objetivos:
     * - Implementar sequência matemática
     * - Trabalhar com variáveis auxiliares
     * - Controlar quantidade de termos
     */
    public static void main(String[] args) {
        int termos = 15;
        imprimirFibonacci(termos);
    }

    /**
     * Imprime a sequência de Fibonacci até o número de termos especificado.
     * @param termos O número de termos da sequência a serem exibidos.
     */
    public static void imprimirFibonacci(int termos) {
        System.out.println("Sequência de Fibonacci (" + termos + " termos):");
        int a = 0;
        int b = 1;
        
        for (int i = 0; i < termos; i++) {
            System.out.print(a + " ");
            int soma = a + b;
            a = b;
            b = soma;
        }
        System.out.println();
    }
}