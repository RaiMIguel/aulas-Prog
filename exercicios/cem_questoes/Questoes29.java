import java.util.Scanner;

public class Questoes29 {

    /**
     * @param args
     * Enunciado: Crie um sistema de login com usuário e senha. O usuário tem 3 tentativas para acertar.
     *
     * Objetivos:
     * - Controlar tentativas
     * - Validar múltiplas condições
     * - Usar laços com decisões
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String USUARIO_CORRETO = "admin";
        final String SENHA_CORRETA = "123456";
        final int MAX_TENTATIVAS = 3;

        boolean loginSucesso = realizarLogin(scanner, USUARIO_CORRETO, SENHA_CORRETA, MAX_TENTATIVAS);

        if (loginSucesso) {
            System.out.println("\nLogin realizado com sucesso!");
            System.out.println("Bem-vindo, " + USUARIO_CORRETO + "!");
        } else {
            System.out.println("\nAcesso bloqueado.");
        }
        
        scanner.close();
    }

    /**
     * Realiza a tentativa de login, com um número máximo de tentativas.
     * @param scanner O objeto Scanner para leitura.
     * @param usuarioCorreto O nome de usuário correto.
     * @param senhaCorreta A senha correta.
     * @param maxTentativas O número máximo de tentativas.
     * @return true se o login for bem-sucedido, false caso contrário.
     */
    public static boolean realizarLogin(Scanner scanner, String usuarioCorreto, String senhaCorreta, int maxTentativas) {
        for (int i = 1; i <= maxTentativas; i++) {
            System.out.print("Usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();
            
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                return true;
            } else {
                String mensagem = (i < maxTentativas) ? "Tentativa " + i + " falhou!" : "Tentativa " + i + " falhou!";
                System.out.println(mensagem);
            }
        }
        return false;
    }
}