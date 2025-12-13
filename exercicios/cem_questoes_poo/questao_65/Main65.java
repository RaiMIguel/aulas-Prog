package exercicios.cem_questoes_poo.questao_65;

/**
 * @param args
 * * questão: O sistema deve registrar as especialidades médicas dos ninjas médicos. Crie a classe MedicoEspecialidades com nome do ninja e lista de especialidades.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Especialidades médicas de Tsunade: Cirurgia, Regeneração"
 */
public class Main65 {
    public static void main(String[] args) {
        MedicoEspecialidades tsunade = new MedicoEspecialidades("Tsunade");

        tsunade.adicionarEspecialidade("Cirurgia");
        tsunade.adicionarEspecialidade("Regeneração");

        tsunade.mostrarEspecialidades();
    }
}