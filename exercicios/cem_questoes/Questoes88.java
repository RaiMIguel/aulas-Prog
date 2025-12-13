public class Questoes88 {

    /**
     * @param args
     * Enunciado: Implemente sobrecarga de métodos para cálculo de área.
     *
     * Objetivos:
     * - Criar múltiplos métodos com mesmo nome
     * - Diferentes assinaturas de parâmetros
     * - Demonstrar polimorfismo
     */
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA DE ÁREAS (SOBRECARGA) ===");
        
        System.out.printf("\nÁrea do círculo (raio=3): %.2f%n", calcularArea(3.0));
        System.out.printf("Área do retângulo (4x6): %.2f%n", calcularArea(4.0, 6.0));
        System.out.printf("Área do triângulo (base=5, altura=8): %.2f%n", calcularAreaTriangulo(5.0, 8.0));
        
        System.out.println("\nDemonstração de sobrecarga:");
        System.out.printf("calcularArea(3.0) → %.2f%n", calcularArea(3.0));
        System.out.printf("calcularArea(4.0, 6.0) → %.2f%n", calcularArea(4.0, 6.0));
        System.out.printf("calcularAreaTriangulo(5.0, 8.0) → %.2f%n", calcularAreaTriangulo(5.0, 8.0));
    }

    /**
     * Calcula a área de um círculo.
     * @param raio O raio do círculo.
     * @return A área do círculo.
     */
    public static double calcularArea(double raio) {
        return Math.PI * raio * raio;
    }

    /**
     * Calcula a área de um retângulo.
     * @param base A base do retângulo.
     * @param altura A altura do retângulo.
     * @return A área do retângulo.
     */
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
    
    /**
     * Calcula a área de um triângulo.
     * @param base A base do triângulo.
     * @param altura A altura do triângulo.
     * @return A área do triângulo.
     */
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}