import java.util.Scanner;

public class Questoes97 {

    /**
     * @param args
     * Enunciado: Crie um menu de opções para um sistema ninja usando switch case.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE GERENCIAMENTO NINJA ===");
            System.out.println("1 - Cadastrar Ninja\n2 - Listar Ninjas\n3 - Buscar Ninja\n4 - Atribuir Missão\n5 - Relatórios\n0 - Sair");
            System.out.print("\nDigite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("\n=== CADASTRAR NOVO NINJA ===");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Rank: ");
                    String rank = scanner.nextLine();
                    System.out.println("Ninja " + nome + " cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n=== LISTAR NINJAS ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    break;
                case 3:
                    System.out.println("\n=== BUSCAR NINJA ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    break;
                case 4:
                    System.out.println("\n=== ATRIBUIR MISSÃO ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    break;
                case 5:
                    System.out.println("\n=== RELATÓRIOS ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    break;
                case 0:
                    System.out.println("\nSaindo do sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
            if (opcao != 0) {
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
            }
        } while (opcao != 0);

        scanner.close();
    }
}