import java.util.Scanner;

public class Questoes16 {

    /**
     * @param args
     * Enunciado: Leia nome, idade e salário de uma pessoa e exiba um relatório
     * formatado como uma ficha de funcionário.
     *
     * Objetivos:
     * - Ler diferentes tipos de dados
     * - Formatar números decimais
     * - Criar saída profissional
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        exibirFichaFuncionario(nome, idade, salario);
        
        scanner.close();
    }

    /**
     * Exibe um relatório formatado com os dados do funcionário.
     * @param nome O nome do funcionário.
     * @param idade A idade do funcionário.
     * @param salario O salário do funcionário.
     */
    public static void exibirFichaFuncionario(String nome, int idade, double salario) {
        System.out.println("===============================");
        System.out.println("        FICHA FUNCIONÁRIO      ");
        System.out.println("===============================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.println("===============================");
    }
}