import java.util.Scanner;

public class Questoes25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        String categoria;

        if (idade < 5) {
            categoria = "Muito jovem para competir";
            System.out.println(categoria);
        } else if (idade >= 5 && idade <= 7) {
            categoria = "Infantil";
            System.out.println("Nadador de " + idade + " anos: Categoria " + categoria);
        } else if (idade >= 8 && idade <= 17) {
            categoria = "Juvenil";
            System.out.println("Nadador de " + idade + " anos: Categoria " + categoria);
        } else if (idade >= 18 && idade <= 65) {
            categoria = "Adulto";
            System.out.println("Nadador de " + idade + " anos: Categoria " + categoria);
        } else if (idade > 65) {
            categoria = "Senior";
            System.out.println("Nadador de " + idade + " anos: Categoria " + categoria);
        } else {
            // Este else será raramente alcançado se a lógica for bem definida acima,
            // mas cobre qualquer caso não contemplado ou idade negativa.
            System.out.println("Idade inválida.");
        }

        scanner.close();
    }
}