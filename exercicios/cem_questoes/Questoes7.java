public class Questoes7 {

    /**
     * @param args
     *             Demonstre a diferença entre divisão com int e double. Divida 10
     *             por 3 usando ambos os tipos.
     *             Objetivos**:
     *             - Entender diferença entre tipos numéricos
     *             - Demonstrar perda de precisão
     *             - Usar casting quando necessário
     * @return "divisão com int: " + divisaoI
     *         "divisão ocm double: " + divisaoD
     */
    public static void main(String[] args) {
        double[] valoresDouble = { 10.0, 3.0 };
        int[] valoresInt = { 10, 3 };
        
        double divisaoDouble = dividir(valoresDouble);
        double divisaoInt = dividir(valoresInt);

        System.out.println("divisão com int: " + divisaoInt);
        System.out.println("divisão ocm double: " + divisaoDouble);

    }

    /** 
     * @param valores
     * @return double
     */
    public static double dividir(double[] valores) {
        double resultadoDivisao = valores[0];

        for (int i = 1; i < valores.length; i++) {
            resultadoDivisao = resultadoDivisao / valores[i];
        }

        return resultadoDivisao;

    }

    /** 
     * @param valores
     * @return int
     */
    public static int dividir(int[] valores) {
        int resultadoDivisao = valores[0];

        for (int i = 1; i < valores.length; i++) {
            resultadoDivisao = resultadoDivisao / valores[i];
        }

        return resultadoDivisao;
    }
}
