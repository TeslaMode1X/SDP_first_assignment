package Assignment3.Iterable;

public class ArrayMovieIterator<T> implements Iterator<T> {
    public T[] arr;
    public int pos;
    public ArrayMovieIterator(T[] arr) {
        this.arr = arr;
    }
    @Override
    public boolean hasNext() {
        return pos < arr.length;
    }
    @Override
    public T next() {
        if (hasNext()) {
            return arr[pos++];
        }
        return null;
    }
}
