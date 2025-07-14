import java.util.Scanner;
public class Questoes21 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Com " + idade + " anos, você é maior de idade.");
        } else {
            System.out.println("Com " + idade + " anos, você é menor de idade.");
        }

        scanner.close();
    }
}
