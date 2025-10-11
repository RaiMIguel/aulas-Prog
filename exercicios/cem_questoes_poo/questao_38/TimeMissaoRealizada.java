package exercicios.cem_questoes_poo.questao_38;

public class TimeMissaoRealizada implements TimeMissao {
    private String time;
    private String missao;
    
    public TimeMissaoRealizada(String time, String missao) {
        this.time = time;
        this.missao = missao;
    }
    
    @Override
    public void realizarMissao() {
        System.out.println(time + " realizou a missão: " + missao);
    }
    
    // Getters e Setters
    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
    public String getMissao() { return missao; }
    public void setMissao(String missao) { this.missao = missao; }
    
}
