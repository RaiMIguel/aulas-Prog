package exercicios.cem_questoes_poo.questao_61;
import java.util.ArrayList;
import java.util.List;

public class NinjaExames {
    private String nome;
    private List<String> exames = new ArrayList<>();

    public NinjaExames(String nome) {
        this.nome = nome;
    }

    public void adicionarExame(String exame) {
        exames.add(exame);
    }

    public void mostrarExames() {
        System.out.println("Exames de " + nome + ": " + String.join(", ", exames));
    }
}