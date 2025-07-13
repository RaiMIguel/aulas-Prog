public class Questoes11 {
    public static void main (String[] args){
        byte valor = 125;

        System.out.println("Valor inicial: " + valor);

        for (int i = 0; i < 3; i++) {

            byte valorAntes = valor;
            valor = (byte) (valor + 5); 


            if (valorAntes > 0 && valor < 0) { 
                System.out.println("Após +5: " + (valorAntes + 5) + " (overflow! Resultado: " + valor + ")");
            } else {
                System.out.println("Após +5: " + valor);
            }
        }

        System.out.println("Valor final: " + valor);
    }
}
