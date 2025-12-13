package exercicios.cem_questoes_poo.questao_10;

public class JutsuProibido {
    private String nome;
    private int nivelPerigo;
    
    public JutsuProibido(String nome, int nivelPerigo) { this.nome = nome; this.nivelPerigo = nivelPerigo; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getNivelPerigo() { return nivelPerigo; }
    public void setNivelPerigo(int nivelPerigo) { this.nivelPerigo = nivelPerigo; }
}