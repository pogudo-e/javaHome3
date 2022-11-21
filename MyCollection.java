import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollection <T> implements Iterable, Iterator<T>{

    private List<T> list;
    int i = 0;

    public MyCollection() {
        this.list = new ArrayList<>();
    }

    public void add (T item){
        list.add(item);
    }

    public T get(int i){
        return list.get(i);
    }

    @Override
    public boolean hasNext() {
        return i < list.size();
    }

    @Override
    public T next() {
        return list.get(i++);
    }

    @Override
    public Iterator iterator() {
        return this;
    }
}