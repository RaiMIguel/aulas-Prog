package exercicios.cem_questoes_poo.questao_49;

public class JutsuProibidoCriador {
    private String nomeJutsu;
    private String criador;
    
    public JutsuProibidoCriador(String nomeJutsu, String criador) {
        this.nomeJutsu = nomeJutsu;
        this.criador = criador;
    }
    
    public void mostrarInfo() {
        System.out.println("Jutsu proibido: " + nomeJutsu);
        System.out.println("Criador: " + criador);
    }

    // Getters e Setters (omissos para brevidade)
    public String getNomeJutsu() { return nomeJutsu; }
    public void setNomeJutsu(String nomeJutsu) { this.nomeJutsu = nomeJutsu; }
    public String getCriador() { return criador; }
    public void setCriador(String criador) { this.criador = criador; }    
}
