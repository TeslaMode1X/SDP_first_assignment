package Assignment3.Iterable;

import java.util.List;

public class ListMovieIterator<T> implements Iterator<T> {
    private List<T> items;
    private int pos = 0;
    public ListMovieIterator(List<T> list) {
        this.items = list;
    }
    @Override
    public boolean hasNext() {
        return pos < items.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return items.get(pos++);
        }
        return null;
    }
}
