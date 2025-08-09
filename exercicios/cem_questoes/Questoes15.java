import java.util.Scanner;

public class Questoes15 {

    /**
     * @param args
     *             Enunciado: Crie um programa que leia a idade do usuário e informe
     *             há quantos anos ele nasceu.
     *
     *             Objetivos:
     *             - Ler entrada numérica
     *             - Realizar cálculo simples
     *             - Trabalhar com ano atual
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ANO_ATUAL = 2024;

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida. A idade deve ser um número positivo.");
        }
        int anoNascimento = ANO_ATUAL - idade;
        System.out.println("Você tem " + idade + " anos.");
        System.out.println("Você nasceu em: " + anoNascimento);

        scanner.close();
    }
}