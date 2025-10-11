package exercicios.cem_questoes_poo.questao_37;

public class Main {
    public static void main(String[] args) {

        SistemaMissao sistema = new SistemaMissao();
        
        sistema.registrar("Salvar aldeia");
        sistema.registrar("Resgatar refém");
        
        sistema.consultar();
    }
    
}
