package exercicios.cem_questoes_poo.questao_32;

public class Main {
    public static void main(String[] args) {
        EspecialidadeAldeia folha = new AldeiaFolha();
        EspecialidadeAldeia areia = new AldeiaAreia();
        EspecialidadeAldeia nevoa = new AldeiaNévoa();
        
        folha.mostrarEspecialidade();
        areia.mostrarEspecialidade();
        nevoa.mostrarEspecialidade();
    }
    
}
