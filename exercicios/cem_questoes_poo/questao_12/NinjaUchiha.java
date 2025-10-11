package exercicios.cem_questoes_poo.questao_12;

public class NinjaUchiha extends Ninja {
    private String poderKekkeiGenkai;

    public NinjaUchiha(String nome, int idade, String poderKekkeiGenkai) {
        super(nome, idade);
        this.poderKekkeiGenkai = poderKekkeiGenkai;
    }

    public String getPoderKekkeiGenkai() {
        return poderKekkeiGenkai;
    }

    public void setPoderKekkeiGenkai(String poderKekkeiGenkai) {
        this.poderKekkeiGenkai = poderKekkeiGenkai;
    }
}