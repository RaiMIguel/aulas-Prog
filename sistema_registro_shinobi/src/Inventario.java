import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private final List<ItemMissao> itens = new ArrayList<>();
    private final int LIMITE_PESO = 10;

    public void adicionarItem(ItemMissao item, int peso) throws ItemProibidoException {
        if (item.getNome().equalsIgnoreCase("Selo Amaldiçoado")) {
            throw new ItemProibidoException("Item Proibido: Selo Amaldiçoado não pode ser transportado.");
        }

        if (peso > LIMITE_PESO) {
            throw new PesoExcedidoException("Peso total excedido: O item " + item.getNome() + " pesa " + peso + "kg (Limite: " + LIMITE_PESO + "kg).");
        }

        itens.add(item);
        System.out.println("✅ Adicionado: " + item.getNome() + " (Peso: " + peso + "kg)");
    }

    public void listarItens() {
        System.out.println("\n--- ITENS NO INVENTÁRIO ---");
        for (ItemMissao item : itens) {
            item.descreverUso();
        }
        System.out.println("--------------------------");
    }
}