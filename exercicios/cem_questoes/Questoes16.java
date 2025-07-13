import java.text.DecimalFormat;
import java.util.Scanner;

public class Questoes16 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Seu IMC é: " + df.format(imc));

        scanner.close();
    }
}
