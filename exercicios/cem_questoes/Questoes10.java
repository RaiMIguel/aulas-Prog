public class Questoes10 {

    /**
     * @param args
     *             **Enunciado**: Crie variáveis para representar um ninja completo
     *             com: nome (String), idade (int), chakra (long), missões
     *             completadas (short), está vivo (boolean), e rank (char: ‘G’, ‘C’,
     *             ‘B’, ‘A’, ‘S’). 
     *             Objetivos**:
     *             - Usar todos os tipos primitivos
     *             - Organizar dados estruturadamente
     *             - Formatar saída profissionalmente
     *             Dados do Ninja**:
     *             - Nome: “Kakashi Hatake”
     *             - Idade: 29
     *             - Chakra: 95000L
     *             - Missões: 1141
     *             - Vivo: true
     *             - Rank: ‘S’
     */
    public static void main(String[] args) {
        String nome = "Kakashi Hatake";
        int idade = 29;
        long chakra = 95000L;
        short missao = 1141;
        boolean status = true;
        char rank = 'S';
        


        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade + " anos");
        System.out.println("chakra: " + chakra);
        System.out.println("missões completadas: " + missao);
        System.out.println("Status: " + (status ? "Vivo":"Morto"));
        System.out.println("Rank: " + rank);
    }
}
