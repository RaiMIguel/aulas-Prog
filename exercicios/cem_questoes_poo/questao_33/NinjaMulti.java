package exercicios.cem_questoes_poo.questao_33;

import java.util.ArrayList;

public class NinjaMulti implements MultiHabilidade {
    private String nome;
    private ArrayList<String> habilidades = new ArrayList<>();
    
    public NinjaMulti(String nome) {
        this.nome = nome;
    }
    
    public void addHabilidade(String habilidade) {
        habilidades.add(habilidade);
    }
    
    @Override
    public void listarHabilidades() {
        System.out.print("Habilidades do ninja " + nome + ": ");
        System.out.println(String.join(", ", habilidades));
    }
    
    // Getters e Setters adicionais (para manter o encapsulamento, se necessário)
    public String getNome() {
        return nome;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }
    
}
