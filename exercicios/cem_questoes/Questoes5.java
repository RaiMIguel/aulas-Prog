public class Questoes5 {

    /**
     * @param args
     * 
     *             Crie um programa que calcule a média aritmética de 4 notas: 8.5,
     *             7.0, 9.2, 6.8.
     *             Objetivos**:
     *             - Trabalhar com múltiplas variáveis
     *             - Realizar cálculo de média
     *             - Usar operações aritméticas
     * @return "a média das notas é: media"
     */
    public static void main(String[] args) {
        float[] notas = {8.5f,7.0f, 9.2f, 6.8f};
        calcularMediaEExibirMensagem(notas);
        
    }


    /** 
     * @param float[] notas
     * @return "a média das notas é:  %.2f\n",media
     */
    public static void calcularMediaEExibirMensagem(float[] notas) {
        
        float media = 0f;
        for (float nota : notas) {
            System.out.printf("%.2f\n",nota);
            media += nota;
        }
        media = media / notas.length;
        System.out.printf("a média das notas é:  %.2f\n",media);

    }
}
