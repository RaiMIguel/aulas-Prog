import java.util.Scanner;

public class Questoes97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE GERENCIAMENTO NINJA ===");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Buscar Ninja");
            System.out.println("4 - Atribuir Missão");
            System.out.println("5 - Relatórios");
            System.out.println("0 - Sair");
            System.out.print("\nDigite sua opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número.");
                System.out.print("Digite sua opção: ");
                scanner.next();
            }
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

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
                    System.out.println("Funcionalidade de listagem de ninjas...");
                    break;
                case 3:
                    System.out.println("\n=== BUSCAR NINJA ===");
                    System.out.println("Funcionalidade de busca de ninjas...");
                    break;
                case 4:
                    System.out.println("\n=== ATRIBUIR MISSÃO ===");
                    System.out.println("Funcionalidade de atribuição de missões...");
                    break;
                case 5:
                    System.out.println("\n=== RELATÓRIOS ===");
                    System.out.println("Funcionalidade de relatórios...");
                    break;
                case 0:
                    System.out.println("\nSaindo do Sistema de Gerenciamento Ninja. Adeus!");
                    break;
                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma opção de 0 a 5.");
            }

            if (opcao != 0) {
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
            }

        } while (opcao != 0);

        scanner.close();
    }
}