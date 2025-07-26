import java.util.Scanner;

public class Questoes99 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        int opcaoPrincipal;
        do {
            System.out.println("\n=== SISTEMA NINJA - MENU PRINCIPAL ===");
            System.out.println("1 - Gerenciar Ninjas");
            System.out.println("2 - Missões");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcaoPrincipal = obterOpcaoValida();

            switch (opcaoPrincipal) {
                case 1:
                    menuGerenciarNinjas();
                    break;
                case 2:
                    menuMissoes();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcaoPrincipal != 0);
    }

    private static void menuGerenciarNinjas() {
        int opcaoNinjas;
        do {
            System.out.println("\n=== GERENCIAR NINJAS ===");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Voltar ao Menu Principal");
            System.out.print("Opção: ");

            opcaoNinjas = obterOpcaoValida();

            switch (opcaoNinjas) {
                case 1:
                    System.out.println("\n=== CADASTRAR NINJA ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    System.out.println("Voltando ao menu anterior...");
                    break;
                case 2:
                    System.out.println("\n=== LISTAR NINJAS ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    System.out.println("Voltando ao menu anterior...");
                    break;
                case 3:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcaoNinjas != 3);
    }

    private static void menuMissoes() {
        int opcaoMissoes;
        do {
            System.out.println("\n=== MISSÕES ===");
            System.out.println("1 - Nova Missão");
            System.out.println("2 - Listar Missões");
            System.out.println("3 - Voltar ao Menu Principal");
            System.out.print("Opção: ");

            opcaoMissoes = obterOpcaoValida();

            switch (opcaoMissoes) {
                case 1:
                    System.out.println("\n=== NOVA MISSÃO ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    System.out.println("Voltando ao menu anterior...");
                    break;
                case 2:
                    System.out.println("\n=== LISTAR MISSÕES ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    System.out.println("Voltando ao menu anterior...");
                    break;
                case 3:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcaoMissoes != 3);
    }

    private static int obterOpcaoValida() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            System.out.print("Opção: ");
            scanner.next();
        }
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        return opcao;
    }
}