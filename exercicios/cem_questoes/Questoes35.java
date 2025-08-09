public class Questoes35 {

    /**
     * @param args
     * Enunciado: Encontre e exiba todos os números pares entre 1 e 100.
     *
     * Objetivos:
     * - Usar condições dentro de laços
     * - Filtrar valores
     * - Contar elementos
     */
    public static void main(String[] args) {
        encontrarEPares();
    }

    /**
     * Encontra e exibe os números pares de 1 a 100, formatando a saída
     * para 10 números por linha.
     */
    public static void encontrarEPares() {
        System.out.println("Números pares de 1 a 100:");
        int contador = 0;
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
            contador++;
            if (contador % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("\nTotal de números pares: " + contador);
    }
}