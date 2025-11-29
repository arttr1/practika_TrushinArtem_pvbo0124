public class Matrix<T extends Number> {

    private final double[][] data;
    private final int rows;
    private final int cols;

    // Конструктор из T[][]
    public Matrix(T[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be empty");
        }
        this.rows = matrix.length;
        this.cols = matrix[0].length;

        // Проверяем прямоугольность
        for (T[] row : matrix) {
            if (row.length != cols) {
                throw new IllegalArgumentException("Matrix must be rectangular");
            }
        }

        this.data = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = matrix[i][j].doubleValue();
            }
        }
    }

    // Конструктор копирования из double[][]
    private Matrix(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(data[i], 0, this.data[i], 0, cols);
        }
    }

    public int getRows() { return rows; }
    public int getCols() { return cols; }

    public double get(int i, int j) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            throw new IndexOutOfBoundsException();
        }
        return data[i][j];
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%.2f ", data[i][j]);
            }
            System.out.println();
        }
    }

    // Сложение матриц (только одинакового размера)
    public Matrix<T> add(Matrix<?> other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have same dimensions");
        }
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return new Matrix<>(result); // warning — unchecked cast, но безопасно здесь
    }

    // Умножение на скаляр
    public Matrix<T> multiply(double scalar) {
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] * scalar;
            }
        }
        return new Matrix<>(result);
    }

    // Умножение матриц (A * B): rowsA × colsA  ×  rowsB × colsB → rowsA × colsB
    public Matrix<T> multiply(Matrix<?> other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Incompatible dimensions: " +
                    this.cols + " != " + other.rows);
        }
        int newCols = other.cols;
        double[][] result = new double[this.rows][newCols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < newCols; j++) {
                double sum = 0.0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.data[i][k] * other.data[k][j];
                }
                result[i][j] = sum;
            }
        }
        return new Matrix<>(result);
    }
}