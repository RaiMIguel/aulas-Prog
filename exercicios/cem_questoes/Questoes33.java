public class Questoes33 {

    /**
     * @param args
     * Enunciado: Conte de 10 a 1 (contagem regressiva) usando do-while.
     *
     * Objetivos:
     * - Usar laço do-while
     * - Contar decrescente
     * - Entender execução garantida
     */
    public static void main(String[] args) {
        contagemRegressivaDoWhile();
    }

    /**
     * Realiza uma contagem regressiva de 10 a 1 usando um laço do-while.
     */
    public static void contagemRegressivaDoWhile() {
        System.out.println("Contagem regressiva:");
        int i = 10;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1);
        System.out.println("\nZERO!");
    }
}