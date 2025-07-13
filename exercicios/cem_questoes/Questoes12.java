public class Questoes12 {
    public static void main(String[] args) {
        double valorOriginal = 9.8765;
        int valorAposCasting = (int) valorOriginal;
        double precisaoPerdida = valorOriginal - valorAposCasting;

        System.out.println("Valor original (double): " + String.format("%.4f", valorOriginal));
        System.out.println("Valor após casting (int): " + valorAposCasting);
        System.out.println("Precisão perdida: " + String.format("%.4f", precisaoPerdida));
    }
}
