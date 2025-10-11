package exercicios.cem_questoes_poo.questao_14;

public class MissaoMedica extends Missao {
    private int nivelDificuldade;

    public MissaoMedica(String descricao, char rank, int nivelDificuldade) {
        super(descricao, rank);
        this.nivelDificuldade = nivelDificuldade;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }
}