package exercicios.exercicios_estrutura_dados.arvore_avl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AvlTree productTree = new AvlTree();

        boolean looping = true;
        while (looping) {
            System.out.println("\n===== SISTEMA DE ESTOQUE (ÁRVORE AVL) =====");
            System.out.println("1  - Inserir Produto");
            System.out.println("2  - Listar (Ordem Crescente de ID)");
            System.out.println("3  - Árvore (ilustração)");
            System.out.println("4  - Buscar Produto por ID");
            System.out.println("5  - Atualizar Nome do Produto");
            System.out.println("6  - Remover Produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID do Produto: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    if (productTree.search(id) != null) {
                        System.out.println("ERRO: ID já cadastrado!");
                    } else {
                        System.out.print("Nome do Produto: ");
                        String nome = scan.nextLine();
                        productTree.insert(id, nome);
                        System.out.println("Produto inserido e árvore balanceada!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Relatório de Produtos (In-Order) ---");
                    if (productTree.root == null) System.out.println("Estoque vazio.");
                    else productTree.listInOrder();
                    break;

                case 3:
                    System.out.println("\n--- Mapa Visual da AVL (Rotacionada 90°) ---");
                    if (productTree.root == null) System.out.println("Árvore vazia.");
                    else productTree.displayTree();
                    break;

                case 4:
                    System.out.print("ID para busca: ");
                    int idBusca = scan.nextInt();
                    AVLNode encontrado = productTree.search(idBusca);
                    if (encontrado != null) System.out.println("Resultado: " + encontrado);
                    else System.out.println("Produto não encontrado.");
                    break;

                case 5:
                    System.out.print("ID para atualizar: ");
                    int idUpd = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scan.nextLine();
                    productTree.update(idUpd, novoNome);
                    break;

                case 6:
                    System.out.print("ID para remover: ");
                    int idDel = scan.nextInt();
                    if (productTree.search(idDel) != null) {
                        productTree.delete(idDel);
                        System.out.println("Produto removido e árvore rebalanceada!");
                    } else {
                        System.out.println("Erro: ID não existe.");
                    }
                    break;

                case 0:
                    System.out.println("Fechando sistema...");
                    looping = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scan.close();
    }
}