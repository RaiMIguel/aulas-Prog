import java.util.Scanner;

public class Questoes28 {

    /**
     * @param args
     * Enunciado: Verifique se três números podem formar um triângulo e, se sim,
     * classifique-o como equilátero, isósceles ou escaleno.
     *
     * Objetivos:
     * - Aplicar regras geométricas
     * - Usar múltiplas validações
     * - Classificar formas
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o lado A: ");
        double ladoA = scanner.nextDouble();
        System.out.print("Digite o lado B: ");
        double ladoB = scanner.nextDouble();
        System.out.print("Digite o lado C: ");
        double ladoC = scanner.nextDouble();

        if (ehTriangulo(ladoA, ladoB, ladoC)) {
            String tipo = classificarTriangulo(ladoA, ladoB, ladoC);
            System.out.println("Os lados " + ladoA + ", " + ladoB + ", " + ladoC + " formam um triângulo.");
            System.out.println("Tipo: " + tipo);
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
        
        scanner.close();
    }

    /**
     * Verifica se três lados podem formar um triângulo.
     * @param a O comprimento do primeiro lado.
     * @param b O comprimento do segundo lado.
     * @param c O comprimento do terceiro lado.
     * @return true se puder formar um triângulo, false caso contrário.
     */
    public static boolean ehTriangulo(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    /**
     * Classifica o tipo de triângulo.
     * @param a O comprimento do primeiro lado.
     * @param b O comprimento do segundo lado.
     * @param c O comprimento do terceiro lado.
     * @return O tipo de triângulo (Equilátero, Isósceles ou Escaleno).
     */
    public static String classificarTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}