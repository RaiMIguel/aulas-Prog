public abstract class ItemMissao {
    private String nome;

    public ItemMissao(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public abstract void descreverUso();
}