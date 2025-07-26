public class Questoes86 {

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Testando método éPar():");
        System.out.println("4 é par? " + ehPar(4));
        System.out.println("7 é par? " + ehPar(7));
        System.out.println("0 é par? " + ehPar(0));
        System.out.println("-6 é par? " + ehPar(-6));
        System.out.println("-5 é par? " + ehPar(-5));
    }
}