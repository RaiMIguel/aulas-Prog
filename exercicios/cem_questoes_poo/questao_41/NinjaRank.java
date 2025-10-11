package exercicios.cem_questoes_poo.questao_41;

public class NinjaRank {
    private String nome;
    private RankNinja rank;
    
    public NinjaRank(String nome, RankNinja rank) {
        this.nome = nome;
        this.rank = rank;
    }
    
    public void mostrarRank() {
        System.out.println("Ninja " + nome + " tem o rank: " + rank);
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public RankNinja getRank() { return rank; }
    public void setRank(RankNinja rank) { this.rank = rank; }
    
}
