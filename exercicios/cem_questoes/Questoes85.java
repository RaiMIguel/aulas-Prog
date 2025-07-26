public class Questoes85 {

    public static double calcularAreaCirculo(double raio) {
        if (raio < 0) {
            System.out.println("Erro: O raio não pode ser negativo.");
            return -1.0; // Valor de erro
        }
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        double raio = 5.0;

        System.out.println("=== CALCULADORA DE ÁREA DO CÍRCULO ===");
        System.out.println("Raio: " + raio);

        double area = calcularAreaCirculo(raio);

        if (area != -1.0) { // Se não houve erro no cálculo
            System.out.printf("Área: %.2f%n", area);
            System.out.println("Fórmula usada: π × r²");
        }
    }
}