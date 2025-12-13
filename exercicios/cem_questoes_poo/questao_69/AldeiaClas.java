package exercicios.cem_questoes_poo.questao_69;
import java.util.ArrayList;
import java.util.List;

public class AldeiaClas {
    private String nomeAldeia;
    private List<String> clas = new ArrayList<>();

    public AldeiaClas(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }

    public void adicionarCla(String cla) {
        clas.add(cla);
    }

    public void mostrarClas() {
        System.out.println("Clãs de " + nomeAldeia + ": " + String.join(", ", clas));
    }
}