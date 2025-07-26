import java.util.Scanner;

public class Questoes94 {

    // Constantes para fatores de conversão
    public static final double METROS_PARA_PES = 3.28084;
    public static final double CELSIUS_FAHRENHEIT_MULT = 1.8;
    public static final double CELSIUS_FAHRENHEIT_ADD = 32.0;
    public static final double KM_PARA_MILHAS = 0.621371;

    public static double converterMetrosParaPes(double metros) {
        return metros * METROS_PARA_PES;
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * CELSIUS_FAHRENHEIT_MULT) + CELSIUS_FAHRENHEIT_ADD;
    }

    public static double converterKmParaMilhas(double km) {
        return km * KM_PARA_MILHAS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONVERSOR DE UNIDADES ===");

        System.out.print("\nDigite metros: ");
        double metros = scanner.nextDouble();

        System.out.print("Digite celsius: ");
        double celsius = scanner.nextDouble();

        System.out.print("Digite quilômetros: ");
        double km = scanner.nextDouble();

        System.out.println("\nConversões realizadas:");
        System.out.printf("%.1f metros = %.2f pés%n", metros, converterMetrosParaPes(metros));
        System.out.printf("%.1f°C = %.1f°F%n", celsius, converterCelsiusParaFahrenheit(celsius));
        System.out.printf("%.1f km = %.2f milhas%n", km, converterKmParaMilhas(km));

        System.out.println("\nFatores utilizados:");
        System.out.println("METROS_PARA_PES = " + METROS_PARA_PES);
        System.out.println("CELSIUS_FAHRENHEIT_MULT = " + CELSIUS_FAHRENHEIT_MULT);
        System.out.println("CELSIUS_FAHRENHEIT_ADD = " + CELSIUS_FAHRENHEIT_ADD);
        System.out.println("KM_PARA_MILHAS = " + KM_PARA_MILHAS);

        scanner.close();
    }
}