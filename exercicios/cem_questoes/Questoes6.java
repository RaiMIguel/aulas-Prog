public class Questoes6 {
    public static void main(String[] args) {
        
        String nome = "Naruto Uzumaki";
        int idade = 17;
        double altura = 1.66;
        boolean estaAtivo = true;

        String statusFormatado;

        if (estaAtivo) {
            statusFormatado = "Ativo";
        } else {
            statusFormatado = "Inativo";
        }

        
        System.out.println("=== DADOS DO NINJA ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + String.format("%.2f", altura) + "m"); 
        System.out.println("Status: " + statusFormatado);
    }
}
    

