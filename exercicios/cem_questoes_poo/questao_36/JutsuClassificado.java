package exercicios.cem_questoes_poo.questao_36;

public class JutsuClassificado implements Classificavel {
    private String nome;
    private int poder;
    
    public JutsuClassificado(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }
    
    @Override
    public void classificarPoder() {
        System.out.println("Jutsu " + nome + " classificado como poder " + poder + "!");
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getPoder() { return poder; }
    public void setPoder(int poder) { this.poder = poder; }
    
}
