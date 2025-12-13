package exercicios.cem_questoes_poo.questao_15;

public class SenseiJounin extends Sensei {
    private String alunoFavorito;

    public SenseiJounin(String nome, String especialidade, String alunoFavorito) {
        super(nome, especialidade);
        this.alunoFavorito = alunoFavorito;
    }

    public String getAlunoFavorito() {
        return alunoFavorito;
    }

    public void setAlunoFavorito(String alunoFavorito) {
        this.alunoFavorito = alunoFavorito;
    }
}