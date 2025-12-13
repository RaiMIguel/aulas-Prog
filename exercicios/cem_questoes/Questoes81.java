public class Questoes81 {

    /**
     * @param args
     * Enunciado: Implemente um validador básico de email.
     *
     * Objetivos:
     * - Validar formato básico de email
     * - Verificar presença de @ e .
     * - Implementar regras simples
     */
    public static void main(String[] args) {
        String[] emails = {"naruto@konoha.com", "sasuke.uchiha@gmail", "@teste.com", "sakura@"};
        
        System.out.println("Validando emails:");
        for (int i = 0; i < emails.length; i++) {
            System.out.println("\n" + (i + 1) + ". \"" + emails[i] + "\"");
            validarEmail(emails[i]);
        }
    }

    /**
     * Valida um email com base em regras básicas de formatação.
     * @param email O email a ser validado.
     * @return true se o email for válido, false caso contrário.
     */
    public static boolean validarEmail(String email) {
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        boolean temExatamenteUmArroba = atIndex != -1 && atIndex == email.lastIndexOf('@');
        boolean temPontoAposArroba = atIndex < dotIndex;
        boolean parteAntesNaoVazia = atIndex > 0;
        boolean parteDepoisNaoVazia = dotIndex < email.length() - 1 && atIndex < dotIndex - 1;

        if (temExatamenteUmArroba) {
            System.out.println("   ✓ Tem exatamente 1 @");
        } else {
            System.out.println("   ✗ Tem exatamente 1 @");
        }
        
        if (temPontoAposArroba) {
            System.out.println("   ✓ Tem pelo menos 1 ponto após @");
        } else {
            System.out.println("   ✗ Não tem ponto após @");
        }
        
        if (parteAntesNaoVazia) {
            System.out.println("   ✓ Parte antes do @ não está vazia");
        } else {
            System.out.println("   ✗ Parte antes do @ está vazia");
        }
        
        if (parteDepoisNaoVazia) {
            System.out.println("   ✓ Parte após @ não está vazia");
        } else {
            System.out.println("   ✗ Parte após @ está vazia");
        }

        if (temExatamenteUmArroba && temPontoAposArroba && parteAntesNaoVazia && parteDepoisNaoVazia) {
            System.out.println("   Resultado: Email VÁLIDO");
            return true;
        } else {
            System.out.println("   Resultado: Email INVÁLIDO");
            return false;
        }
    }
}