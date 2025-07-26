public class Questoes90 {

    // --- Fatorial Recursivo ---
    public static long fatorialRecursivo(int n) {
        System.out.print("fatorialRecursivo(" + n + ")");
        if (n <= 1) {
            System.out.println("\n= 1");
            return 1;
        } else {
            System.out.print("\n= " + n + " × ");
            return n * fatorialRecursivo(n - 1);
        }
    }

    // --- Fatorial Iterativo (para comparação) ---
    public static long fatorialIterativo(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // --- Fibonacci Recursivo ---
    public static long fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    // --- Fibonacci Iterativo (para comparação) ---
    public static long fibonacciIterativo(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0;
        long b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }


    public static void main(String[] args) {
        System.out.println("=== MÉTODOS RECURSIVOS ===");

        int numFatorial = 5;
        System.out.println("\nFatorial recursivo de " + numFatorial + ":");
        long resultadoFatorial = fatorialRecursivo(numFatorial);
        System.out.println("= " + resultadoFatorial);


        int numFibonacci = 8;
        System.out.println("\nFibonacci recursivo (" + numFibonacci + "º termo):");
        long resultadoFibonacci = fibonacciRecursivo(numFibonacci);
        System.out.println("fibonacciRecursivo(" + numFibonacci + ") = " + resultadoFibonacci);


        System.out.println("\nComparação de performance:");

        // Teste Fatorial Iterativo
        long startTime = System.nanoTime();
        long fatIter = fatorialIterativo(numFatorial);
        long endTime = System.nanoTime();
        System.out.println("Fatorial iterativo(" + numFatorial + "): " + fatIter + " (" + (endTime - startTime) / 1_000_000 + " ms)");

        // Teste Fatorial Recursivo
        startTime = System.nanoTime();
        long fatRec = fatorialRecursivo(numFatorial); // Chamar novamente para pegar o tempo limpo
        endTime = System.nanoTime();
        System.out.println("Fatorial recursivo(" + numFatorial + "): " + fatRec + " (" + (endTime - startTime) / 1_000_000 + " ms)");

        // Teste Fibonacci Iterativo
        startTime = System.nanoTime();
        long fibIter = fibonacciIterativo(numFibonacci);
        endTime = System.nanoTime();
        System.out.println("Fibonacci iterativo(" + numFibonacci + "): " + fibIter + " (" + (endTime - startTime) / 1_000_000 + " ms)");

        // Teste Fibonacci Recursivo
        startTime = System.nanoTime();
        long fibRec = fibonacciRecursivo(numFibonacci);
        endTime = System.nanoTime();
        System.out.println("Fibonacci recursivo(" + numFibonacci + "): " + fibRec + " (" + (endTime - startTime) / 1_000_000 + " ms)");
    }
}