public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Arma shuriken = new Arma("Shuriken");
        Ferramenta bombaFumaca = new Ferramenta("Bomba de Fumaça");
        Arma katanaPesada = new Arma("Katana Pesada");

        try {
            inventario.adicionarItem(shuriken, 5);
            inventario.adicionarItem(bombaFumaca, 1);

            Ferramenta selo = new Ferramenta("Selo Amaldiçoado");
            inventario.adicionarItem(selo, 1);

        } catch (ItemProibidoException e) {
            System.err.println("\n🛑 ERRO (VERIFICADO): " + e.getMessage());
        }

        try {
            inventario.adicionarItem(katanaPesada, 11);
        } catch (PesoExcedidoException e) {
            System.err.println("❌ ERRO (NÃO VERIFICADO): " + e.getMessage());
        } catch (ItemProibidoException e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }

        inventario.listarItens();

        System.out.println("Peso de 3 Bombas de Fumaça: " + bombaFumaca.calcularPeso(3) + "kg");
    }
}