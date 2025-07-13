public class questoes4 {
    public static void main (String[] args) {
        int valor1 = 23;
        int valor2 = 67;
        int valor3 = 45;
        int maiorValor;

        if (valor1 > valor2 && valor1 > valor3){
            maiorValor = valor1;
        }
            else if (valor2 > valor1 && valor2 > valor3 ){
                maiorValor = valor2;
            }
            else {
                maiorValor = valor3;
            }

        System.out.println("O maior número é: "+ maiorValor);
    }
}
