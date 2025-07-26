public class Questoes9 {

    /**
     * @param args
     *             **Enunciado**: Faça um programa que converta 25°C para
     *             Fahrenheit. Use a fórmula: F = (C × 9/5) + 32.
     *             Objetivos**:
     *             - Aplicar fórmula matemática
     *             - Trabalhar com tipos apropriados
     *             - Usar variáveis descritivas
     */
    public static void main(String[] args) {
        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = calcularFahrenheit(temperaturaCelsius);
        System.out.printf("temperatura em celcius: .2f°C\n", temperaturaCelsius);
        System.out.printf("temperatura em fahrenheit: .2f°F\n", temperaturaFahrenheit);
    }
    
    /** 
     * @param celsius
     * @return double (temperatura em Fahrenheit)
     */
    public static double calcularFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
