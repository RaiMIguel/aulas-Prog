import java.util.Scanner;

public class Questoes29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "123456";
        int tentativasMaximas = 3;
        int tentativasAtuais = 0;
        boolean loginSucesso = false;

        while (tentativasAtuais < tentativasMaximas) {
            System.out.print("Usuário: ");
            String usuarioDigitado = scanner.nextLine();

            System.out.print("Senha: ");
            String senhaDigitada = scanner.nextLine();

            if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
                loginSucesso = true;
                break;
            } else {
                tentativasAtuais++;
                if (tentativasAtuais < tentativasMaximas) {
                    System.out.println("Tentativa " + tentativasAtuais + " falhou!");
                }
            }
        }

        if (loginSucesso) {
            System.out.println("Login realizado com sucesso!");
            System.out.println("Bem-vindo, " + usuarioCorreto + "!");
        } else {
            System.out.println("Acesso bloqueado");
        }

        scanner.close();
    }
}