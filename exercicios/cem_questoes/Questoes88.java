public class Questoes88 {

    // Método para calcular área do círculo
    public static double calcularArea(double raio) {
        if (raio < 0) {
            System.out.println("Erro: Raio não pode ser negativo.");
            return 0.0;
        }
        return Math.PI * raio * raio;
    }

    // Método para calcular área do retângulo
    public static double calcularArea(double base, double altura) {
        if (base < 0 || altura < 0) {
            System.out.println("Erro: Base e altura não podem ser negativas.");
            return 0.0;
        }
        return base * altura;
    }

    // Método para calcular área do triângulo (com nome diferente por clareza, mas poderíamos forçar sobrecarga com tipos diferentes)
    // As regras pedem calcularAreaTriangulo, então usamos esse nome.
    public static double calcularAreaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            System.out.println("Erro: Base e altura não podem ser negativas.");
            return 0.0;
        }
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        System.out.println("=== CALCULADORA DE ÁREAS (SOBRECARGA) ===");

        double areaCirculo = calcularArea(3.0);
        double areaRetangulo = calcularArea(4.0, 6.0);
        double areaTriangulo = calcularAreaTriangulo(5.0, 8.0);

        System.out.printf("\nÁrea do círculo (raio=3): %.2f%n", areaCirculo);
        System.out.printf("Área do retângulo (4x6): %.2f%n", areaRetangulo);
        System.out.printf("Área do triângulo (base=5, altura=8): %.2f%n", areaTriangulo);

        System.out.println("\nDemonstração de sobrecarga:");
        System.out.printf("calcularArea(3.0) → %.2f%n", calcularArea(3.0));
        System.out.printf("calcularArea(4.0, 6.0) → %.2f%n", calcularArea(4.0, 6.0));
        System.out.printf("calcularAreaTriangulo(5.0, 8.0) → %.2f%n", calcularAreaTriangulo(5.0, 8.0));
    }
}