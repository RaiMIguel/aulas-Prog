import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questoes84 {

    private static final String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%&*"; // Caracteres para esta questão

    private static final int TAMANHO_SENHA = 12;
    private static final int MIN_MAIUSCULAS = 2;
    private static final int MIN_MINUSCULAS = 2;
    private static final int MIN_NUMEROS = 2;
    private static final int MIN_SIMBOLOS = 1;

    public static void main(String[] args) {
        System.out.println("=== GERADOR DE SENHAS ===");

        System.out.println("\nCritérios:");
        System.out.println("- Tamanho: " + TAMANHO_SENHA + " caracteres");
        System.out.println("- Mínimo " + MIN_MAIUSCULAS + " maiúsculas");
        System.out.println("- Mínimo " + MIN_MINUSCULAS + " minúsculas");
        System.out.println("- Mínimo " + MIN_NUMEROS + " números");
        System.out.println("- Mínimo " + MIN_SIMBOLOS + " símbolo");

        String senhaGerada;
        boolean valida;
        int tentativas = 0;
        do {
            senhaGerada = gerarSenha();
            valida = validarSenha(senhaGerada);
            tentativas++;
            // Em cenários reais, um limite de tentativas ou um algoritmo mais inteligente seria usado
            // para evitar loops infinitos se os critérios forem impossíveis.
            if (tentativas > 1000) { // Limite para evitar loop infinito em critérios muito restritivos
                System.out.println("\nNão foi possível gerar uma senha que atenda a todos os critérios após 1000 tentativas.");
                return;
            }
        } while (!valida);

        System.out.println("\nSenha gerada: \"" + senhaGerada + "\"");
        validarSenha(senhaGerada); // Chamar novamente para exibir a validação
    }

    private static String gerarSenha() {
        SecureRandom random = new SecureRandom();
        StringBuilder senhaBuilder = new StringBuilder();
        List<Character> caracteresSenha = new ArrayList<>();

        // Garante os requisitos mínimos
        for (int i = 0; i < MIN_MAIUSCULAS; i++) {
            caracteresSenha.add(MAIUSCULAS.charAt(random.nextInt(MAIUSCULAS.length())));
        }
        for (int i = 0; i < MIN_MINUSCULAS; i++) {
            caracteresSenha.add(MINUSCULAS.charAt(random.nextInt(MINUSCULAS.length())));
        }
        for (int i = 0; i < MIN_NUMEROS; i++) {
            caracteresSenha.add(NUMEROS.charAt(random.nextInt(NUMEROS.length())));
        }
        for (int i = 0; i < MIN_SIMBOLOS; i++) {
            caracteresSenha.add(SIMBOLOS.charAt(random.nextInt(SIMBOLOS.length())));
        }

        // Preenche o restante da senha com caracteres aleatórios de todas as categorias
        String todosCaracteres = MAIUSCULAS + MINUSCULAS + NUMEROS + SIMBOLOS;
        for (int i = caracteresSenha.size(); i < TAMANHO_SENHA; i++) {
            caracteresSenha.add(todosCaracteres.charAt(random.nextInt(todosCaracteres.length())));
        }

        // Embaralha os caracteres para que os obrigatórios não fiquem sempre no início
        Collections.shuffle(caracteresSenha);

        for (char c : caracteresSenha) {
            senhaBuilder.append(c);
        }
        return senhaBuilder.toString();
    }

    private static boolean validarSenha(String senha) {
        int countMaiusculas = 0;
        int countMinusculas = 0;
        int countNumeros = 0;
        int countSimbolos = 0;

        for (char c : senha.toCharArray()) {
            if (MAIUSCULAS.indexOf(c) != -1) {
                countMaiusculas++;
            } else if (MINUSCULAS.indexOf(c) != -1) {
                countMinusculas++;
            } else if (NUMEROS.indexOf(c) != -1) {
                countNumeros++;
            } else if (SIMBOLOS.indexOf(c) != -1) {
                countSimbolos++;
            }
        }

        System.out.println("\nValidação:");
        System.out.println("✓ Tamanho: " + senha.length() + " caracteres " + (senha.length() == TAMANHO_SENHA ? "✓" : "✗"));
        System.out.println("✓ Maiúsculas: " + countMaiusculas + " " + (countMaiusculas >= MIN_MAIUSCULAS ? "(OK)" : "(FALHA)"));
        System.out.println("✓ Minúsculas: " + countMinusculas + " " + (countMinusculas >= MIN_MINUSCULAS ? "(OK)" : "(FALHA)"));
        System.out.println("✓ Números: " + countNumeros + " " + (countNumeros >= MIN_NUMEROS ? "(OK)" : "(FALHA)"));
        System.out.println("✓ Símbolos: " + countSimbolos + " " + (countSimbolos >= MIN_SIMBOLOS ? "(OK)" : "(FALHA)"));

        boolean tamanhoOk = senha.length() == TAMANHO_SENHA;
        boolean maiusculasOk = countMaiusculas >= MIN_MAIUSCULAS;
        boolean minusculasOk = countMinusculas >= MIN_MINUSCULAS;
        boolean numerosOk = countNumeros >= MIN_NUMEROS;
        boolean simbolosOk = countSimbolos >= MIN_SIMBOLOS;

        if (tamanhoOk && maiusculasOk && minusculasOk && numerosOk && simbolosOk) {
            System.out.println("\nSenha VÁLIDA e segura!");
            return true;
        } else {
            System.out.println("\nSenha INVÁLIDA (não atende a todos os critérios).");
            return false;
        }
    }
}