package behavioraldesignpatterns.iterator.model.iterators;

public interface Iterator<T> {
    public boolean hasNext();
    public T next();
}
