package exercicios.cem_questoes_poo.questao_9;

public class MedicaNinja {
    private String nome;
    private int nivelMedico;
    
    public MedicaNinja(String nome, int nivelMedico) { this.nome = nome; this.nivelMedico = nivelMedico; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getNivelMedico() { return nivelMedico; }
    public void setNivelMedico(int nivelMedico) { this.nivelMedico = nivelMedico; }
}