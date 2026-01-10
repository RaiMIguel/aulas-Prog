package exercicios.exercicios_estrutura_dados.pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaNinja pilha = new PilhaNinja();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- MENU PILHA NINJA ---");
            System.out.println("1 - Push (Empilhar Ninja)");
            System.out.println("2 - Pop (Desempilhar Ninja)");
            System.out.println("3 - Peek (Ver Topo)");
            System.out.println("4 - Exibir Pilha");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome do Ninja: ");
                    String nome = sc.nextLine();
                    pilha.push(id, nome);
                    System.out.println("Ninja empilhado!");
                    break;

                case 2:
                    PilhaNinja.Node removido = pilha.pop();
                    if (removido != null) {
                        System.out.println("Desempilhado: " + removido.nome);
                    } else {
                        System.out.println("Nada para remover.");
                    }
                    break;

                case 3:
                    PilhaNinja.Node topo = pilha.peek();
                    if (topo != null) {
                        System.out.println("No topo agora: " + topo.nome + " (ID: " + topo.id + ")");
                    } else {
                        System.out.println("Pilha vazia.");
                    }
                    break;

                case 4:
                    pilha.display();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}