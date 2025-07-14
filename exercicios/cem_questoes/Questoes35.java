public class Questoes35 {
    public static void main(String[] args) {
        System.out.println("Números pares de 1 a 100:");
        int contadorPares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                contadorPares++;
                if (contadorPares % 10 == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
        if (contadorPares % 10 != 0) { // Garante nova linha se a última linha não tiver 10 números
            System.out.println();
        }
        System.out.println("\nTotal de números pares: " + contadorPares);
    }
}
