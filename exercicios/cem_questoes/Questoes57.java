import java.util.ArrayList;
import java.util.Scanner;

public class Questoes57 {

    /**
     * @param args
     * Enunciado: Crie um sistema de cadastro de tarefas. O usuário pode adicionar,
     * listar e remover tarefas.
     *
     * Objetivos:
     * - Criar menu interativo
     * - Manipular ArrayList dinamicamente
     * - Implementar CRUD básico
     */
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarTarefa(scanner, tarefas);
                    break;
                case 2:
                    listarTarefas(tarefas);
                    break;
                case 3:
                    removerTarefa(scanner, tarefas);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        
        scanner.close();
    }

    /**
     * Exibe o menu de opções do sistema de tarefas.
     */
    public static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE TAREFAS ===");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Remover tarefa");
        System.out.println("0 - Sair");
        System.out.println("-------------------------");
    }

    /**
     * Adiciona uma nova tarefa ao ArrayList.
     * @param scanner O objeto Scanner para leitura da entrada.
     * @param tarefas O ArrayList de tarefas.
     */
    public static void adicionarTarefa(Scanner scanner, ArrayList<String> tarefas) {
        System.out.print("Digite a tarefa: ");
        String novaTarefa = scanner.nextLine();
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    /**
     * Lista todas as tarefas do ArrayList.
     * @param tarefas O ArrayList de tarefas.
     */
    public static void listarTarefas(ArrayList<String> tarefas) {
        System.out.println("\n=== SUAS TAREFAS ===");
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
        System.out.println("Total: " + tarefas.size() + " tarefa(s)");
    }

    /**
     * Remove uma tarefa do ArrayList com base no seu índice.
     * @param scanner O objeto Scanner para leitura da entrada.
     * @param tarefas O ArrayList de tarefas.
     */
    public static void removerTarefa(Scanner scanner, ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa para remover.");
            return;
        }
        
        listarTarefas(tarefas);
        System.out.print("Digite o número da tarefa a remover: ");
        int indice = scanner.nextInt();
        
        if (indice > 0 && indice <= tarefas.size()) {
            String tarefaRemovida = tarefas.remove(indice - 1);
            System.out.println("Tarefa \"" + tarefaRemovida + "\" removida com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}