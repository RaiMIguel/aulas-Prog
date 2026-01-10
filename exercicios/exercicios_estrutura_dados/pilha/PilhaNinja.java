package exercicios.exercicios_estrutura_dados.pilha;

public class PilhaNinja {

    // Classe interna para o Nó
    class Node {
        int id;
        String nome;
        Node next;

        Node(int id, String nome) {
            this.id = id;
            this.nome = nome;
            this.next = null;
        }
    }

    private Node topo;
    private int size;

    public PilhaNinja() {
        this.topo = null;
        this.size = 0;
    }

    // PUSH: Adiciona no topo
    public void push(int id, String nome) {
        Node novo = new Node(id, nome);
        novo.next = topo; // O novo nó aponta para o antigo topo
        topo = novo;      // O topo passa a ser o novo nó
        size++;
    }

    // POP: Remove do topo
    public Node pop() {
        if (isEmpty()) {
            return null;
        }
        Node removido = topo;
        topo = topo.next; // O topo agora é o próximo da fila
        size--;
        return removido;
    }

    // PEEK: Apenas olha o que está no topo sem remover
    public Node peek() {
        return topo;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return;
        }
        Node atual = topo;
        System.out.println("\n--- ESTADO DA PILHA (TOPO -> BASE) ---");
        while (atual != null) {
            System.out.println("[ ID: " + atual.id + " | Nome: " + atual.nome + " ]");
            atual = atual.next;
        }
        System.out.println("---------------------------------------");
    }
}