package exercicios.cem_questoes_poo.questao_35;

public class SenseiAvaliado implements Avaliavel {
    private String nome;
    private int nota;
    
    public SenseiAvaliado(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    @Override
    public void avaliarSensei() {
        System.out.println("Sensei " + nome + " recebeu nota: " + nota);
    }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getNota() { return nota; }
    public void setNota(int nota) { this.nota = nota; }
    
}
