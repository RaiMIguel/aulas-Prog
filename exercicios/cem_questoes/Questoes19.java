import java.util.Scanner;

public class Questoes19 {

    /**
     * @param args
     * Enunciado: Crie um programa que peça a idade do usuário e continue
     * pedindo até que uma idade válida (0-120) seja inserida.
     *
     * Objetivos:
     * - Validar entrada do usuário
     * - Usar laços para repetição
     * - Tratar entradas inválidas
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        
        do {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
            String mensagem = (idade >= 0 && idade <= 120) 
                              ? "Idade válida registrada: " + idade + " anos" 
                              : "Idade inválida! Digite novamente:";
            System.out.println(mensagem);
        } while (idade < 0 || idade > 120);
        
        scanner.close();
    }
}
