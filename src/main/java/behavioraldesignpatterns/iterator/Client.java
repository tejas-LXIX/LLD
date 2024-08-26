package behavioraldesignpatterns.iterator;

import java.util.Arrays;
import java.util.List;
import behavioraldesignpatterns.iterator.model.Book;
import behavioraldesignpatterns.iterator.model.Library;
import behavioraldesignpatterns.iterator.model.iterators.Iterator;

public class Client {
    public static void main(String[] args) {
        List<Book> booksList = Arrays.asList(
                new Book(100, "Science"),
                new Book(200, "Maths"),
                new Book(300, "GK"),
                new Book(400, "Drawing")
        );

        Library lib = new Library(booksList);
        Iterator<Book> itr = lib.getIterator();

        while(itr.hasNext()) {
            Book book = itr.next();
            System.out.println(book.getBookName());
        }
    }
}
