import java.util.Scanner;
public class Ex1 {
    public static void main (String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("escolha um ninja entre naruto, sasuke e sakura: ");
    String ninja = scan.nextLine();

    if (ninja.equals("naruto")) {
    System.out.println("digite o valor do chakra do naruto: ");
    int chakra = scan.nextInt();

        if (chakra>70) {
        System.out.println("pode usar o modo kurama");
        }
        else {
        System.out.println("Continuar treinando com o kakashi");
        }
    }

    if (ninja.equals("sasuke")){
    System.out.println("sasuke tem sharingan?(s/n)");
    String shr = scan.nextLine();

        if  (shr.equals("s")){
        System.out.println("pode usar o shidori");
        }
        else {
        System.out.println("Continuar treinando com o kakashi");
        }
    }
    if (ninja.equals("sakura")){
    System.out.println("digite o valor do chakra da sakura:");
    int chakra_2 = scan.nextInt();

        if (chakra_2>60) {
        System.out.println("pode usar super força");
        }
        else {
        System.out.println("Continuar treinando com o kakashi");
        }
    }
    scan.close();
  }
}
