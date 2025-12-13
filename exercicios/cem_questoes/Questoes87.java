public class Questoes87 {

    /**
     * @param args
     * Enunciado: Crie um método que retorne o maior de dois números.
     *
     * Objetivos:
     * - Implementar comparação
     * - Retornar resultado
     * - Testar casos diversos
     */
    public static void main(String[] args) {
        System.out.println("Testando método maiorNumero():");
        
        int a1 = 5, b1 = 8;
        System.out.printf("Maior entre %d e %d: %d%n", a1, b1, maiorNumero(a1, b1));
        
        int a2 = 12, b2 = 7;
        System.out.printf("Maior entre %d e %d: %d%n", a2, b2, maiorNumero(a2, b2));
        
        int a3 = 15, b3 = 15;
        System.out.printf("Maior entre %d e %d: %d (números iguais)%n", a3, b3, maiorNumero(a3, b3));
    }

    /**
     * Retorna o maior de dois números inteiros.
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O maior dos dois números.
     */
    public static int maiorNumero(int a, int b) {
        return (a > b) ? a : b;
    }
}