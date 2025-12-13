public class Questoes85 {

    /**
     * @param args
     * Enunciado: Crie um método que calcule a área de um círculo dado o raio.
     *
     * Objetivos:
     * - Criar método com parâmetro
     * - Retornar valor calculado
     * - Usar constantes matemáticas
     */
    public static void main(String[] args) {
        double raio = 5.0;
        
        System.out.println("=== CALCULADORA DE ÁREA DO CÍRCULO ===");
        System.out.println("Raio: " + raio);
        
        if (raio > 0) {
            double area = calcularAreaCirculo(raio);
            System.out.printf("Área: %.2f%n", area);
            System.out.println("Fórmula usada: π × r²");
        } else {
            System.out.println("Erro: O raio deve ser um valor positivo.");
        }
    }

    /**
     * Calcula a área de um círculo.
     * @param raio O raio do círculo.
     * @return A área do círculo.
     */
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}