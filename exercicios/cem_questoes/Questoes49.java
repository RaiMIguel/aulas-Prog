import java.util.Scanner;

public class Questoes49 {
    public static void main(String[] args) {
        int[] numeros = {10, 25, 14, 37, 22, 18, 41};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i == numeros.length - 1 ? "" : ", "));
        }
        System.out.println("]");

        System.out.print("Digite o valor a buscar: ");
        int valorBuscar = scanner.nextInt();

        System.out.println("Buscando " + valorBuscar + " no array...");

        int posicaoEncontrada = -1; // -1 indica que não foi encontrado
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscar) {
                posicaoEncontrada = i;
                break;
            }
        }

        if (posicaoEncontrada != -1) {
            System.out.println("Valor encontrado na posição " + posicaoEncontrada);
        } else {
            System.out.println("Valor não encontrado.");
        }

        scanner.close();
    }
}