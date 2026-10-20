

public interface Node<T> {

    T getValue();
    boolean isLeaf();


    int childCount();
}
