package exercicios.exercicios_estrutura_dados.ListaCIrcularDuplamenteLigada;

public class ListaCircularDupla {

    class Node {
        int id;
        String nome;
        Node next, prev;

        Node(int id, String nome) {
            this.id = id;
            this.nome = nome;
        }
    }

    private Node head = null;

    // [C]REATE - Inserção Ordenada
    public void insert(int id, String nome) {
        Node novo = new Node(id, nome);
        if (head == null) {
            head = novo;
            novo.next = head;
            novo.prev = head;
            return;
        }

        if (id < head.id) {
            Node tail = head.prev;
            novo.next = head;
            novo.prev = tail;
            head.prev = novo;
            tail.next = novo;
            head = novo;
        } else {
            Node atual = head;
            while (atual.next != head && atual.next.id < id) {
                atual = atual.next;
            }
            novo.next = atual.next;
            novo.prev = atual;
            atual.next.prev = novo;
            atual.next = novo;
        }
    }

    // [R]EAD - Busca e Exibição
    public Node search(int id) {
        if (head == null) return null;
        Node atual = head;
        do {
            if (atual.id == id) return atual;
            atual = atual.next;
        } while (atual != head);
        return null;
    }

    public void display() {
        if (head == null) { System.out.println("Equipa vazia!"); return; }
        Node atual = head;
        do {
            System.out.print("[" + atual.id + "|" + atual.nome + "] <-> ");
            atual = atual.next;
        } while (atual != head);
        System.out.println("(HEAD)");
    }

    // [U]PDATE - Atualizar Nome
    public boolean update(int id, String novoNome) {
        Node ninja = search(id);
        if (ninja != null) {
            ninja.nome = novoNome;
            return true;
        }
        return false;
    }

    // [D]ELETE - Remover da Lista
    public boolean remove(int id) {
        if (head == null) return false;

        Node alvo = search(id);
        if (alvo == null) return false;

        // Se for o único nó da lista
        if (alvo.next == head && alvo.prev == head) {
            head = null;
        } else {
            // "Pula" o nó alvo ajustando os vizinhos
            alvo.prev.next = alvo.next;
            alvo.next.prev = alvo.prev;

            // Se o alvo era o head, o head agora é o próximo
            if (alvo == head) {
                head = alvo.next;
            }
        }
        return true;
    }
}