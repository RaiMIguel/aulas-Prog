package exercicios.exercicios_estrutura_dados.arvore;

public class Tree {
    public  static class Node {
        int id;
        String name;
        Tree.Node left;
        Tree.Node right;

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
    public static class BinaryTree {
        Node root;

        BinaryTree(int id, String name){
            this.root = new Node(id, name);
        }
    }

}
