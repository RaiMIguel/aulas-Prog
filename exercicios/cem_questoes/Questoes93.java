public class Questoes93 {

    // Constantes declaradas com a convenção de nomenclatura
    public static final double PI = 3.14159;
    public static final long VELOCIDADE_LUZ = 299792458; // m/s
    public static final double GRAVIDADE_TERRA = 9.81; // m/s²

    /**
     * @param args
     * Enunciado: Declare constantes matemáticas e físicas úteis e use-as em cálculos.
     */
    public static void main(String[] args) {
        System.out.println("=== CONSTANTES UNIVERSAIS ===");
        System.out.println("\nConstantes declaradas:");
        System.out.println("PI = " + PI);
        System.out.println("VELOCIDADE_LUZ = " + VELOCIDADE_LUZ + " m/s");
        System.out.println("GRAVIDADE_TERRA = " + GRAVIDADE_TERRA + " m/s²");

        System.out.println("\nExemplos de uso:");
        double raio = 5.0;
        double areaCirculo = PI * Math.pow(raio, 2);
        System.out.printf("Área círculo (raio=%d): π × %d² = %.2f m²%n", (int) raio, (int) raio, areaCirculo);

        double distanciaTerraLuaKm = 384400.0;
        double distanciaTerraLuaM = distanciaTerraLuaKm * 1000;
        double tempoLuz = distanciaTerraLuaM / VELOCIDADE_LUZ;
        System.out.printf("Tempo luz Terra-Lua: %d km ÷ %d m/s = %.2f segundos%n", (int) distanciaTerraLuaKm, VELOCIDADE_LUZ, tempoLuz);

        int tempoQueda = 5;
        double quedaLivre = 0.5 * GRAVIDADE_TERRA * Math.pow(tempoQueda, 2);
        System.out.printf("Queda livre (%ds): ½ × %.2f × %d² = %.2f metros%n", tempoQueda, GRAVIDADE_TERRA, tempoQueda, quedaLivre);
    }
}