public class Questoes48 {
    public static void main(String[] args) {
        int[] numeros = {85, 92, 78, 96, 87, 91};

        System.out.print("Array: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i == numeros.length - 1 ? "" : ", "));
        }
        System.out.println("]");

        if (numeros.length < 2) {
            System.out.println("Não há segundo maior elemento em um array com menos de 2 elementos.");
            return;
        }

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;
        boolean todosIguais = true;

        for (int i = 0; i < numeros.length; i++) {
            if (i > 0 && numeros[i] != numeros[0]) {
                todosIguais = false;
            }
            if (numeros[i] > maior) {
                segundoMaior = maior;
                maior = numeros[i];
            } else if (numeros[i] > segundoMaior && numeros[i] < maior) {
                segundoMaior = numeros[i];
            }
        }

        if (todosIguais || segundoMaior == Integer.MIN_VALUE) { // Condição para "Não há segundo maior"
            System.out.println("Não há segundo maior.");
        } else {
            System.out.println("Maior elemento: " + maior);
            System.out.println("Segundo maior: " + segundoMaior);
        }
    }
}