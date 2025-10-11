package exercicios.cem_questoes_poo.questao_3;

public class Missao {
    private String descricao;
    private char rank;
    
    public Missao(String descricao, char rank) { this.descricao = descricao; this.rank = rank; }
    
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public char getRank() { return rank; }
    public void setRank(char rank) { this.rank = rank; }
}