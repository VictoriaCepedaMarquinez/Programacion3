package ProgramacionIII.tp1;
import java.util.Iterator;

public class MyIterator<T> implements Iterator<T>{
    private Node<T> current;

    public MyIterator(Node<T> first) {  // Se pasa la referencia de first
        this.current = first;
    }


    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T data = current.getInfo();
        current = current.getNext();
        return data;
    }
}
