package exercicios.cem_questoes_poo.questao_53;

import java.util.ArrayList;
import java.util.List;

public class MissaoTarefas {
    private String descricao;
    private List<String> tarefas = new ArrayList<>();

    public MissaoTarefas(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
    }

    public void mostrarTarefas() {
        System.out.println("Missão: " + descricao);
        System.out.println("Tarefas: " + String.join(", ", tarefas));
    }
}