package exercicios.cem_questoes_poo.questao_39;

public class NinjaTitulado implements RecebeTitulo {
    private String nome;
    private String titulo;
    
    public NinjaTitulado(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }
    
    @Override
    public void concederTitulo() {
        System.out.println("Ninja " + nome + " recebeu o título: " + titulo);
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
}
