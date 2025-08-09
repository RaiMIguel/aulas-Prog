import java.util.Scanner;

public class Questoes100 {

    // Constantes para os estados
    public static final String VERDE = "VERDE";
    public static final String AMARELO = "AMARELO";
    public static final String VERMELHO = "VERMELHO";
    public static final String PISCA_AMARELO = "PISCA_AMARELO";
    
    // Constantes para os comandos
    public static final String PROXIMO = "PROXIMO";
    public static final String MANUTENCAO = "MANUTENCAO";
    public static final String NORMAL = "NORMAL";
    public static final String STATUS = "STATUS";
    public static final String SAIR = "SAIR";
    
    public static String estadoAtual = VERDE;
    public static int tempoRestante = 30; // Exemplo inicial
    public static int ciclo = 1;
    public static String modo = "NORMAL";

    /**
     * @param args
     * Enunciado: Implemente uma máquina de estados finitos usando switch case para simular um semáforo inteligente.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comando;
        
        System.out.println("=== SEMÁFORO INTELIGENTE ===");
        System.out.println("Estado inicial: " + estadoAtual);
        System.out.println("Tempo restante: " + tempoRestante + " segundos");
        System.out.println("\nComandos: PROXIMO, MANUTENCAO, NORMAL, STATUS, SAIR");
        
        do {
            System.out.print("\n> ");
            comando = scanner.nextLine().toUpperCase();
            
            switch (comando) {
                case PROXIMO:
                    transicaoProximoEstado();
                    break;
                case MANUTENCAO:
                    transicaoModoManutencao();
                    break;
                case NORMAL:
                    transicaoModoNormal();
                    break;
                case STATUS:
                    exibirStatus();
                    break;
                case SAIR:
                    System.out.println("Simulação encerrada.");
                    break;
                default:
                    System.out.println("Comando inválido. Tente novamente.");
            }
        } while (!comando.equals(SAIR));
        
        scanner.close();
    }
    
    /**
     * Muda o estado do semáforo para o próximo do ciclo normal.
     */
    public static void transicaoProximoEstado() {
        System.out.print(estadoAtual + " → ");
        switch (estadoAtual) {
            case VERDE:
                estadoAtual = AMARELO;
                tempoRestante = 5;
                break;
            case AMARELO:
                estadoAtual = VERMELHO;
                tempoRestante = 25;
                ciclo++;
                break;
            case VERMELHO:
                estadoAtual = VERDE;
                tempoRestante = 30;
                break;
            case PISCA_AMARELO:
                System.out.println("Transição inválida. Semáforo em modo de manutenção.");
                return;
        }
        System.out.println(estadoAtual);
        System.out.println("Estado atual: " + estadoAtual + " (" + tempoRestante + " segundos)");
    }
    
    /**
     * Muda o semáforo para o modo de manutenção.
     */
    public static void transicaoModoManutencao() {
        if (!modo.equals("NORMAL")) {
            System.out.println("Já está em modo de manutenção.");
            return;
        }
        System.out.print(estadoAtual + " → " + PISCA_AMARELO + "\n");
        estadoAtual = PISCA_AMARELO;
        modo = "MANUTENCAO";
        tempoRestante = -1; // Tempo indefinido
        System.out.println("Estado atual: " + PISCA_AMARELO + " (modo manutenção)");
    }

    /**
     * Retorna o semáforo ao modo de operação normal.
     */
    public static void transicaoModoNormal() {
        if (modo.equals("NORMAL")) {
            System.out.println("Já está em modo normal.");
            return;
        }
        System.out.print(estadoAtual + " → " + VERDE + "\n");
        estadoAtual = VERDE;
        modo = "NORMAL";
        tempoRestante = 30;
        System.out.println("Estado atual: " + VERDE + " (" + tempoRestante + " segundos)");
        System.out.println("Sistema retomou operação normal");
    }

    /**
     * Exibe o status atual do semáforo.
     */
    public static void exibirStatus() {
        System.out.println("Estado: " + estadoAtual);
        if (tempoRestante != -1) {
            System.out.println("Tempo restante: " + tempoRestante + " segundos");
        }
        String proximoEstado = "N/A";
        switch (estadoAtual) {
            case VERDE: proximoEstado = AMARELO; break;
            case AMARELO: proximoEstado = VERMELHO; break;
            case VERMELHO: proximoEstado = VERDE; break;
        }
        System.out.println("Próximo estado: " + proximoEstado);
        System.out.println("Modo: " + modo);
        System.out.println("Ciclo atual: " + ciclo);
    }
}