import java.util.Arrays;

public class Questoes48 {

    /**
     * @param args
     * Enunciado: Encontre o segundo maior elemento de um array.
     * Dados: {85, 92, 78, 96, 87, 91}
     *
     * Objetivos:
     * - Encontrar múltiplos extremos
     * - Evitar duplicatas
     * - Lidar com casos especiais
     */
    public static void main(String[] args) {
        int[] numeros = {85, 92, 78, 96, 87, 91};
        
        System.out.println("Array: " + Arrays.toString(numeros));
        
        encontrarSegundoMaior(numeros);
    }

    /**
     * Encontra e exibe o maior e o segundo maior elemento de um array.
     * @param array O array de inteiros.
     */
    public static void encontrarSegundoMaior(int[] array) {
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int numero : array) {
            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior && numero != maior) {
                segundoMaior = numero;
            }
        }
        
        if (segundoMaior == Integer.MIN_VALUE || maior == segundoMaior) {
            System.out.println("Não há segundo maior elemento.");
        } else {
            System.out.println("Maior elemento: " + maior);
            System.out.println("Segundo maior: " + segundoMaior);
        }
    }
}