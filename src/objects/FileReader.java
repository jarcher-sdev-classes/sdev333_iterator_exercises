package objects;

// TODO: Make this class iterable
public class FileReader {
    private String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "FilePath=" + filePath;
    }

    // TODO: Add the iterator class
}

