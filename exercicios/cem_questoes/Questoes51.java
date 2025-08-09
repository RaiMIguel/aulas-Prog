import java.util.Arrays;

public class Questoes51 {

    /**
     * @param args
     * Enunciado: Remova elementos duplicados de um array mantendo apenas a
     * primeira ocorrência.
     * Dados: {1, 3, 2, 3, 4, 2, 5, 1}
     *
     * Objetivos:
     * - Detectar duplicatas
     * - Manter ordem original
     * - Criar array sem repetições
     */
    public static void main(String[] args) {
        int[] numeros = {1, 3, 2, 3, 4, 2, 5, 1};
        
        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Removendo duplicatas...");
        
        int[] resultado = removerDuplicatas(numeros);
        
        System.out.println("Array sem duplicatas: " + Arrays.toString(resultado));
        System.out.println("Elementos removidos: " + (numeros.length - resultado.length) + " duplicatas");
    }

    /**
     * Remove elementos duplicados de um array, mantendo a ordem original.
     * @param array O array com possíveis duplicatas.
     * @return Um novo array sem os elementos duplicados.
     */
    public static int[] removerDuplicatas(int[] array) {
        int[] temp = new int[array.length];
        int novoTamanho = 0;
        
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicado = false;
            for (int j = 0; j < novoTamanho; j++) {
                if (array[i] == temp[j]) {
                    isDuplicado = true;
                    break;
                }
            }
            if (!isDuplicado) {
                temp[novoTamanho] = array[i];
                novoTamanho++;
            }
        }
        
        return Arrays.copyOf(temp, novoTamanho);
    }
}