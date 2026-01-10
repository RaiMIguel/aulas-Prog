package exercicios.exercicios_estrutura_dados.ListaCIrcularDuplamenteLigada;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCircularDupla equipe = new ListaCircularDupla();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== SISTEMA NINJA CIRCULAR DUPLO ===");
            System.out.println("1 - Inserir Ninja");
            System.out.println("2 - Listar Equipa");
            System.out.println("3 - Atualizar Ninja");
            System.out.println("4 - Remover Ninja");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    equipe.insert(id, nome);
                    break;
                case 2:
                    equipe.display();
                    break;
                case 3:
                    System.out.print("ID para atualizar: ");
                    int idUp = sc.nextInt(); sc.nextLine();
                    System.out.print("Novo Nome: ");
                    String nNome = sc.nextLine();
                    if (equipe.update(idUp, nNome)) System.out.println("Atualizado!");
                    else System.out.println("Não encontrado!");
                    break;
                case 4:
                    System.out.print("ID para remover: ");
                    int idRem = sc.nextInt(); sc.nextLine();
                    if (equipe.remove(idRem)) System.out.println("Removido com sucesso!");
                    else System.out.println("ID inexistente.");
                    break;
            }
        }
        sc.close();
    }
}