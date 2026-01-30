package exercicios.exercicios_estrutura_dados.arvore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        boolean looping = true;
        while (looping) {
            System.out.println("\n===== Gerenciamento de Árvore Binária de Busca =====");
            System.out.println("1 - Inserir Nó (Produto)");
            System.out.println("2 - Listar em Ordem (Crescente por ID)");
            System.out.println("3 - Buscar por ID");
            System.out.println("4 - Atualizar Nome por ID");
            System.out.println("5 - Remover por ID");
            System.out.println("6 - Árvore (ilustração)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    if (tree.search(id) != null) {
                        System.out.println("ERRO: Este ID já existe na árvore!");
                    } else {
                        System.out.print("Digite o Nome: ");
                        String nome = scan.nextLine();
                        tree.insert(id, nome);
                        System.out.println("Inserido com sucesso!");
                    }
                    break;

                case 2:
                    if (tree.root == null) {
                        System.out.println("A árvore está vazia!");
                    } else {
                        tree.listInOrder();
                    }
                    break;

                case 3:
                    System.out.print("ID para busca: ");
                    int idBusca = scan.nextInt();
                    Node resultado = tree.search(idBusca);
                    if (resultado != null) {
                        System.out.println("Encontrado: " + resultado);
                    } else {
                        System.out.println("ID não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("ID para atualizar: ");
                    int idUpd = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scan.nextLine();
                    tree.update(idUpd, novoNome);
                    break;

                case 5:
                    System.out.print("ID para remover: ");
                    int idDel = scan.nextInt();
                    if (tree.search(idDel) != null) {
                        tree.delete(idDel);
                        System.out.println("ID " + idDel + " removido.");
                    } else {
                        System.out.println("ID não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("\n--- Estrutura Visual da Árvore ---");
                    if (tree.root == null) {
                        System.out.println("Árvore vazia!");
                    } else {
                        tree.displayTree();
                    }
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    looping = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scan.close();
    }
}