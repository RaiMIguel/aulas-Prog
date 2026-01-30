package exercicios.exercicios_estrutura_dados.arvore;

class Node {
    int id;
    String name;
    Node left;
    Node right;

    Node(int id, String name) {
        this.id = id;
        this.name = name;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " | Nome: " + this.name;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree(int id, String name) {
        this.root = new Node(id, name);
    }

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int id, String name) {
        this.root = insertRecursive(this.root, id, name);
    }

    private Node insertRecursive(Node current, int id, String name) {
        if (current == null) {
            return new Node(id, name);
        }

        if (id < current.id) {
            current.left = insertRecursive(current.left, id, name);
        } else if (id > current.id) {
            current.right = insertRecursive(current.right, id, name);
        }
        return current;
    }

    public Node search(int id) {
        return searchRecursive(this.root, id);
    }

    private Node searchRecursive(Node current, int id) {
        if (current == null || current.id == id) {
            return current;
        }
        return id < current.id
                ? searchRecursive(current.left, id)
                : searchRecursive(current.right, id);
    }

    public void listInOrder() {
        System.out.println("\n--- Lista de Usuários (In-Order) ---");
        listRecursive(this.root);
    }

    private void listRecursive(Node node) {
        if (node != null) {
            listRecursive(node.left);
            System.out.println(node);
            listRecursive(node.right);
        }
    }

    public void update(int id, String newName) {
        Node target = search(id);
        if (target != null) {
            target.name = newName;
            System.out.println("ID " + id + " atualizado com sucesso!");
        } else {
            System.out.println("Erro: ID " + id + " não encontrado.");
        }
    }

    public void delete(int id) {
        this.root = deleteRecursive(this.root, id);
    }

    private Node deleteRecursive(Node current, int id) {
        if (current == null) return null;

        if (id < current.id) {
            current.left = deleteRecursive(current.left, id);
        } else if (id > current.id) {
            current.right = deleteRecursive(current.right, id);
        } else {
            if (current.left == null) return current.right;
            if (current.right == null) return current.left;

            current.id = findSmallestValue(current.right);
            current.right = deleteRecursive(current.right, current.id);
        }
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.id : findSmallestValue(root.left);
    }
    public void displayTree() {
        displayRecursive(this.root, 0);
    }

    private void displayRecursive(Node root, int level) {
        if (root == null) return;

        displayRecursive(root.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) System.out.print("|\t");
            System.out.println("|-------" + root.id + " (" + root.name + ")");
        } else {
            System.out.println(root.id + " (" + root.name + ")");
        }

        displayRecursive(root.left, level + 1);
    }
}