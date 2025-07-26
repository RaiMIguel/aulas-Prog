import java.util.ArrayList;
import java.util.Scanner;

public class Questoes57 {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String novaTarefa = scanner.nextLine();
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("=== SUAS TAREFAS ===");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                        System.out.println("Total: " + tarefas.size() + " tarefa(s)");
                    }
                    break;
                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas para remover.");
                        break;
                    }
                    System.out.println("=== REMOVER TAREFA ===");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                    System.out.print("Digite o número da tarefa a remover: ");
                    int indiceRemover = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (indiceRemover > 0 && indiceRemover <= tarefas.size()) {
                        String tarefaRemovida = tarefas.remove(indiceRemover - 1);
                        System.out.println("Tarefa \"" + tarefaRemovida + "\" removida com sucesso!");
                    } else {
                        System.out.println("Número de tarefa inválido.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema de tarefas. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}