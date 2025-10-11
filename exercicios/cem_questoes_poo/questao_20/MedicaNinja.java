package exercicios.cem_questoes_poo.questao_20;

public class MedicaNinja {
    private String nome;
    private int nivelMedico;

    public MedicaNinja(String nome, int nivelMedico) {
        this.nome = nome;
        this.nivelMedico = nivelMedico;
    }

    public String getNome() {
        return nome;
    }

    public int getNivelMedico() {
        return nivelMedico;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivelMedico(int nivelMedico) {
        this.nivelMedico = nivelMedico;
    }
}