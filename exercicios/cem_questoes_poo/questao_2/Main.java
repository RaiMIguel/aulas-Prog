package exercicios.cem_questoes_poo.questao_2;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do jutsu: ");
        String nome = scanner.nextLine();
        System.out.print("digite o tipo jutsu: ");
        String tipo = scanner.nextLine();

        Jutsu jutsu = new Jutsu(nome,tipo);
        System.out.println("nome do jutsu: " + jutsu.getNome());
        System.out.println("tipo do jutsu: " + jutsu.getTipo());

        System.out.print("deseja alterar o nome e tipo? s/n: ");
        String opcao = scanner.nextLine();

        if(opcao.equals("s")){
            System.out.print("novo nome: ");
            nome = scanner.nextLine();
            System.out.print("novo tipo: ");
            tipo = scanner.nextLine();

            jutsu.setNome(nome);
            jutsu.setTipo(tipo);

            System.out.println("nome do jutsu: " + jutsu.getNome());
            System.out.println("tipo do jutsu: " + jutsu.getTipo());

            }else {
                System.out.println("fim do programa");
            }

        scanner.close();
    }
}
