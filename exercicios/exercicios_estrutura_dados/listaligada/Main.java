package exercicios.exercicios_estrutura_dados.listaligada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaLigadaNinja equipe = new ListaLigadaNinja();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== MENU NINJA =====");
            System.out.println("1 - Inserir ninja no final");
            System.out.println("2 - Listar ninjas");
            System.out.println("3 - Buscar ninja");
            System.out.println("4 - Atualizar ninja");
            System.out.println("5 - Remover ninja");
            System.out.println("6 - Listar ninjas ao contrário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Poder de Chakra: ");
                int poder = sc.nextInt();
                sc.nextLine();

                System.out.print("Vila: ");
                String vila = sc.nextLine();

                equipe.insertEnd(nome, poder, vila);
                System.out.println("Ninja inserido com sucesso!");
            }

            else if (opcao == 2) {
                equipe.display();
            }

            else if (opcao == 3) {
                System.out.print("Nome para buscar: ");
                String nome = sc.nextLine();

                ListaLigadaNinja.NinjaNode ninja = equipe.searchForName(nome);

                if (ninja != null) {
                    System.out.println("Ninja encontrado!");
                    System.out.println(
                            "Nome: " + ninja.name +
                                    " | Poder: " + ninja.powerChakra +
                                    " | Vila: " + ninja.village
                    );
                } else {
                    System.out.println("Ninja não encontrado.");
                }
            }

            else if (opcao == 4) {
                System.out.print("Nome do ninja a atualizar: ");
                String nomeAntigo = sc.nextLine();

                System.out.print("Novo nome: ");
                String novoNome = sc.nextLine();

                System.out.print("Novo poder de Chakra: ");
                int novoPoder = sc.nextInt();
                sc.nextLine();

                System.out.print("Nova vila: ");
                String novaVila = sc.nextLine();

                equipe.updateForName(nomeAntigo, novoNome, novoPoder, novaVila);
            }

            else if (opcao == 5) {
                System.out.print("Nome do ninja a remover: ");
                String nome = sc.nextLine();

                equipe.removeForName(nome);
            }

            else if (opcao == 6) {
                equipe.displayReverse();
            }

            else if (opcao == 0) {
                System.out.println("Encerrando sistema ninja...");
            }

            else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
