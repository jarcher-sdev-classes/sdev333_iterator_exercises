package objects;

// TODO: Make this class iterable
public class FibonacciReader {
    private int n;

    public FibonacciReader(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Fibonacci sequence from 1 to " + n;
    }

    // TODO: Add the iterator class
}