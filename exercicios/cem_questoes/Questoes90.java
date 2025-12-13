public class Questoes90 {

    /**
     * @param args
     * Enunciado: Implemente métodos recursivos para cálculo de fatorial e Fibonacci.
     *
     * Objetivos:
     * - Entender recursão
     * - Implementar casos base
     * - Comparar com versões iterativas
     */
    public static void main(String[] args) {
        int numFatorial = 5;
        int numFibonacci = 8;
        
        System.out.println("=== MÉTODOS RECURSIVOS ===");
        
        System.out.println("\nFatorial recursivo de " + numFatorial + ":");
        fatorialRecursivoComProcesso(numFatorial);
        
        System.out.println("\nFibonacci recursivo (" + numFibonacci + "º termo):");
        System.out.println("fibonacciRecursivo(" + numFibonacci + ") = " + fibonacciRecursivo(numFibonacci));
        
        System.out.println("\nComparação de performance:");
        long startTime, endTime;
        
        startTime = System.nanoTime();
        fatorialIterativo(numFatorial);
        endTime = System.nanoTime();
        System.out.printf("Fatorial iterativo(%d): %d (%d ns)%n", numFatorial, fatorialIterativo(numFatorial), endTime - startTime);
        
        startTime = System.nanoTime();
        fatorialRecursivo(numFatorial);
        endTime = System.nanoTime();
        System.out.printf("Fatorial recursivo(%d): %d (%d ns)%n", numFatorial, fatorialRecursivo(numFatorial), endTime - startTime);
        
        startTime = System.nanoTime();
        fibonacciIterativo(numFibonacci);
        endTime = System.nanoTime();
        System.out.printf("Fibonacci iterativo(%d): %d (%d ns)%n", numFibonacci, fibonacciIterativo(numFibonacci), endTime - startTime);
        
        startTime = System.nanoTime();
        fibonacciRecursivo(numFibonacci);
        endTime = System.nanoTime();
        System.out.printf("Fibonacci recursivo(%d): %d (%d ns)%n", numFibonacci, fibonacciRecursivo(numFibonacci), endTime - startTime);
    }

    // --- Fatorial ---
    /**
     * Calcula o fatorial de um número de forma recursiva.
     * @param n O número a ser calculado.
     * @return O fatorial de n.
     */
    public static long fatorialRecursivo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }

    /**
     * Exibe o processo de cálculo recursivo do fatorial.
     * @param n O número a ser calculado.
     */
    public static void fatorialRecursivoComProcesso(int n) {
        System.out.println("fatorialRecursivo(" + n + ")");
        StringBuilder processo = new StringBuilder();
        long resultado = 1;
        for (int i = n; i >= 1; i--) {
            processo.append(i);
            if (i > 1) {
                processo.append(" × ");
            }
            resultado *= i;
        }
        System.out.println("= " + processo.toString());
        System.out.println("= " + resultado);
    }

    /**
     * Calcula o fatorial de um número de forma iterativa.
     * @param n O número a ser calculado.
     * @return O fatorial de n.
     */
    public static long fatorialIterativo(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // --- Fibonacci ---
    /**
     * Calcula o n-ésimo termo da sequência de Fibonacci de forma recursiva.
     * @param n O termo a ser calculado.
     * @return O valor do n-ésimo termo.
     */
    public static long fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    /**
     * Calcula o n-ésimo termo da sequência de Fibonacci de forma iterativa.
     * @param n O termo a ser calculado.
     * @return O valor do n-ésimo termo.
     */
    public static long fibonacciIterativo(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}