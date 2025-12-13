import java.util.Scanner;

public class Questoes99 {

    /**
     * @param args
     * Enunciado: Crie um sistema de navegação de menus aninhados usando switch case.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoMenuPrincipal = -1;
        
        do {
            System.out.println("\n=== SISTEMA NINJA - MENU PRINCIPAL ===");
            System.out.println("1 - Gerenciar Ninjas\n2 - Missões\n0 - Sair");
            System.out.print("Opção: ");
            opcaoMenuPrincipal = scanner.nextInt();
            
            switch (opcaoMenuPrincipal) {
                case 1:
                    menuGerenciarNinjas(scanner);
                    break;
                case 2:
                    menuMissoes(scanner);
                    break;
                case 0:
                    System.out.println("\nSaindo do sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcaoMenuPrincipal != 0);
        
        scanner.close();
    }
    
    public static void menuGerenciarNinjas(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n=== GERENCIAR NINJAS ===");
            System.out.println("1 - Cadastrar Ninja\n2 - Listar Ninjas\n3 - Voltar ao Menu Principal");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("\n=== CADASTRAR NINJA ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    break;
                case 2:
                    System.out.println("\n=== LISTAR NINJAS ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    break;
                case 3:
                    System.out.println("\nVoltando ao menu anterior...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
            if (opcao != 3) {
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine();
            }
        } while (opcao != 3);
    }
    
    public static void menuMissoes(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n=== MISSÕES ===");
            System.out.println("1 - Nova Missão\n2 - Listar Missões\n3 - Voltar ao Menu Principal");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("\n=== NOVA MISSÃO ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    break;
                case 2:
                    System.out.println("\n=== LISTAR MISSÕES ===");
                    System.out.println("Funcionalidade em desenvolvimento...");
                    break;
                case 3:
                    System.out.println("\nVoltando ao menu anterior...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
            if (opcao != 3) {
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine();
            }
        } while (opcao != 3);
    }
}