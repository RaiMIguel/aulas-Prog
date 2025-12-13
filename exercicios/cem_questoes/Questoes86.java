public class Questoes86 {

    /**
     * @param args
     * Enunciado: Implemente um método que verifique se um número é par.
     *
     * Objetivos:
     * - Criar método boolean
     * - Implementar lógica de verificação
     * - Testar com múltiplos valores
     */
    public static void main(String[] args) {
        int[] numeros = {4, 7, 0, -6};
        
        System.out.println("Testando método ehPar():");
        for (int numero : numeros) {
            System.out.println(numero + " é par? " + ehPar(numero));
        }
    }

    /**
     * Verifica se um número inteiro é par.
     * @param numero O número a ser verificado.
     * @return true se o número for par, false caso contrário.
     */
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}