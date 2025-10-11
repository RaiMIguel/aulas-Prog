package exercicios.cem_questoes_poo.questao_8;

public class Estrategista {
    private String nome;
    private int nivelEstrategia;
    
    public Estrategista(String nome, int nivelEstrategia) { this.nome = nome; this.nivelEstrategia = nivelEstrategia; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getNivelEstrategia() { return nivelEstrategia; }
    public void setNivelEstrategia(int nivelEstrategia) { this.nivelEstrategia = nivelEstrategia; }
}