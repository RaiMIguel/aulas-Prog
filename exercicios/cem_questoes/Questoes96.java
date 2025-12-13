public class Questoes96 {

    // Constantes de configuração do sistema
    public static final int MAX_TENTATIVAS_LOGIN = 3;
    public static final int TIMEOUT_SESSAO = 1800; // segundos
    public static final int TAMANHO_MIN_SENHA = 8;
    public static final int MAX_USUARIOS_ONLINE = 100;

    /**
     * @param args
     * Enunciado: Implemente um sistema de configuração usando constantes.
     */
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CONFIGURAÇÃO ===");
        
        System.out.println("\nConfigurações ativas:");
        System.out.println("MAX_TENTATIVAS_LOGIN = " + MAX_TENTATIVAS_LOGIN);
        System.out.println("TIMEOUT_SESSAO = " + TIMEOUT_SESSAO + " segundos (" + (TIMEOUT_SESSAO / 60) + " minutos)");
        System.out.println("TAMANHO_MIN_SENHA = " + TAMANHO_MIN_SENHA + " caracteres");
        System.out.println("MAX_USUARIOS_ONLINE = " + MAX_USUARIOS_ONLINE);

        System.out.println("\nSimulação de uso:");
        String senhaTeste = "minhasenha123";
        if (senhaTeste.length() >= TAMANHO_MIN_SENHA) {
            System.out.printf("✓ Senha \"%s\" (%d chars) atende requisito mínimo (%d)%n", senhaTeste, senhaTeste.length(), TAMANHO_MIN_SENHA);
        }
        
        int tentativasLogin = 4;
        if (tentativasLogin > MAX_TENTATIVAS_LOGIN) {
            System.out.printf("✗ %d tentativas de login excedem limite (%d)%n", tentativasLogin, MAX_TENTATIVAS_LOGIN);
        }
        
        int usuariosOnline = 85;
        if (usuariosOnline <= MAX_USUARIOS_ONLINE) {
            System.out.printf("✓ %d usuários online dentro do limite (%d)%n", usuariosOnline, MAX_USUARIOS_ONLINE);
        }
        
        System.out.printf("⚠ Sessão expira em %d segundos%n", TIMEOUT_SESSAO);
        
        System.out.println("\nStatus do sistema: OPERACIONAL");
    }
}