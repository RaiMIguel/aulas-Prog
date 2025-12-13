package exercicios.exercicio_metodos_s;
import java.util.Scanner;

// (dicas do naruto) AVALIAÇÃO: 75/100
// (dicas do naruto) Pontos positivos: Uso correto do Scanner, StringBuilder e métodos de String
// (dicas do naruto) Pontos de melhoria: Falta de comentários explicativos, nomenclatura de classe e organização do código

public class task {
    // (dicas do naruto) DICA 1: Use nomes de classes em PascalCase (Task ao invés de task)
    // (dicas do naruto) DICA 2: Adicione comentários explicando o propósito de cada seção do código
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "A vontade do fogo vive em Konoha";
        
        // (dicas do naruto) DICA 3: Separe as operações em métodos para melhor organização
        // Demonstrando métodos básicos de String
        System.out.println("Tamanho da frase: " + frase.length());
        String fraseTrocada = frase.replace("fogo", "raio");
        System.out.println("Frase com troca: " + fraseTrocada);
        System.out.println("Frase em maiúsculas: " + frase.toUpperCase());

        // (dicas do naruto) DICA 4: Adicione validação de entrada do usuário
        System.out.print("Digite o nome de um personagem: ");
        String personagem = scanner.nextLine();

        // (dicas do naruto) DICA 5: Use trim() para remover espaços em branco desnecessários
        //
        if (personagem.toUpperCase().startsWith("N")) {
            System.out.println("O nome começa com a letra N.");
        } else {
            System.out.println("O nome NÃO começa com a letra N.");
        }

        // (dicas do naruto) DICA 6: Excelente uso do StringBuilder! Muito eficiente para concatenação
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Naruto");
        mensagem.append(" treinou com ");
        mensagem.append("Jiraiya");
        mensagem.append(" em ");
        mensagem.append("Konoha.");

        System.out.println("Mensagem montada: " + mensagem.toString());
        
        // (dicas do naruto) DICA 7: Sempre feche recursos (muito bem feito!)
        scanner.close();
    }
}
