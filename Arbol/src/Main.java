
import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static void printTree(BinaryNode<Integer> node, String prefix, boolean isLeft){
        // Caso nase: si no hay nodo, no imprimir nada.
        // Esto termina la recursión en las hojas.
        if (node == null) return;

        // Imprime el valor con prefijo y conector:
        // "|---- " para hijos izquierdos (o raiz)
        // "|____ " para hijos derechos
        System.out.println(prefix + (isLeft ? "|----" : "|____")+ node.getValue());

        //Llamada recursiva para el subarbol IZQUIERDO
        // Añadimos "|   " al prefijo si venimos por la izquierda-
        printTree(node.getLeft(), prefix + (isLeft ? "|   " : "   "), true);
        printTree(node.getRight(), prefix + (isLeft ? "|   " : "   "), false);
    }



    public static void main(){
        // ========================================================
        // 1. CREAR LOS NODOS
        // ========================================================

        // Nodo raiz con valor 50.
        BinaryNode<Integer> root = new BinaryNode<>(50);

        // Hijos directos de la raiz.
        BinaryNode<Integer> n30 = new BinaryNode<>(30);
        BinaryNode<Integer> n70 = new BinaryNode<>(70);

        // Hijos de n30 (nietos por la izwuierda).
        BinaryNode<Integer> n20 = new BinaryNode<>(20);
        BinaryNode<Integer> n40 = new BinaryNode<>(40);

        // Hijos de la n70 (nietos por la derecha).

        BinaryNode<Integer> n60 = new BinaryNode<>(60);
        BinaryNode<Integer> n80 = new BinaryNode<>(80);

        // ========================================================
        // 2. ENLAZAR los nodos para formar el arbol
        // ========================================================

        // La raiz apunta a sus dos hijos.
         root.setLeft(n30); // 50 -> izq = 30
         root.setRight(n70); // 50 -> der = 70

        // El nodo 30 apunta a sus dos hijos
        n30.setLeft(n20);  // 30 -> izq = 20
        n30.setRight(n40); // 30 -> der = 40

        // El nodo 70 apunta a sus dos hijos
        n70.setLeft(n60);  // 70 -> izq = 60
        n70.setRight(n80); // 70 -> der = 80

        // Resultado visual.
        //         50
        //        /  \
        //      30    70
        //     / \   /  \
        //    20 40 60  80

        // ========================================================
        // 3. MOSTRAR la estructura del arbol
        // ========================================================

        //Titulo de secion
        System.out.println("===== 1. Vista jerárquica =====");
        // llama al metodo recursivo que dibuja el arbol con ramas ASCII.
        // Parametros nodo inicial, prefijo de indentacion, ¿es hijo izq?
        printTree(root, "", true);




    }
}