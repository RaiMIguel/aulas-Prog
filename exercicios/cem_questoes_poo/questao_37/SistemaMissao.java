package exercicios.cem_questoes_poo.questao_37;

import java.util.ArrayList;

public class SistemaMissao implements RegistroMissao {
    private ArrayList<String> missoes = new ArrayList<>();
    
    @Override
    public void registrar(String descricao) {
        missoes.add(descricao);
    }
    
    @Override
    public void consultar() {
        System.out.print("Missões registradas: ");
        System.out.println(String.join(", ", missoes));
    }
    
}
