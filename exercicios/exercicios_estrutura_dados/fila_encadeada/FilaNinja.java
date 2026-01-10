package exercicios.exercicios_estrutura_dados.fila_encadeada;

public class FilaNinja {

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

    private Node inicio; // Onde removemos (frente da fila)
    private Node fim;    // Onde inserimos (final da fila)
    private int size;

    public FilaNinja() {
        this.inicio = null;
        this.fim = null;
        this.size = 0;
    }

    // ENQUEUE: Adiciona ao final da fila
    public void enqueue(int id, String nome) {
        Node novo = new Node(id, nome);

        if (isEmpty()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.next = novo; // O atual último aponta para o novo
            fim = novo;      // O novo passa a ser o último
        }
        size++;
    }

    // DEQUEUE: Remove do início da fila
    public Node dequeue() {
        if (isEmpty()) {
            return null;
        }

        Node removido = inicio;
        inicio = inicio.next; // O início avança para o próximo

        // Se a fila ficar vazia após a remoção, o fim também deve ser nulo
        if (inicio == null) {
            fim = null;
        }

        size--;
        return removido;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return;
        }
        Node atual = inicio;
        System.out.print("\nFILA: ");
        while (atual != null) {
            System.out.print("[" + atual.id + "|" + atual.nome + "] -> ");
            atual = atual.next;
        }
        System.out.println("FIM");
    }
}