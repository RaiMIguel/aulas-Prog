package exercicios.cem_questoes_poo.questao_48;

public class AldeiaInfo {
    private String nome;
    private String lider;
    private int ninjas;
    
    public AldeiaInfo(String nome, String lider, int ninjas) {
        this.nome = nome;
        this.lider = lider;
        this.ninjas = ninjas;
    }
    
    public void mostrarInfo() {
        System.out.println("Aldeia: " + nome);
        System.out.println("Líder: " + lider);
        System.out.println("Quantidade de ninjas: " + ninjas);
    }

    // Getters e Setters (omissos para brevidade)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLider() { return lider; }
    public void setLider(String lider) { this.lider = lider; }
    public int getNinjas() { return ninjas; }
    public void setNinjas(int ninjas) { this.ninjas = ninjas; }    
}
