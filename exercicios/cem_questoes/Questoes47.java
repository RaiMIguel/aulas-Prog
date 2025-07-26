public class Questoes47 {
    public static void main(String[] args) {
        int[] numeros = {12, 7, 18, 23, 4, 15, 30, 9};
        
        int contPares = 0;
        int contImpares = 0;
        StringBuilder valoresPares = new StringBuilder();
        StringBuilder valoresImpares = new StringBuilder();

        System.out.print("Array: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i == numeros.length - 1 ? "" : ", "));
        }
        System.out.println("]");

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contPares++;
                valoresPares.append(numero).append(", ");
            } else {
                contImpares++;
                valoresImpares.append(numero).append(", ");
            }
        }

        if (valoresPares.length() > 0) {
            valoresPares.setLength(valoresPares.length() - 2); // Remover a última ", "
        }
        if (valoresImpares.length() > 0) {
            valoresImpares.setLength(valoresImpares.length() - 2); // Remover a última ", "
        }
        
        System.out.println("Números pares: " + contPares + " (valores: " + valoresPares.toString() + ")");
        System.out.println("Números ímpares: " + contImpares + " (valores: " + valoresImpares.toString() + ")");
    }
}