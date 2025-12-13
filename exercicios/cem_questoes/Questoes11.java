public class Questoes11 {
        /**
     * @param args
     *             Demonstre overflow em uma variável byte. Comece com byte valor = 125, 
     *             adicione 5 a cada iteração e mostre o que acontece quando excede o limite.
     *             Objetivos**:
     *             - Entender limites de tipos
     *             - Demonstrar overflow
     *             - Usar laços básicos
     * @Return ("Valor final: " + valor);
     */
    
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
