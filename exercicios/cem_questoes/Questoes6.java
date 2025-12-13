public class Questoes6 {


    
    /** 
     * @param args
     * Declare e inicialize variáveis para armazenar os dados de um ninja: nome (String), idade (int), altura (double) e está ativo (boolean).
     * @return 
     * "=== DADOS DO NINJA ==="
     * "Nome: " + nome
     * "Idade: " + idade + " anos"
     * "Altura: " + String.format("%.2f", altura) + "m"
     * "Status: " + statusFormatado
     */
    public static void main(String[] args) {
        
        String nome = "Naruto Uzumaki";
        int idade = 17;
        double altura = 1.66;
        boolean estaAtivo = true;
        
        exibirDados(nome, idade, altura, estaAtivo);
        
    }


    
    /** 
     * @param nome
     * @param idade
     * @param altura
     * @param estaAtivo
     * 
     * @return 
     * "=== DADOS DO NINJA ==="
     * "Nome: " + nome
     * "Idade: " + idade + " anos"
     * "Altura: " + String.format("%.2f", altura) + "m"
     * "Status: " + statusFormatado
     */
    public static void exibirDados(String nome, int idade, double altura, boolean estaAtivo) {

        System.out.println("=== DADOS DO NINJA ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + String.format("%.2f", altura) + "m"); 
        System.out.println("Status: " +  (estaAtivo ? "Ativo" : "Não Ativo")); // expressão logica de true e false ? caso true : caso false

    }
}
    

