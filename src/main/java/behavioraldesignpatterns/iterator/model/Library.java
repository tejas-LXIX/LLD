package behavioraldesignpatterns.iterator.model;

import java.util.List;
import behavioraldesignpatterns.iterator.model.iterators.Iterator;

public class Library {
    private List<Book> booksList;

    public Library(List<Book> booksList) {
        this.booksList = booksList;
    }

    public Iterator<Book> getIterator() {
        return new Itr<>(booksList);
    }

    private static class Itr<T> implements Iterator<T> {

        private List<T> books;
        private int index = 0;

        public Itr(List<T> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public T next() {
            if (hasNext()) {
                return books.get(index++);
            }
            return null;
        }
    }

}
