import java.util.Scanner;

// (dicas do naruto) AVALIAÇÃO: 75/100
// (dicas do naruto) Pontos positivos: Lógica de busca correta, uso adequado de boolean, Scanner fechado
// (dicas do naruto) Pontos de melhoria: Falta package, pode usar break para otimizar, nomenclatura

// (dicas do naruto) DICA 1: Adicione a declaração do package no início

public class Ex002 {
    // (dicas do naruto) DICA 2: Use nomes mais descritivos (ExercicioBuscaJutsu)
    
    public static void main(String[] args) {
        String [] jutsus = {"rasengan", "clone", "invocação"};
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite um jutsu: ");
        String jutsu = scan.nextLine();
        boolean existe = false;

        // (dicas do naruto) DICA 3: Use nomes mais descritivos (i ao invés de index)
        // (dicas do naruto) DICA 4: OTIMIZAÇÃO - Adicione 'break;' após encontrar o jutsu para parar o loop
        for (int index=0; index < jutsus.length; index++){
            if (jutsu.equals(jutsus[index])){
                existe = !existe; // (dicas do naruto) DICA 5: Aqui você pode usar simplesmente: existe = true;
                // (dicas do naruto) DICA 6: Adicione 'break;' aqui para melhor performance
            }
        }
        
        // (dicas do naruto) DICA 7: Excelente lógica de verificação!
        if (existe) {
            System.out.println("tem na lista");
        }
        else {
            System.out.println("não tem na lista");
        }
        
        // (dicas do naruto) DICA 8: Muito bem por fechar o Scanner!
        scan.close();
        
        // (dicas do naruto) DICA 9: Considere usar equalsIgnoreCase() para ignorar maiúsculas/minúsculas
        // (dicas do naruto) DICA 10: Alternativa: use Arrays.asList(jutsus).contains(jutsu) para busca mais simples
    }
}
