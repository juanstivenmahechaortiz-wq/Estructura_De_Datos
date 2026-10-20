
import java.util.Objects;

/*
 * Base ABSTRACTA compartida por todos los nodos.
 * Herencia: BinaryNode y NaryNode heredan de aqui.
 * ENCAPSULAMIENTO: 'value' es final -> inmutable.
 *  protected -> visible a subclases, no al mundo exterior.
*/
public abstract class TreeNode<T> implements Node<T>{

    protected final T value;

    protected TreeNode(T value) {
        // Objects.requireNonNull falla rapido si value == null.
        // Esto evita bugs silenciosos mas adelante.
        this.value = Objects.requireNonNull(value, "El valor del nodo nopuede ser null");
    }

    @Override
    public T getValue() { return  value;}

    @Override
    public String toString() {return String.valueOf(value);}
}
