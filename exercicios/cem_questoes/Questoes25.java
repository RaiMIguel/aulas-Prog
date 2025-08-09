import java.util.Scanner;

public class Questoes25 {

    /**
     * @param args
     * Enunciado: Determine a categoria de um nadador pela idade: Infantil (5-7),
     * Juvenil (8-17), Adulto (18-65), Senior (65+). Idades fora da faixa são inválidas.
     *
     * Objetivos:
     * - Trabalhar com faixas de valores
     * - Usar else if encadeado
     * - Validar entradas
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        String categoria = determinarCategoria(idade);
        System.out.println(categoria);
        
        scanner.close();
    }

    /**
     * Determina a categoria de um nadador com base na sua idade.
     * @param idade A idade do nadador.
     * @return Uma string com a categoria ou mensagem de erro.
     */
    public static String determinarCategoria(int idade) {
        if (idade < 5) {
            return "Muito jovem para competir";
        } else if (idade >= 5 && idade <= 7) {
            return "Nadador de " + idade + " anos: Categoria Infantil";
        } else if (idade >= 8 && idade <= 17) {
            return "Nadador de " + idade + " anos: Categoria Juvenil";
        } else if (idade >= 18 && idade <= 65) {
            return "Nadador de " + idade + " anos: Categoria Adulto";
        } else if (idade > 65) { // idade > 65
            return "Nadador de " + idade + " anos: Categoria Senior";
        }

        return "Idade invalida";
    }
}