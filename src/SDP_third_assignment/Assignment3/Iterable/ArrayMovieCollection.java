package Assignment3.Iterable;

import java.util.Objects;

public class ArrayMovieCollection<T> {
    public T[] arr;
    public int pos = 0;
    @SuppressWarnings("unchecked")
    public ArrayMovieCollection() {
        arr = (T[]) new Object[5];
    }
    public void addMovie(T movie) {
        if (pos == arr.length) {
            grow();
        }
        arr[pos++] = movie;
    }
    @SuppressWarnings("unchecked")
    public void grow() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        this.arr = newArr;
    }

    public Iterator<T> iterator() {
        return new ArrayMovieIterator<>(arr);
    }
}
