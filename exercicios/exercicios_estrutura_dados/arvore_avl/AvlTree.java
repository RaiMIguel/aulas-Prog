package exercicios.exercicios_estrutura_dados.arvore_avl;

class AVLNode {
    int id;
    String name;
    int height;
    AVLNode left, right;

    AVLNode(int id, String name) {
        this.id = id;
        this.name = name;
        this.height = 1;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " | Nome: " + this.name + " (Alt: " + this.height + ")";
    }
}

public class AvlTree {
    AVLNode root;

    private int height(AVLNode n) { return (n == null) ? 0 : n.height; }

    private int getBalance(AVLNode n) { return (n == null) ? 0 : height(n.left) - height(n.right); }

    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    public void insert(int id, String name) {
        root = insertRecursive(root, id, name);
    }

    private AVLNode insertRecursive(AVLNode node, int id, String name) {
        if (node == null) return new AVLNode(id, name);

        if (id < node.id) node.left = insertRecursive(node.left, id, name);
        else if (id > node.id) node.right = insertRecursive(node.right, id, name);
        else return node;

        return rebalance(node);
    }

    public AVLNode search(int id) {
        return searchRecursive(root, id);
    }

    private AVLNode searchRecursive(AVLNode current, int id) {
        if (current == null || current.id == id) return current;
        return id < current.id ? searchRecursive(current.left, id) : searchRecursive(current.right, id);
    }

    public void listInOrder() {
        listRecursive(root);
    }

    private void listRecursive(AVLNode node) {
        if (node != null) {
            listRecursive(node.left);
            System.out.println(node);
            listRecursive(node.right);
        }
    }

    public void update(int id, String newName) {
        AVLNode target = search(id);
        if (target != null) {
            target.name = newName;
            System.out.println("Atualizado!");
        } else System.out.println("Não encontrado.");
    }

    public void delete(int id) {
        root = deleteRecursive(root, id);
    }

    private AVLNode deleteRecursive(AVLNode root, int id) {
        if (root == null) return root;

        if (id < root.id) root.left = deleteRecursive(root.left, id);
        else if (id > root.id) root.right = deleteRecursive(root.right, id);
        else {
            if ((root.left == null) || (root.right == null)) {
                AVLNode temp = (root.left != null) ? root.left : root.right;
                if (temp == null) {
                    temp = root;
                    root = null;
                } else root = temp;
            } else {

                AVLNode temp = minValueNode(root.right);
                root.id = temp.id;
                root.name = temp.name;
                root.right = deleteRecursive(root.right, temp.id);
            }
        }

        if (root == null) return root;
        return rebalance(root);
    }

    private AVLNode minValueNode(AVLNode node) {
        AVLNode current = node;
        while (current.left != null) current = current.left;
        return current;
    }

    private AVLNode rebalance(AVLNode node) {
        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.left) >= 0) return rightRotate(node);
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && getBalance(node.right) <= 0) return leftRotate(node);
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    public void displayTree() {
        displayRecursive(this.root, 0);
    }

    private void displayRecursive(AVLNode root, int level) {
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