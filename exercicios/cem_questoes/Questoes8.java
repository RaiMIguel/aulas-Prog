public class Questoes8 {

    /**
     * @param args
     *             Declare uma variável char para armazenar a primeira letra do nome
     *             “Sasuke” e exiba a letra junto com seu código ASCII.
     *             Objetivos**:
     *             - Trabalhar com tipo char
     *             - Entender relação entre char e int
     *             - Fazer casting
     */
    public static void main(String[] args) {
        String nome = "Sasuke";
        char primeiraLetra = nome.charAt(0);
        System.out.println("primeira letra: " + primeiraLetra);
        System.out.println("Código ASCII: " + (int) primeiraLetra);    // conversão explicita ou casting
    }
}