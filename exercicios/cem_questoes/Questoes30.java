import java.util.Scanner;

public class Questoes30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        // Remover caracteres não numéricos, se houver
        cpf = cpf.replaceAll("[^0-9]", "");

        boolean valido = true;
        String status = "Formato válido (verificação básica)";

        if (cpf.length() != 11) {
            valido = false;
            status = "CPF inválido: Deve ter 11 dígitos.";
        } else {
            // Verifica se é uma sequência de dígitos iguais (ex: 111.111.111-11)
            char primeiroDigito = cpf.charAt(0);
            boolean todosIguais = true;
            for (int i = 1; i < cpf.length(); i++) {
                if (cpf.charAt(i) != primeiroDigito) {
                    todosIguais = false;
                    break;
                }
            }
            if (todosIguais) {
                valido = false;
                status = "CPF inválido: Não pode ser uma sequência de dígitos iguais.";
            }
        }

        System.out.println("CPF: " + cpf.substring(0, 3) + "." +
                           cpf.substring(3, 6) + "." +
                           cpf.substring(6, 9) + "-" +
                           cpf.substring(9, 11));
        System.out.println("Status: " + status);

        scanner.close();
    }
}