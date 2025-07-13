public class Questoes10 {
    public static void main(String[] args) {
        String nome = "Kakashi Hatake";
        int idade = 29;
        long chakra = 95000L;
        short missao = 1141;
        boolean status = true;
        char rank = 's';
        String vivoMorto;

        if (status == true){
            vivoMorto = "vivo";
        }
            else if (status == false){
                vivoMorto = "Morto";
        }
            else {
                vivoMorto = "";
            }

        System.out.println("Nome: " + nome);
        System.out.println("idade: "+idade+" anos");
        System.out.println("chakra: "+ chakra);
        System.out.println("missões completadas: "+missao);
        System.out.println("Status: " + vivoMorto);
        System.out.println("Rank: "+ rank);
    }
}
