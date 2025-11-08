package exercicios.cem_questoes_poo.questao_76;

import java.util.ArrayList;
import java.util.List;

public class AkatsukiMembros {
    private List<String> membros = new ArrayList<>();

    public void adicionarMembro(String membro) {
        membros.add(membro);
    }

    public void mostrarMembros() {
        System.out.println("Membros da Akatsuki: " + String.join(", ", membros));
    }
}