import java.util.ArrayList;
import java.util.List;

public class BookService {

    public static void main(String[] args) {
        List<Album> albumSource = new ArrayList<>();
        List<Album> albumDestination = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();
        copyToBooks(albumSource, booksDestination);
        copyToBooks(albumSource, albumDestination);
    }

    public static void copyToBooks(List<? extends Book> src, List<Book> dest) {
        for (Book book : src) {
            dest.add(book);
        }
    }
}