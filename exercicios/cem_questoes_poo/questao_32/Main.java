package exercicios.cem_questoes_poo.questao_32;
/**
 * @param args
 *
 * questão: Cada aldeia ninja possui uma especialidade. Crie a interface EspecialidadeAldeia com o método mostrarEspecialidade(). Implemente as classes AldeiaFolha, AldeiaAreia e AldeiaNévoa.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 *
 * @return "A especialidade da Folha é ninjutsu diversificado! / A especialidade da Areia é manipulação de areia! / A especialidade da Névoa é técnicas de água!"
 */
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
