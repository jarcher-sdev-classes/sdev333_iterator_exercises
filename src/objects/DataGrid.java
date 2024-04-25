package objects;

import java.util.Arrays;

// TODO: Make this class iterable
public class DataGrid {
    private double[][] grid;

    public DataGrid(double[][] grid) {
        this.grid = grid;
    }

    public double[][] getGrid() {
        return grid;
    }
    public void setGrid(double[][] grid) {
        this.grid = grid;
    }

    @Override
    public String toString() {
        return "Grid=" + Arrays.deepToString(grid);
    }

    // TODO: Add the iterator class
}

