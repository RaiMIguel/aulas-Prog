// (dicas do naruto) AVALIAÇÃO: 80/100
// (dicas do naruto) Pontos positivos: Código limpo, uso correto de arrays e for loop
// (dicas do naruto) Pontos de melhoria: Falta package, inconsistência na capitalização dos nomes, falta de comentários

// (dicas do naruto) DICA 1: Adicione a declaração do package no início

public class Ex001 {
    // (dicas do naruto) DICA 2: Use nomes mais descritivos (ExercicioVetor1 ou PersonagensNaruto)
    
    public static void main(String[] args) {
        // (dicas do naruto) DICA 3: Mantenha consistência na capitalização - "Sasuke" e "Shikamaro" têm iniciais maiúsculas
        // (dicas do naruto) DICA 4: "André" não é um personagem de Naruto - mantenha a consistência temática
        String [] personagens = {"naruto", "Sasuke", "Shikamaro", "André", "Ino"};

        // (dicas do naruto) DICA 5: Excelente uso do for loop tradicional!
        // (dicas do naruto) DICA 6: Use nomes mais descritivos para variáveis (i ao invés de indice é mais comum)
        for(int indice=0; indice < personagens.length; indice++) {
            System.out.print(personagens[indice]+ " ");
        }
        
        // (dicas do naruto) DICA 7: Muito bem por adicionar a quebra de linha no final!
        System.out.println("");
        
        // (dicas do naruto) DICA 8: Considere também praticar com enhanced for loop:
        // for(String personagem : personagens) { System.out.print(personagem + " "); }
        
        // (dicas do naruto) DICA 9: Adicione mais funcionalidades: busca, ordenação, contagem
        // (dicas do naruto) DICA 10: Ótimo trabalho! Código simples e funcional!
    }
}
