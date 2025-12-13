public class Questoes95 {
    
    // Constantes para códigos de erro
    public static final int ERRO_LOGIN = 1001;
    public static final int ERRO_PERMISSAO = 1002;
    public static final int ERRO_ARQUIVO = 1003;
    public static final int ERRO_REDE = 1004;
    public static final int ERRO_MEMORIA = 1005;

    // Constantes para mensagens de erro
    public static final String MSG_LOGIN = "Usuário ou senha inválidos";
    public static final String MSG_PERMISSAO = "Acesso negado";
    public static final String MSG_ARQUIVO = "Arquivo não encontrado";
    public static final String MSG_REDE = "Falha na conexão";
    public static final String MSG_MEMORIA = "Memória insuficiente";

    /**
     * @param args
     * Enunciado: Crie uma classe com constantes para códigos de erro.
     */
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CÓDIGOS DE ERRO ===");
        
        System.out.println("\nConstantes definidas:");
        System.out.println("ERRO_LOGIN = " + ERRO_LOGIN + ": \"" + MSG_LOGIN + "\"");
        System.out.println("ERRO_PERMISSAO = " + ERRO_PERMISSAO + ": \"" + MSG_PERMISSAO + "\"");
        System.out.println("ERRO_ARQUIVO = " + ERRO_ARQUIVO + ": \"" + MSG_ARQUIVO + "\"");
        System.out.println("ERRO_REDE = " + ERRO_REDE + ": \"" + MSG_REDE + "\"");
        System.out.println("ERRO_MEMORIA = " + ERRO_MEMORIA + ": \"" + MSG_MEMORIA + "\"");

        System.out.println("\nSimulando erros:");
        exibirErro(ERRO_LOGIN);
        exibirErro(ERRO_ARQUIVO);
        exibirErro(ERRO_REDE);
        
        System.out.println("\nTotal de tipos de erro: 5");
        System.out.println("Erros simulados: 3");
    }

    /**
     * Exibe a mensagem de erro correspondente a um código.
     * @param codigo O código de erro.
     */
    public static void exibirErro(int codigo) {
        String mensagem;
        switch (codigo) {
            case ERRO_LOGIN:
                mensagem = MSG_LOGIN;
                break;
            case ERRO_PERMISSAO:
                mensagem = MSG_PERMISSAO;
                break;
            case ERRO_ARQUIVO:
                mensagem = MSG_ARQUIVO;
                break;
            case ERRO_REDE:
                mensagem = MSG_REDE;
                break;
            case ERRO_MEMORIA:
                mensagem = MSG_MEMORIA;
                break;
            default:
                mensagem = "Código de erro desconhecido";
        }
        System.out.println("[ERRO " + codigo + "] " + mensagem);
    }
}