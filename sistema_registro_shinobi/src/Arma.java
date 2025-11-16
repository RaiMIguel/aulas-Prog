public class Arma extends ItemMissao {
    public Arma(String nome) {
        super(nome);
    }

    @Override
    public void descreverUso() {
        System.out.println("Arma " + getNome() + ": Usada para ataque ou defesa imediata.");
    }
}