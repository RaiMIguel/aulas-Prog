package exercicios.cem_questoes_poo.questao_16;

public class AldeiaOculta extends Aldeia {
    private String simbolo;

    public AldeiaOculta(String nome, String lider, String simbolo) {
        super(nome, lider);
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}