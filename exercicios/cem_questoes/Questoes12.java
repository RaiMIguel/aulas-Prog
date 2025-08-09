public class Questoes12 {

    /**
     * @param args
     * Enunciado: Crie um programa que demonstre casting explícito.
     * Converta o double 9.8765 para int e mostre a perda de precisão.
     *
     * Objetivos:
     * - Usar casting explícito
     * - Demonstrar perda de dados
     * - Comparar valores antes e depois
     */
    public static void main(String[] args) {
        double valorOriginal = 9.8765;
        demonstrarCasting(valorOriginal);
    }

    /**
     * Demonstra o casting explícito de um double para int.
     * @param valorOriginal O valor double a ser convertido.
     */
    public static void demonstrarCasting(double valorOriginal) {
        int valorAposCasting = (int) valorOriginal;
        double precisaoPerdida = valorOriginal - valorAposCasting;

        System.out.println("Valor original (double): " + valorOriginal);
        System.out.println("Valor após casting (int): " + valorAposCasting);
        System.out.printf("Precisão perdida: %.4f \n", precisaoPerdida);
    }
}