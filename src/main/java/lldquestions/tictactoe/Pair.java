package lldquestions.tictactoe;

public class Pair<T,U> {

    private final T left;
    private final U right;

    public Pair(T left, U right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public U getRight() {
        return right;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair otherPair = (Pair) o;
        return this.left.equals(otherPair.left) && this.right.equals(otherPair.right);
    }

}
