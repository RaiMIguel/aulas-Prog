package exercicios.cem_questoes_poo.questao_46;

public class Batalha {
    private String participante1;
    private String participante2;
    private String resultado;
    
    public Batalha(String p1, String p2, String resultado) {
        this.participante1 = p1;
        this.participante2 = p2;
        this.resultado = resultado;
    }
    
    public void mostrarResultado() {
        System.out.println("Batalha: " + participante1 + " vs " + participante2);
        System.out.println("Resultado: " + resultado);
    }

    // Getters e Setters (omissos para brevidade, mas devem ser implementados)
    public String getParticipante1() { return participante1; }
    public void setParticipante1(String participante1) { this.participante1 = participante1; }
    public String getParticipante2() { return participante2; }
    public void setParticipante2(String participante2) { this.participante2 = participante2; }
    public String getResultado() { return resultado; }
    public void setResultado(String resultado) { this.resultado = resultado; }    
}
