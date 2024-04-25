package objects;

// TODO: Make this class iterable
public class LineReader {
    private String line;

    public LineReader(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }
    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Line=" + line;
    }

    // TODO: Add the iterator class
}

