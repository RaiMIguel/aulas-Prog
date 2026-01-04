package exercicios.exercicios_estrutura_dados.listaligada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaLigadaNinja equipe = new ListaLigadaNinja();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== MENU NINJA (SIMPLES LIGADA / ORDENADO POR ID) =====");
            System.out.println("1 - Inserir ninja");
            System.out.println("2 - Listar ninjas (crescente por ID)");
            System.out.println("3 - Buscar ninja por ID");
            System.out.println("4 - Atualizar ninja por ID");
            System.out.println("5 - Remover ninja por ID");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                int id;
                boolean idsearch = true;

                while (idsearch) {
                    System.out.print("ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    if (id <= 0) {
                        System.out.println("ID inválido! Use um número maior que 0.");
                    } else if (equipe.searchForId(id) != null) {
                        System.out.println("ID JÁ EXISTE!");
                    } else {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Poder de Chakra: ");
                        int poder = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Vila: ");
                        String vila = sc.nextLine();

                        boolean ok = equipe.insertOrdered(id, nome, poder, vila);
                        if (ok) {
                            System.out.println("Ninja inserido com sucesso!");
                        }
                        idsearch = false;
                    }
                }
            }

            else if (opcao == 2) {
                equipe.display();
            }

            else if (opcao == 3) {
                System.out.print("ID para buscar: ");
                int id = sc.nextInt();
                sc.nextLine();

                ListaLigadaNinja.NinjaNode ninja = equipe.searchForId(id);

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

            else if (opcao == 4) {
                System.out.print("ID do ninja a atualizar: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Novo nome (ou - para manter): ");
                String novoNome = sc.nextLine();

                System.out.print("Novo poder de Chakra (ou -1 para manter): ");
                int novoPoder = sc.nextInt();
                sc.nextLine();

                System.out.print("Nova vila (ou - para manter): ");
                String novaVila = sc.nextLine();

                boolean ok = equipe.updateForId(id, novoNome, novoPoder, novaVila);

                if (ok) {
                    System.out.println("Após atualização:");
                    ListaLigadaNinja.NinjaNode ninja = equipe.searchForId(id);
                    if (ninja != null) {
                        System.out.println(
                                ninja.id + " - " + ninja.name +
                                        " | Poder: " + ninja.powerChakra +
                                        " | Aldeia: " + ninja.village
                        );
                    }
                }
            }

            else if (opcao == 5) {
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
