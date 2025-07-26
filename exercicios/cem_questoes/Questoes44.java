public class Questoes44 {
    public static void main(String[] args) {
        int[] numeros = {45, 23, 67, 89, 12, 56, 78};

        int maiorElemento = numeros[0];
        int posicaoMaior = 0;

        System.out.print("Array: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i == numeros.length - 1 ? "" : ", "));
        }
        System.out.println("]");

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorElemento) {
                maiorElemento = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Maior elemento: " + maiorElemento);
        System.out.println("Posição: " + posicaoMaior);
    }
}