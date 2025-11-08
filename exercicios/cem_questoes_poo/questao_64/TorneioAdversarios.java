package exercicios.cem_questoes_poo.questao_64;
import java.util.ArrayList;
import java.util.List;

public class TorneioAdversarios {
    private String nome;
    private List<String> adversarios = new ArrayList<>();

    public TorneioAdversarios(String nome) {
        this.nome = nome;
    }

    public void adicionarAdversario(String adversario) {
        adversarios.add(adversario);
    }

    public void mostrarAdversarios() {
        System.out.println("Adversários do " + nome + ": " + String.join(", ", adversarios));
    }
}