package exercicios.cem_questoes_poo.questao_89;

import java.util.ArrayList;
import java.util.List;

public class ClaMembrosLendarios {
    private String nomeCla;
    private List<String> membros = new ArrayList<>();

    public ClaMembrosLendarios(String nomeCla) {
        this.nomeCla = nomeCla;
    }

    public void adicionarMembro(String membro) {
        membros.add(membro);
    }

    public void mostrarMembros() {
        System.out.println("Membros lendários do clã " + nomeCla + ": " + String.join(", ", membros));
    }
}