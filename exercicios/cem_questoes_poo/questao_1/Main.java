import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("digite idade: ");
        int idade = scanner.nextInt();

        Ninja naruto = new Ninja(nome,idade);
        System.out.println("nome do ninja: " + naruto.getNome());
        System.out.println("idade do ninja: " + naruto.getIdade());

        scanner.close();
    }
}
