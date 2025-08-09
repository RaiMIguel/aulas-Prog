import java.util.Scanner;

public class Questoes30 {

    /**
     * @param args
     * Enunciado: Implemente um validador básico de CPF. Verifique se tem
     * 11 dígitos e se não é uma sequência igual (111.111.111-11).
     *
     * Objetivos:
     * - Validar formato de documento
     * - Trabalhar com strings
     * - Múltiplas validações
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o CPF (apenas números): ");
        String cpf = scanner.nextLine();

        if (validarCpf(cpf)) {
            String cpfFormatado = formatarCpf(cpf);
            System.out.println("\nCPF: " + cpfFormatado);
            System.out.println("Status: Formato válido (verificação básica)");
        } else {
            System.out.println("\nStatus: Formato inválido.");
        }
        
        scanner.close();
    }

    /**
     * Valida um CPF com base em regras básicas.
     * @param cpf O CPF a ser validado.
     * @return true se o CPF for válido, false caso contrário.
     */
    public static boolean validarCpf(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }
        
        char primeiroDigito = cpf.charAt(0);
        boolean sequenciaIgual = true;
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != primeiroDigito) {
                sequenciaIgual = false;
                break;
            }
        }
        return !sequenciaIgual;
    }

    /**
     * Formata uma string de 11 dígitos como um CPF.
     * @param cpf A string do CPF (apenas números).
     * @return O CPF formatado (###.###.###-##).
     */
    public static String formatarCpf(String cpf) {
        return cpf.substring(0, 3) + "." +
               cpf.substring(3, 6) + "." +
               cpf.substring(6, 9) + "-" +
               cpf.substring(9, 11);
    }
}