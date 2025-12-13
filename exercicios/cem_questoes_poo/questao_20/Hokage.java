package exercicios.cem_questoes_poo.questao_20;

public class Hokage extends MedicaNinja {
    private int mandato;

    public Hokage(String nome, int nivelMedico, int mandato) {
        super(nome, nivelMedico);
        this.mandato = mandato;
    }

    public int getMandato() {
        return mandato;
    }

    public void setMandato(int mandato) {
        this.mandato = mandato;
    }
}