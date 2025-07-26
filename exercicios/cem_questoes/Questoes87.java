public class Questoes87 {

    public static int maiorNumero(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        // Ou simplesmente: return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Testando método maiorNumero():");
        
        System.out.println("Maior entre 5 e 8: " + maiorNumero(5, 8));
        System.out.println("Maior entre 12 e 7: " + maiorNumero(12, 7));
        System.out.print("Maior entre 15 e 15: " + maiorNumero(15, 15));
        if (maiorNumero(15, 15) == 15) {
            System.out.println(" (números iguais)");
        }
        System.out.println("Maior entre -10 e -5: " + maiorNumero(-10, -5));
    }
}