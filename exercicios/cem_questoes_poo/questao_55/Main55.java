package exercicios.cem_questoes_poo.questao_55;

/**
 * @param args
 * * questão: O sistema deve permitir registrar especialidades dos ninjas. Crie a classe NinjaEspecialidades com nome do ninja e lista de especialidades.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Especialidades de Sasuke: Sharingan, Chidori"
 */
public class Main55 {
    public static void main(String[] args) {
        NinjaEspecialidades sasuke = new NinjaEspecialidades("Sasuke");

        sasuke.adicionarEspecialidade("Sharingan");
        sasuke.adicionarEspecialidade("Chidori");

        sasuke.mostrarEspecialidades();
    }
}