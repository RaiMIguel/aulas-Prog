package exercicios.cem_questoes_poo.questao_19;

public class JutsuProibido extends Jutsu {
    private String motivoProibicao;

    public JutsuProibido(String nome, String tipo, String motivoProibicao) {
        super(nome, tipo);
        this.motivoProibicao = motivoProibicao;
    }

    public String getMotivoProibicao() {
        return motivoProibicao;
    }

    public void setMotivoProibicao(String motivoProibicao) {
        this.motivoProibicao = motivoProibicao;
    }
}