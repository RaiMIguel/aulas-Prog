public class Ferramenta extends ItemMissao implements Transportavel {
    private final int PESO_BASE = 2;

    public Ferramenta(String nome) {
        super(nome);
    }

    @Override
    public void descreverUso() {
        System.out.println("Ferramenta " + getNome() + ": Usada para suporte ou mobilidade.");
    }

    @Override
    public int calcularPeso(int quantidade) {
        return PESO_BASE * quantidade;
    }
}