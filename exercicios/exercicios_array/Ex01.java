package exercicios.exercicios_array;
import java.util.Scanner;

// (dicas do naruto) AVALIAÇÃO: 55/100
// (dicas do naruto) Pontos positivos: Uso de arrays, enhanced for loop, cast correto para float
// (dicas do naruto) Pontos de melhoria: Lógica duplicada, formatação, vírgulas desnecessárias no array

public class Ex01 {
    // (dicas do naruto) DICA 1: Use nomes mais descritivos para as classes
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // (dicas do naruto) DICA 2: Remova as vírgulas desnecessárias no início dos elementos do array
        String[] hokages = {"Hashirama Senju", "Tobirama Senju", "Hiruzen Sarutobi", "Minato Namikaze", 
        "Tsunade Senju", "Kakashi Hatake", "Naruto Uzumaki"};

        // (dicas do naruto) DICA 3: Adicione quebras de linha para melhor legibilidade
        for (int i = 0; i < hokages.length; i++) {
            System.out.print(hokages[i]);
        }

        // (dicas do naruto) DICA 4: Separe as seções do código com comentários explicativos
        int[] notas = new int[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("");
            System.out.print("Digite a nota " + (i + 1) + " do naruto;");
            notas[i] = scan.nextInt();
        }
        scan.nextLine(); // (dicas do naruto) DICA 5: Bom uso do nextLine() para limpar o buffer!

        // (dicas do naruto) DICA 6: Excelente uso do enhanced for loop!
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        float media = soma / (float) notas.length;
        System.out.println("a média de naruto é:"+media);

        // (dicas do naruto) DICA 7: PROBLEMA CRÍTICO - O print está dentro do loop, causando repetição desnecessária
        String[] jutsus = new String[4];
        for (int i=0; i<jutsus.length; i++){
            System.out.println("");
            System.out.print("digite o jutsu: " + (i + 1)) ;
            jutsus[i] = scan.nextLine();   
        }

        // (dicas do naruto) DICA 8: Este bloco deveria estar FORA do loop for!
        // (dicas do naruto) DICA 9: Ou melhor ainda, use outro loop for para imprimir os jutsus
        for (String jutsu : jutsus) {
            System.out.println("naruto aprendeu "+ jutsu );
        }
        
        // (dicas do naruto) DICA 10: Sempre feche o Scanner (muito bem!)
        scan.close();
    }
}
