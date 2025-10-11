package exercicios.cem_questoes_poo.questao_40;

public class NinjaPromovido implements Promovivel {
    private String nome;
    private String cargoAnterior;
    private String novoCargo;
    
    public NinjaPromovido(String nome, String cargoAnterior, String novoCargo) {
        this.nome = nome;
        this.cargoAnterior = cargoAnterior;
        this.novoCargo = novoCargo;
    }
    
    @Override
    public void promover() {
        System.out.println(nome + " promovido de " + cargoAnterior + " para " + novoCargo + "!");
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCargoAnterior() { return cargoAnterior; }
    public void setCargoAnterior(String cargoAnterior) { this.cargoAnterior = cargoAnterior; }
    public String getNovoCargo() { return novoCargo; }
    public void setNovoCargo(String novoCargo) { this.novoCargo = novoCargo; }
    
}
