import java.util.Scanner;

public class Questoes38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroOriginal = scanner.nextInt();
        int numero = numeroOriginal;

        int somaDigitos = 0;
        StringBuilder digitosProcesso = new StringBuilder();

        if (numero == 0) {
            digitosProcesso.append("0");
            somaDigitos = 0;
        } else {
            while (numero > 0) {
                int digito = numero % 10;
                somaDigitos += digito;
                digitosProcesso.insert(0, digito); // Adiciona o dígito no início para manter a ordem
                if (numero / 10 > 0) {
                    digitosProcesso.insert(0, " + ");
                }
                numero /= 10;
            }
        }

        System.out.println("Número: " + numeroOriginal);
        System.out.println("Dígitos: " + digitosProcesso.toString());
        System.out.println("Soma dos dígitos: " + somaDigitos);

        scanner.close();
    }
}