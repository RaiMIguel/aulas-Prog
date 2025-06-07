package exercicios.exercicios_array;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] hokages = {"Hashirama Senju",", Tobirama Senju",", Hiruzen Sarutobi",", Minato Namikaze", 
    ", Tsunade Senju", ", Kakashi Hatake", ", Naruto Uzumaki"};

    for (int i = 0; i < hokages.length; i++) {
    System.out.print(hokages[i]);
    }

    int[] notas = new int[5];

    for (int i = 0; i < notas.length; i++) {
        System.out.println("");
        System.out.print("Digite a nota " + (i + 1) + " do naruto;");
        notas[i] = scan.nextInt();
    }
    scan.nextLine();

    int soma = 0;
    for (int nota : notas) {
        soma += nota;
    }
    float media = soma / (float) notas.length;
    System.out.println("a média de naruto é:"+media);

    String[] jutsus = new String[4];
    for (int i=0; i<jutsus.length; i++){
        System.out.println("");
        System.out.print("digite o jutsu: " + (i + 1)) ;
        jutsus[i] = scan.nextLine();   
 
        System.out.println("naruto aprendeu "+ jutsus[0] );
        System.out.println("naruto aprendeu "+ jutsus[1] );
        System.out.println("naruto aprendeu "+ jutsus[2] );
        System.out.println("naruto aprendeu "+ jutsus[3] );
    
    }
    scan.close();
 }
}
