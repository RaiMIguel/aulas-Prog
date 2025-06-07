package exercicios.exercicio_repeticao;

public class task1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            if (i < 5){
            System.out.println("naruto está na tentativa: "+ i); i++;
            }
            else {
            System.out.println("naruto conseguiu aprender o jutsu na "+i+" tentativa"); i++;
            }
        }

        int fome_naruto = 0;
        boolean satisfeito = false;
        do {
            fome_naruto++;
            System.out.println("naruto comeu "+fome_naruto+" lamem");
            if (fome_naruto == 3)
            satisfeito = !satisfeito;
            System.out.println("naruto tá cheio já");
        } while (!satisfeito);
    }
    
}
