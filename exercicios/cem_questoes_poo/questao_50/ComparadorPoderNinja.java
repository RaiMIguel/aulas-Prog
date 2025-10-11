package exercicios.cem_questoes_poo.questao_50;

public class ComparadorPoderNinja {
    private String nome1;
    private int poder1;
    private String nome2;
    private int poder2;
    
    public ComparadorPoderNinja(String nome1, int poder1, String nome2, int poder2) {
        this.nome1 = nome1;
        this.poder1 = poder1;
        this.nome2 = nome2;
        this.poder2 = poder2;
    }
    
    public void comparar() {
        if (poder1 > poder2) {
            System.out.println(nome1 + " é mais forte que " + nome2);
        } else if (poder2 > poder1) {
            System.out.println(nome2 + " é mais forte que " + nome1);
        } else {
            System.out.println(nome1 + " e " + nome2 + " têm o mesmo poder.");
        }
    }

    // Getters e Setters (omissos para brevidade)
    public String getNome1() { return nome1; }
    public void setNome1(String nome1) { this.nome1 = nome1; }
    public int getPoder1() { return poder1; }
    public void setPoder1(int poder1) { this.poder1 = poder1; }
    public String getNome2() { return nome2; }
    public void setNome2(String nome2) { this.nome2 = nome2; }
    public int getPoder2() { return poder2; }
    public void setPoder2(int poder2) { this.poder2 = poder2; }
    
}
