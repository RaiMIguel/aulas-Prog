
import java.util.Scanner;

// (dicas do naruto) AVALIAÇÃO: 45/100
// (dicas do naruto) Pontos positivos: Uso de estruturas condicionais e Scanner
// (dicas do naruto) Pontos de melhoria: Falta package, else if ao invés de múltiplos if, validação de entrada

// (dicas do naruto) DICA 1: IMPORTANTE - Adicione a declaração do package no início do arquivo

public class Ex1 {
    // (dicas do naruto) DICA 2: Use nomes mais descritivos para classes (ExercicioDecisao)
    
    public static void main (String[] args) {
        // (dicas do naruto) DICA 3: Adicione espaço entre parâmetros: (String[] args)
        
        Scanner scan = new Scanner(System.in);
        System.out.println("escolha um ninja entre naruto, sasuke e sakura: ");
        String ninja = scan.nextLine();

        // (dicas do naruto) DICA 4: Use else if ao invés de múltiplos if separados para melhor performance
        // (dicas do naruto) DICA 5: Considere usar equalsIgnoreCase() para ignorar maiúsculas/minúsculas
        if (ninja.equals("naruto")) {
            System.out.println("digite o valor do chakra do naruto: ");
            int chakra = scan.nextInt();

            if (chakra > 70) {
                // (dicas do naruto) DICA 6: Adicione espaços ao redor dos operadores (chakra > 70)
                System.out.println("pode usar o modo kurama");
            }
            else {
                System.out.println("Continuar treinando com o kakashi");
            }
        }
        // (dicas do naruto) DICA 7: MUDE PARA else if - atualmente todos os ifs são verificados
        else if (ninja.equals("sasuke")){
            System.out.println("sasuke tem sharingan?(s/n)");
            String shr = scan.nextLine();

            // (dicas do naruto) DICA 8: Use nomes de variáveis mais descritivos (temSharingan)
            if  (shr.equals("s")){
                System.out.println("pode usar o shidori");
            }
            else {
                System.out.println("Continuar treinando com o kakashi");
            }
        }
        // (dicas do naruto) DICA 9: MUDE PARA else if
        else if (ninja.equals("sakura")){
            System.out.println("digite o valor do chakra da sakura:");
            int chakraSakura = scan.nextInt();
            // (dicas do naruto) DICA 10: Use camelCase (chakraSakura ao invés de chakra_2)

            if (chakraSakura > 60) {
                System.out.println("pode usar super força");
            }
            else {
                System.out.println("Continuar treinando com o kakashi");
            }
        }
        // (dicas do naruto) DICA 11: Adicione um else final para casos onde o ninja não é reconhecido
        else {
            System.out.println("Ninja não reconhecido. Por favor, escolha entre naruto, sasuke e sakura.");
        }
        
        scan.close(); // (dicas do naruto) DICA 12: Muito bem por fechar o Scanner!
    }
}
