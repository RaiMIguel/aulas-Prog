import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Questoes100 {

    // Enum para os estados do semáforo
    enum EstadoSemaforo {
        VERDE,
        AMARELO,
        VERMELHO,
        PISCA_AMARELO // Modo de manutenção
    }

    private static EstadoSemaforo estadoAtual = EstadoSemaforo.VERDE;
    private static long tempoInicialEstado;
    private static int cicloAtual = 1;
    private static ScheduledExecutorService scheduler;
    private static boolean emManutencao = false;

    // Tempos de duração para cada estado (em segundos)
    private static final int TEMPO_VERDE = 30;
    private static final int TEMPO_AMARELO = 5;
    private static final int TEMPO_VERMELHO = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== SEMÁFORO INTELIGENTE ===");

        iniciarSimulacao();

        System.out.println("Comandos: PROXIMO, MANUTENCAO, NORMAL, STATUS, SAIR");

        String comando;
        do {
            System.out.print("\n> ");
            comando = scanner.nextLine().trim().toUpperCase();

            switch (comando) {
                case "PROXIMO":
                    transitarProximoEstado();
                    break;
                case "MANUTENCAO":
                    entrarModoManutencao();
                    break;
                case "NORMAL":
                    sairModoManutencao();
                    break;
                case "STATUS":
                    exibirStatus();
                    break;
                case "SAIR":
                    System.out.println("Encerrando semáforo inteligente.");
                    break;
                default:
                    System.out.println("Comando inválido. Tente novamente.");
            }
        } while (!comando.equals("SAIR"));

        pararSimulacao();
        scanner.close();
    }

    private static void iniciarSimulacao() {
        tempoInicialEstado = System.currentTimeMillis();
        System.out.println("Estado inicial: " + estadoAtual);
        System.out.println("Tempo restante: " + getTempoRestante(estadoAtual, tempoInicialEstado) + " segundos");

        scheduler = Executors.newSingleThreadScheduledExecutor();
        // A cada segundo, atualiza o tempo restante para o estado atual (se não estiver em manutenção)
        scheduler.scheduleAtFixedRate(() -> {
            if (!emManutencao) {
                // Aqui você pode adicionar lógica para transição automática se desejar
                // Por exemplo, if (getTempoRestante(estadoAtual, tempoInicialEstado) <= 0) transitarProximoEstado();
            }
        }, 1, 1, TimeUnit.SECONDS);
    }

    private static void pararSimulacao() {
        if (scheduler != null && !scheduler.isShutdown()) {
            scheduler.shutdownNow();
        }
    }

    private static void transitarProximoEstado() {
        if (emManutencao) {
            System.out.println("Não é possível transitar de estado em modo de manutenção.");
            return;
        }

        EstadoSemaforo proximoEstado;
        switch (estadoAtual) {
            case VERDE:
                proximoEstado = EstadoSemaforo.AMARELO;
                break;
            case AMARELO:
                proximoEstado = EstadoSemaforo.VERMELHO;
                break;
            case VERMELHO:
                proximoEstado = EstadoSemaforo.VERDE;
                cicloAtual++;
                break;
            default: // Não deveria acontecer, mas para segurança
                proximoEstado = EstadoSemaforo.VERDE;
                break;
        }
        System.out.println(estadoAtual + " → " + proximoEstado);
        estadoAtual = proximoEstado;
        tempoInicialEstado = System.currentTimeMillis(); // Reinicia o tempo para o novo estado
        exibirStatusCurto();
    }

    private static void entrarModoManutencao() {
        if (emManutencao) {
            System.out.println("Já está em modo de manutenção.");
            return;
        }
        System.out.println(estadoAtual + " → " + EstadoSemaforo.PISCA_AMARELO);
        estadoAtual = EstadoSemaforo.PISCA_AMARELO;
        emManutencao = true;
        System.out.println("Estado atual: PISCA_AMARELO (modo manutenção)");
    }

    private static void sairModoManutencao() {
        if (!emManutencao) {
            System.out.println("Não está em modo de manutenção.");
            return;
        }
        System.out.println(estadoAtual + " → " + EstadoSemaforo.VERDE);
        estadoAtual = EstadoSemaforo.VERDE; // Retorna para VERDE
        emManutencao = false;
        tempoInicialEstado = System.currentTimeMillis(); // Reinicia o tempo
        System.out.println("Estado atual: VERDE (" + TEMPO_VERDE + " segundos)");
        System.out.println("Sistema retomou operação normal");
    }

    private static void exibirStatus() {
        System.out.println("Estado: " + estadoAtual);
        if (emManutencao) {
            System.out.println("Modo: MANUTENÇÃO");
            System.out.println("Tempo restante: N/A");
            System.out.println("Próximo estado: N/A");
        } else {
            System.out.println("Tempo restante: " + getTempoRestante(estadoAtual, tempoInicialEstado) + " segundos");
            System.out.println("Próximo estado: " + getProximoEstadoNome(estadoAtual));
            System.out.println("Modo: NORMAL");
        }
        System.out.println("Ciclo atual: " + cicloAtual);
    }

    private static void exibirStatusCurto() {
        System.out.print("Estado atual: " + estadoAtual);
        if (estadoAtual == EstadoSemaforo.VERDE) {
            System.out.println(" (" + TEMPO_VERDE + " segundos)");
        } else if (estadoAtual == EstadoSemaforo.AMARELO) {
            System.out.println(" (" + TEMPO_AMARELO + " segundos)");
        } else if (estadoAtual == EstadoSemaforo.VERMELHO) {
            System.out.println(" (" + TEMPO_VERMELHO + " segundos)");
        } else {
            System.out.println();
        }
    }

    private static long getTempoRestante(EstadoSemaforo estado, long inicio) {
        long tempoDecorrido = (System.currentTimeMillis() - inicio) / 1000; // Em segundos
        int duracaoTotal;
        switch (estado) {
            case VERDE:
                duracaoTotal = TEMPO_VERDE;
                break;
            case AMARELO:
                duracaoTotal = TEMPO_AMARELO;
                break;
            case VERMELHO:
                duracaoTotal = TEMPO_VERMELHO;
                break;
            default:
                return 0; // Para PISCA_AMARELO ou outros que não têm tempo fixo
        }
        return Math.max(0, duracaoTotal - tempoDecorrido);
    }

    private static String getProximoEstadoNome(EstadoSemaforo estado) {
        switch (estado) {
            case VERDE: return "AMARELO";
            case AMARELO: return "VERMELHO";
            case VERMELHO: return "VERDE";
            default: return "N/A";
        }
    }
}