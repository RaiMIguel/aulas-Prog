public class Questoes8 {
    public static void main (String[] args){
        String nome = "Sasuke";
        char primeiraLetra = nome.charAt(0);
        int codigoASCII = (int) primeiraLetra;

        System.out.println("primeira letra: "+ primeiraLetra);
        System.out.println("Código ASCII: "+ codigoASCII);
    }
}