public class Questoes36 {
    public static void main(String[] args) {
        System.out.println("Sequência de Fibonacci (15 termos):");
        int a = 0;
        int b = 1;
        int count = 0;

        while (count < 15) {
            System.out.print(a + (count == 14 ? "" : " "));
            int proximo = a + b;
            a = b;
            b = proximo;
            count++;
        }
        System.out.println();
    }
}