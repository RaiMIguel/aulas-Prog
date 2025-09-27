package exercicio_estoque;

public class Camisa {

    private String nome;
    private String tamanho;
    private String cor;
    private Long id;
    private Double valorVenda;
    private Double valorCompra;
    private String marca;
    private Double desconto;
    private boolean controleVendido;
    private Double valorVendaComDesconto;
    private Double lucro;

    private static long proximoId = 1;
    
    public Camisa(String nome, String tamanho, String cor, Double valorCompra, Double valorVenda, String marca, Double desconto) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.marca = marca;
        this.desconto = desconto;
        this.controleVendido = false;
        this.id = proximoId++;
        
        this.valorVendaComDesconto = calcularValorComDesconto();
        this.lucro = 0.0;
    }
        
    public double calcularValorComDesconto() {
        return this.valorVenda - (this.valorVenda * this.desconto / 100.0);
    }
    
    public void calcularLucro() {
        if (this.controleVendido) {
            this.lucro = this.valorVendaComDesconto - this.valorCompra;
        } else {
            this.lucro = 0.0;
        }
    }
    
    public void exibirDetalhes() {
        System.out.println("---------------------------------------------");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.printf("Valor de aquisição: R$ %.2f%n", this.valorCompra);
        System.out.printf("Valor de venda: R$ %.2f%n", this.valorVenda);
        System.out.printf("Desconto: %.2f%%%n", this.desconto);
        System.out.printf("Valor de venda com Desconto: R$ %.2f%n", this.valorVendaComDesconto);
        System.out.println("Status de venda: " + (this.controleVendido ? "VENDIDO" : "NÃO VENDIDO"));
        System.out.printf("Lucro: R$ %.2f%n", this.lucro);
        System.out.println("---------------------------------------------");
    }
        
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public Double getValorCompra() { return valorCompra; }
    public void setValorCompra(Double valorCompra) { this.valorCompra = valorCompra; }
    public Double getValorVenda() { return valorVenda; }
    public void setValorVenda(Double valorVenda) { this.valorVenda = valorVenda; }
    public Double getDesconto() { return desconto; }
    public void setDesconto(Double desconto) { this.desconto = desconto; }
    public boolean isControleVendido() { return controleVendido; }
    public void setControleVendido(boolean controleVendido) { this.controleVendido = controleVendido; }
}
