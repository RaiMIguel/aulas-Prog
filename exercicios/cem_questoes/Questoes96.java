public class Questoes96 {

    // Constantes de configuração
    public static final int MAX_TENTATIVAS_LOGIN = 3;
    public static final int TIMEOUT_SESSAO_SEGUNDOS = 1800; // segundos
    public static final int TAMANHO_MIN_SENHA = 8;
    public static final int MAX_USUARIOS_ONLINE = 100;

    // Métodos de validação/uso das configurações
    public static boolean validarSenha(String senha) {
        return senha.length() >= TAMANHO_MIN_SENHA;
    }

    public static boolean excedeuTentativasLogin(int tentativasAtuais) {
        return tentativasAtuais > MAX_TENTATIVAS_LOGIN;
    }

    public static boolean usuariosOnlineDentroLimite(int usuariosAtuais) {
        return usuariosAtuais <= MAX_USUARIOS_ONLINE;
    }

    public static String obterTempoSessaoFormatado() {
        int minutos = TIMEOUT_SESSAO_SEGUNDOS / 60;
        return TIMEOUT_SESSAO_SEGUNDOS + " segundos (" + minutos + " minutos)";
    }

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CONFIGURAÇÃO ===");

        System.out.println("\nConfigurações ativas:");
        System.out.println("MAX_TENTATIVAS_LOGIN = " + MAX_TENTATIVAS_LOGIN);
        System.out.println("TIMEOUT_SESSAO = " + obterTempoSessaoFormatado());
        System.out.println("TAMANHO_MIN_SENHA = " + TAMANHO_MIN_SENHA + " caracteres");
        System.out.println("MAX_USUARIOS_ONLINE = " + MAX_USUARIOS_ONLINE);

        System.out.println("\nSimulação de uso:");

        // Teste de senha
        String senhaTeste1 = "minhasenha123";
        if (validarSenha(senhaTeste1)) {
            System.out.println("✓ Senha \"" + senhaTeste1 + "\" (" + senhaTeste1.length() + " chars) atende requisito mínimo (" + TAMANHO_MIN_SENHA + ")");
        } else {
            System.out.println("✗ Senha \"" + senhaTeste1 + "\" (" + senhaTeste1.length() + " chars) NÃO atende requisito mínimo (" + TAMANHO_MIN_SENHA + ")");
        }

        // Teste de tentativas de login
        int tentativasLogin = 4;
        if (excedeuTentativasLogin(tentativasLogin)) {
            System.out.println("✗ " + tentativasLogin + " tentativas de login excedem limite (" + MAX_TENTATIVAS_LOGIN + ")");
        } else {
            System.out.println("✓ " + tentativasLogin + " tentativas de login dentro do limite (" + MAX_TENTATIVAS_LOGIN + ")");
        }

        // Teste de usuários online
        int usuariosAtuais = 85;
        if (usuariosOnlineDentroLimite(usuariosAtuais)) {
            System.out.println("✓ " + usuariosAtuais + " usuários online dentro do limite (" + MAX_USUARIOS_ONLINE + ")");
        } else {
            System.out.println("✗ " + usuariosAtuais + " usuários online excedem limite (" + MAX_USUARIOS_ONLINE + ")");
        }

        // Informação sobre timeout
        System.out.println("⚠ Sessão expira em " + obterTempoSessaoFormatado().split(" ")[0] + " segundos");

        System.out.println("\nStatus do sistema: OPERACIONAL"); // Exemplo de status
    }
}