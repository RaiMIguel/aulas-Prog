public class Questoes81 {
    public static void main(String[] args) {
        String[] emails = {
            "naruto@konoha.com",
            "sasuke.uchiha@gmail",
            "@teste.com",
            "sakura@",
            "kakashi@anbu.ninja.academy.com.br", // Exemplo mais complexo
            "email@.com", // Ponto logo após @
            "email@dominio" // Sem ponto
        };

        System.out.println("Validando emails:\n");

        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            System.out.println((i + 1) + ". \"" + email + "\"");
            boolean valido = true;
            String motivoInvalido = "";

            int atIndex = email.indexOf('@');
            int lastAtIndex = email.lastIndexOf('@');

            // Regra 1: Deve ter exatamente 1 @
            if (atIndex == -1 || atIndex != lastAtIndex) {
                System.out.println("   ✗ Não tem exatamente 1 @");
                valido = false;
                motivoInvalido = "Número incorreto de '@'";
            } else {
                System.out.println("   ✓ Tem exatamente 1 @");

                // Regra 3: Parte antes do @ não está vazia
                if (atIndex == 0) {
                    System.out.println("   ✗ Parte antes do @ está vazia");
                    valido = false;
                    motivoInvalido = "Parte antes do '@' vazia";
                } else {
                    System.out.println("   ✓ Parte antes do @ não está vazia");
                }

                // Regra 4: Parte após @ não está vazia
                if (atIndex == email.length() - 1) {
                    System.out.println("   ✗ Parte após @ está vazia");
                    valido = false;
                    motivoInvalido = "Parte após o '@' vazia";
                } else {
                    System.out.println("   ✓ Parte após @ não está vazia");
                }

                // Se as validações básicas de @ e partes não vazias passaram, verifica o ponto
                if (valido) {
                    String dominio = email.substring(atIndex + 1);
                    int dotIndex = dominio.indexOf('.');

                    // Regra 2: Deve ter pelo menos 1 . após @ e não ser o primeiro caractere após @
                    if (dotIndex == -1 || dotIndex == 0) { // dotIndex == 0 significa que o ponto está logo após o '@'
                        System.out.println("   ✗ Não tem ponto após @ ou ponto está na posição incorreta");
                        valido = false;
                        motivoInvalido = "Ponto ausente ou mal posicionado após '@'";
                    } else {
                        System.out.println("   ✓ Tem pelo menos 1 ponto após @");
                    }
                }
            }
            
            if (valido) {
                System.out.println("   Resultado: Email VÁLIDO");
            } else {
                System.out.println("   Resultado: Email INVÁLIDO" + (motivoInvalido.isEmpty() ? "" : " (" + motivoInvalido + ")"));
            }
            System.out.println();
        }
    }
}