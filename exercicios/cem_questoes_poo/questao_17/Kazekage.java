package exercicios.cem_questoes_poo.questao_17;

public class Kazekage extends Ninja {
    private int tempoMandato;

    public Kazekage(String nome, int idade, int tempoMandato) {
        super(nome, idade);
        this.tempoMandato = tempoMandato;
    }

    public int getTempoMandato() {
        return tempoMandato;
    }

    public void setTempoMandato(int tempoMandato) {
        this.tempoMandato = tempoMandato;
    }
}