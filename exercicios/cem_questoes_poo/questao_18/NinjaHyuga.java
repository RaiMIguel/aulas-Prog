package exercicios.cem_questoes_poo.questao_18;

public class NinjaHyuga extends Ninja {
    private String clan;

    public NinjaHyuga(String nome, int idade, String clan) {
        super(nome, idade);
        this.clan = clan;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }
}