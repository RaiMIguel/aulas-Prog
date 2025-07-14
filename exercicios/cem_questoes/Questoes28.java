import java.util.Scanner;

public class Questoes28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Digite o lado C: ");
        double ladoC = scanner.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            System.out.println("Os lados " + (int)ladoA + ", " + (int)ladoB + ", " + (int)ladoC + " formam um triângulo.");

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Tipo: Equilátero");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Tipo: Isósceles");
            } else {
                System.out.println("Tipo: Escaleno");
            }
        } else {
            System.out.println("Os lados " + (int)ladoA + ", " + (int)ladoB + ", " + (int)ladoC + " NÃO formam um triângulo.");
        }

        scanner.close();
    }
}