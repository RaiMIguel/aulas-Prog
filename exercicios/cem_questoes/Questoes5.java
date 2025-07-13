public class Questoes5 {
    public static void main(String[] args){
        float nota1 = 8.50f;
        float nota2 = 7.00f;
        float nota3 = 9.20f;
        float nota4 = 6.80f;
        float media = (nota1+nota2+nota3+nota4)/4;

        System.out.println(String.format("%.2f", nota1));
        System.out.println(String.format("%.2f", nota2));
        System.out.println(String.format("%.2f", nota3));
        System.out.println(String.format("%.2f",nota4));
        System.out.println("a média das notas é: "+ String.format("%.2f", media));
    }
}
