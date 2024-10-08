package Assignment3.Iterable;

public class Main {
    public static void main(String[] args) {
        ListMovieCollection<String> listMovies = new ListMovieCollection<>();
        listMovies.addMovie("Movie 1");
        listMovies.addMovie("Movie 2");
        listMovies.addMovie("Movie 3");

        Iterator<String> iterator = listMovies.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayMovieCollection<String> arrayMovies = new ArrayMovieCollection<>();
        arrayMovies.addMovie("Movie A");
        arrayMovies.addMovie("Movie B");
        arrayMovies.addMovie("Movie C");

        Iterator<String> arrayIterator = arrayMovies.iterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}
