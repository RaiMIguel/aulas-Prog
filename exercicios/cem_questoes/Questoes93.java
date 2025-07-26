public class Questoes93 {

    public static final double PI = 3.14159;
    public static final long VELOCIDADE_LUZ = 299792458L; // m/s
    public static final double GRAVIDADE_TERRA = 9.81; // m/s²

    public static void main(String[] args) {
        System.out.println("=== CONSTANTES UNIVERSAIS ===");

        System.out.println("\nConstantes declaradas:");
        System.out.println("PI = " + PI);
        System.out.println("VELOCIDADE_LUZ = " + VELOCIDADE_LUZ + " m/s");
        System.out.println("GRAVIDADE_TERRA = " + GRAVIDADE_TERRA + " m/s²");

        System.out.println("\nExemplos de uso:");

        // Cálculo da área do círculo
        double raioCirculo = 5.0;
        double areaCirculo = PI * raioCirculo * raioCirculo;
        System.out.printf("Área círculo (raio=%.0f): π × %.0f² = %.2f m²%n", raioCirculo, raioCirculo, areaCirculo);

        // Cálculo do tempo de viagem da luz Terra-Lua
        double distanciaTerraLuaKm = 384400; // km
        double distanciaTerraLuaM = distanciaTerraLuaKm * 1000; // converter para metros
        double tempoLuzTerraLua = distanciaTerraLuaM / VELOCIDADE_LUZ;
        System.out.printf("Tempo luz Terra-Lua: %.0f km ÷ %d m/s = %.2f segundos%n", distanciaTerraLuaKm, VELOCIDADE_LUZ, tempoLuzTerraLua);

        // Cálculo da distância em queda livre
        double tempoQueda = 5.0; // segundos
        double distanciaQuedaLivre = 0.5 * GRAVIDADE_TERRA * tempoQueda * tempoQueda;
        System.out.printf("Queda livre (%.0fs): ½ × %.2f × %.0f² = %.2f metros%n", tempoQueda, GRAVIDADE_TERRA, tempoQueda, distanciaQuedaLivre);
    }
}