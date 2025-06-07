import java.util.Scanner;
public class Ex002 {
    public static void main(String[] args) {
        String [] jutsus = {"rasengan", "clone", "invocação"};
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um jutsu: ");
        String jutsu = scan.nextLine();
        boolean existe = false;

        for (int index=0; index < jutsus.length; index++){
            if (jutsu.equals(jutsus[index])){
                existe = !existe;
            }
        }
        if (existe) {
        System.out.println("tem na lista");
        }
        else {
            System.out.println("não tem na lista");
        }
         scan.close();
    }
}
