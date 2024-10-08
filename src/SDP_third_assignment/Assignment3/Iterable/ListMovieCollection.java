package Assignment3.Iterable;

import java.util.ArrayList;
import java.util.List;

public class ListMovieCollection<T> {
    public List<T> movie;
    public ListMovieCollection() {
        movie = new ArrayList<>();
    }
    public void addMovie(T item) {
        movie.add(item);
    }
    public Iterator<T> iterator() {
        return new ListMovieIterator<>(movie);
    }
}
