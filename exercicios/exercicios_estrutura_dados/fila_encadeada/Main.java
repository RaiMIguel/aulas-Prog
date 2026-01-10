package exercicios.exercicios_estrutura_dados.fila_encadeada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaNinja fila = new FilaNinja();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- MENU FILA NINJA (FIFO) ---");
            System.out.println("1 - Enqueue (Entrar na Fila)");
            System.out.println("2 - Dequeue (Sair da Fila)");
            System.out.println("3 - Exibir Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome do Ninja: ");
                    String nome = sc.nextLine();
                    fila.enqueue(id, nome);
                    System.out.println(nome + " entrou na fila.");
                    break;

                case 2:
                    FilaNinja.Node removido = fila.dequeue();
                    if (removido != null) {
                        System.out.println("Atendendo ninja: " + removido.nome);
                    } else {
                        System.out.println("Fila vazia, ninguém para atender.");
                    }
                    break;

                case 3:
                    fila.display();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}