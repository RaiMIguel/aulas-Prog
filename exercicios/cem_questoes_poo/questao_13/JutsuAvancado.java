package exercicios.cem_questoes_poo.questao_13;

public class JutsuAvancado extends Jutsu {
    private int nivel;

    public JutsuAvancado(String nome, String tipo, int nivel) {
        super(nome, tipo);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}