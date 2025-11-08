package exercicios.cem_questoes_poo.questao_92;

import java.util.ArrayList;
import java.util.List;

public class ExameChuninVencedores {
    private List<String> vencedores = new ArrayList<>();

    public void adicionarVencedor(String vencedor) {
        vencedores.add(vencedor);
    }

    public void mostrarVencedores() {
        System.out.println("Vencedores do Exame Chunin: " + String.join(", ", vencedores));
    }
}