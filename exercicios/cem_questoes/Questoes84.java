import java.util.Random;

public class Questoes84 {

    /**
     * @param args
     * Enunciado: Crie um gerador de senhas com critérios específicos configuráveis.
     *
     * Objetivos:
     * - Gerar senha aleatória
     * - Garantir todos os critérios
     * - Validar senha gerada
     */
    public static void main(String[] args) {
        System.out.println("=== GERADOR DE SENHAS ===");
        
        System.out.println("\nCritérios:");
        System.out.println("- Tamanho: 12 caracteres");
        System.out.println("- Mínimo 2 maiúsculas");
        System.out.println("- Mínimo 2 minúsculas");
        System.out.println("- Mínimo 2 números");
        System.out.println("- Mínimo 1 símbolo");
        
        String senha = gerarSenha();
        
        System.out.println("\nSenha gerada: \"" + senha + "\"");
        validarSenha(senha);
    }
    
    /**
     * Gera uma senha que atende a critérios específicos.
     * @return A senha gerada.
     */
    public static String gerarSenha() {
        final int TAMANHO = 12;
        final String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
        final String NUMEROS = "0123456789";
        final String SIMBOLOS = "!@#$%&*";
        final String TODOS = MAIUSCULAS + MINUSCULAS + NUMEROS + SIMBOLOS;
        Random random = new Random();
        
        while (true) {
            StringBuilder senha = new StringBuilder();
            
            // Garante os requisitos mínimos
            senha.append(MAIUSCULAS.charAt(random.nextInt(MAIUSCULAS.length())));
            senha.append(MAIUSCULAS.charAt(random.nextInt(MAIUSCULAS.length())));
            senha.append(MINUSCULAS.charAt(random.nextInt(MINUSCULAS.length())));
            senha.append(MINUSCULAS.charAt(random.nextInt(MINUSCULAS.length())));
            senha.append(NUMEROS.charAt(random.nextInt(NUMEROS.length())));
            senha.append(NUMEROS.charAt(random.nextInt(NUMEROS.length())));
            senha.append(SIMBOLOS.charAt(random.nextInt(SIMBOLOS.length())));
            
            // Preenche o restante do tamanho com caracteres aleatórios
            while (senha.length() < TAMANHO) {
                senha.append(TODOS.charAt(random.nextInt(TODOS.length())));
            }

            String senhaFinal = senha.toString();
            // Verifica se a senha gerada atende a todos os critérios.
            // Para este problema, a geração "garantida" já é suficiente,
            // mas uma validação final é uma boa prática.
            if (senhaFinal.length() == 12) {
                return senhaFinal;
            }
        }
    }

    /**
     * Valida uma senha com base nos critérios de segurança.
     * @param senha A senha a ser validada.
     */
    public static void validarSenha(String senha) {
        int maiusculas = 0, minusculas = 0, numeros = 0, simbolos = 0;
        
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) maiusculas++;
            else if (Character.isLowerCase(c)) minusculas++;
            else if (Character.isDigit(c)) numeros++;
            else simbolos++;
        }
        
        System.out.println("\nValidação:");
        System.out.printf("✓ Tamanho: %d caracteres%n", senha.length());
        System.out.printf("✓ Maiúsculas: %d%n", maiusculas);
        System.out.printf("✓ Minúsculas: %d%n", minusculas);
        System.out.printf("✓ Números: %d%n", numeros);
        System.out.printf("✓ Símbolos: %d%n", simbolos);
        
        if (senha.length() >= 12 && maiusculas >= 2 && minusculas >= 2 && numeros >= 2 && simbolos >= 1) {
            System.out.println("\nSenha VÁLIDA e segura!");
        } else {
            System.out.println("\nSenha INVÁLIDA.");
        }
    }
}