public class Questoes95 {

    // Constantes para códigos de erro
    public static final int ERRO_LOGIN_COD = 1001;
    public static final String ERRO_LOGIN_MSG = "Usuário ou senha inválidos";

    public static final int ERRO_PERMISSAO_COD = 1002;
    public static final String ERRO_PERMISSAO_MSG = "Acesso negado";

    public static final int ERRO_ARQUIVO_COD = 1003;
    public static final String ERRO_ARQUIVO_MSG = "Arquivo não encontrado";

    public static final int ERRO_REDE_COD = 1004;
    public static final String ERRO_REDE_MSG = "Falha na conexão";

    public static final int ERRO_MEMORIA_COD = 1005;
    public static final String ERRO_MEMORIA_MSG = "Memória insuficiente";

    // Método para exibir o erro formatado
    public static void exibirErro(int codigoErro) {
        String mensagem = "Erro desconhecido";
        switch (codigoErro) {
            case ERRO_LOGIN_COD:
                mensagem = ERRO_LOGIN_MSG;
                break;
            case ERRO_PERMISSAO_COD:
                mensagem = ERRO_PERMISSAO_MSG;
                break;
            case ERRO_ARQUIVO_COD:
                mensagem = ERRO_ARQUIVO_MSG;
                break;
            case ERRO_REDE_COD:
                mensagem = ERRO_REDE_MSG;
                break;
            case ERRO_MEMORIA_COD:
                mensagem = ERRO_MEMORIA_MSG;
                break;
        }
        System.out.println("[ERRO " + codigoErro + "] " + mensagem);
    }

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CÓDIGOS DE ERRO ===");

        System.out.println("\nConstantes definidas:");
        System.out.println("ERRO_LOGIN = " + ERRO_LOGIN_COD + ": \"" + ERRO_LOGIN_MSG + "\"");
        System.out.println("ERRO_PERMISSAO = " + ERRO_PERMISSAO_COD + ": \"" + ERRO_PERMISSAO_MSG + "\"");
        System.out.println("ERRO_ARQUIVO = " + ERRO_ARQUIVO_COD + ": \"" + ERRO_ARQUIVO_MSG + "\"");
        System.out.println("ERRO_REDE = " + ERRO_REDE_COD + ": \"" + ERRO_REDE_MSG + "\"");
        System.out.println("ERRO_MEMORIA = " + ERRO_MEMORIA_COD + ": \"" + ERRO_MEMORIA_MSG + "\"");

        System.out.println("\nSimulando erros:");
        exibirErro(ERRO_LOGIN_COD);
        exibirErro(ERRO_ARQUIVO_COD);
        exibirErro(ERRO_REDE_COD);
        exibirErro(9999); // Simular um erro desconhecido

        System.out.println("\nTotal de tipos de erro: 5");
        System.out.println("Erros simulados: 4");
    }
}