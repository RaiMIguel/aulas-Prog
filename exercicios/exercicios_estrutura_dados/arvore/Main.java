package exercicios.exercicios_estrutura_dados.arvore;

public class Main {
    public static void main (String[] args){
        Tree.BinaryTree myTreeTest = new Tree.BinaryTree(7, "R");

        myTreeTest.root.left = new Tree.Node(8,"filha de R");
        myTreeTest.root.right = new Tree.Node(10,"filha de R");

        System.out.println(myTreeTest.root);
        System.out.println(myTreeTest.root.left);
        System.out.println(myTreeTest.root.right);

    }
}
