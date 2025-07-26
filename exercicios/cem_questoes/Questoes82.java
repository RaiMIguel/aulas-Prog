import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questoes82 {
    public static void main(String[] args) {
        String texto = "Olá,mundo!Como;você:está?Bem...Java/Programação";

        System.out.println("Texto: \"" + texto + "\"");

        // Expressão regular para separar por não-letras, incluindo _ para compatibilidade geral
        // \\P{L} significa "qualquer caractere que não seja uma letra"
        String[] palavrasArray = texto.split("[^\\p{L}]+"); 
        
        List<String> palavrasExtraidas = new ArrayList<>();
        StringBuilder separadoresEncontrados = new StringBuilder();

        // Encontrar e listar separadores
        Pattern p = Pattern.compile("[^\\p{L} ]+"); // Busca por qualquer não-letra (exceto espaço)
        Matcher m = p.matcher(texto);
        while (m.find()) {
            String sep = m.group();
            for (char c : sep.toCharArray()) {
                if (separadoresEncontrados.indexOf(String.valueOf(c)) == -1) {
                    separadoresEncontrados.append(c).append(" ");
                }
            }
        }
        String sepStr = separadoresEncontrados.toString().trim();
        if (sepStr.isEmpty()) {
            System.out.println("\nSeparadores encontrados: Nenhum (apenas espaços se aplicável)");
        } else {
            System.out.println("\nSeparadores encontrados: " + sepStr.replace(" ", ", "));
        }


        System.out.println("Palavras extraídas:");
        int contadorPalavras = 0;
        for (String pTemp : palavrasArray) {
            String palavraLimpa = pTemp.trim();
            if (!palavraLimpa.isEmpty()) {
                palavrasExtraidas.add(palavraLimpa);
                contadorPalavras++;
                System.out.println(contadorPalavras + ". \"" + palavraLimpa + "\"");
            }
        }
        
        System.out.println("\nTotal de palavras: " + contadorPalavras);
    }
}