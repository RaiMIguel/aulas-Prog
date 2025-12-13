package exercicios.cem_questoes_poo.questao_16;

public class Aldeia {
    private String nome;
    private String lider;

    public Aldeia(String nome, String lider) {
        this.nome = nome;
        this.lider = lider;
    }

    public String getNome() {
        return nome;
    }

    public String getLider() {
        return lider;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }
}