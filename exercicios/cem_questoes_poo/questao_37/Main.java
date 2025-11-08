package exercicios.cem_questoes_poo.questao_37;
/**
 * @param args
 *
 * questão: O sistema ninja deve permitir registrar e consultar missões. Crie a interface RegistroMissao com métodos registrar() e consultar(). Implemente a classe SistemaMissao que armazena missões em uma lista.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 * - Uso de coleções (ArrayList)
 *
 * @return "Missões registradas: Salvar aldeia, Resgatar refém"
 */
public class Main {
    public static void main(String[] args) {

        SistemaMissao sistema = new SistemaMissao();
        
        sistema.registrar("Salvar aldeia");
        sistema.registrar("Resgatar refém");
        
        sistema.consultar();
    }
    
}
