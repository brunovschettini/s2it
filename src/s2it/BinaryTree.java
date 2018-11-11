package s2it;

public class BinaryTree {

    private int valor;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree() {
        this.valor = 0;
        this.left = null;
        this.right = null;
    }

    public BinaryTree(int valor, BinaryTree left, BinaryTree right) {
        this.valor = valor;
        this.left = left;
        this.right = right;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }
    
    
}
