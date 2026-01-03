package exercicios.exercicios_estrutura_dados.listaduplamenteligada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaDuplamenteLigada equipe = new ListaDuplamenteLigada();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== MENU NINJA (ORDENADO POR ID) =====");
            System.out.println("1 - Inserir ninja (gera ID automático)");
            System.out.println("2 - Listar ninjas (crescente por ID)");
            System.out.println("3 - Listar ninjas ao contrário (decrescente por ID)");
            System.out.println("4 - Buscar ninja por ID");
            System.out.println("5 - Atualizar ninja por ID");
            System.out.println("6 - Remover ninja por ID");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Poder de Chakra: ");
                int poder = sc.nextInt();
                sc.nextLine();

                System.out.print("Vila: ");
                String vila = sc.nextLine();

                int idGerado = equipe.insertOrdered(nome, poder, vila);
                System.out.println("Ninja inserido com sucesso! ID gerado: " + idGerado);

                if (equipe.getSize() == 5) {
                    System.out.println("\nVocê adicionou 5 ninjas. Exibindo todos em ordem:");
                    equipe.display();
                }
            }

            else if (opcao == 2) {
                equipe.display();
            }

            else if (opcao == 3) {
                equipe.displayReverse();
            }

            else if (opcao == 4) {
                System.out.print("ID para buscar: ");
                int id = sc.nextInt();
                sc.nextLine();

                ListaDuplamenteLigada.NinjaNode ninja = equipe.searchForId(id);

                if (ninja != null) {
                    System.out.println("Ninja encontrado!");
                    System.out.println(
                            ninja.id + " - " + ninja.name +
                                    " | Poder: " + ninja.powerChakra +
                                    " | Aldeia: " + ninja.village
                    );
                } else {
                    System.out.println("ID não encontrado.");
                }
            }

            else if (opcao == 5) {
                System.out.print("ID do ninja a atualizar: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Novo nome: ");
                String novoNome = sc.nextLine();

                System.out.print("Novo poder de Chakra: ");
                int novoPoder = sc.nextInt();
                sc.nextLine();

                System.out.print("Nova vila: ");
                String novaVila = sc.nextLine();

                equipe.updateForId(id, novoNome, novoPoder, novaVila);
            }

            else if (opcao == 6) {
                System.out.print("ID do ninja a remover: ");
                int id = sc.nextInt();
                sc.nextLine();

                equipe.removeForId(id);
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
