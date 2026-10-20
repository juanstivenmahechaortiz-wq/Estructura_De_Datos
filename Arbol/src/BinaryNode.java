import com.sun.source.tree.Tree;

import java.util.Objects;

public final class BinaryNode<T> extends TreeNode<T> {
    // Referencias a los hijos (pueden ser null.).
    // private -> encapsulamiento estricto.


    private BinaryNode<T> left;
    private BinaryNode<T> right;


    public BinaryNode(T value){ super(value);}


    // GETTERS publicos -> lectura abierta.

    public BinaryNode<T> getLeft() {return left;}
    public BinaryNode<T> getRight() { return right;}

    // SETTERS package-private -> SOLO clases del mismo
    // paquete (BinaryTree, BST) pueden modificar los hijos-
    // Un cliente externo NO puede romper la estructura.

    void setLeft(BinaryNode<T> n) { this.left = n;}
    void setRight(BinaryNode<T> n) { this.right = n;}

    @Override
    public  boolean isLeaf(){
        // Es hoja si no tiene ni izquierdo ni derecho
        return left == null && right == null;
    }

    @Override
    public int childCount() {
        // Contamos cuantos hijos no nulos hay(0, 1 o 2).
        int c = 0;
        // Si el hijo izquierdo existe, sumamos 1.
        if (left != null) c++;
        // Si el hijo derecho existe, sumamos 1.
        if (right != null) c++;

        return c;
    }

}
