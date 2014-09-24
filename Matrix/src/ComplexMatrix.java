public class ComplexMatrix extends Matrix {

    protected ComplexNumber member[][];

    // Constructor
    public ComplexMatrix() {
        this.member = new ComplexNumber[super.SIZE][super.SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.member[i][j] = new ComplexNumber();
            }
        }
    }

    public ComplexMatrix(int initSIZE) {
        super(initSIZE);
        this.member = new ComplexNumber[super.SIZE][super.SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.member[i][j] = new ComplexNumber();
            }
        }
    }

    // Method 
    // Add two matrix
    public static ComplexMatrix add(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix c = new ComplexMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.member[i][j] = ComplexNumber.add(a.member[i][j], b.member[i][j]);
            }
        }
        return c;
    }

    // Substract two matrix
    public static ComplexMatrix substract(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix c = new ComplexMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.member[i][j] = ComplexNumber.substract(a.member[i][j], b.member[i][j]);
            }
        }
        return c;
    }

    // Multiply two metrix

    public static ComplexMatrix multiplication(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix c = new ComplexMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                for (int k = 0; k < a.SIZE; k++) {
                    c.member[i][j] = ComplexNumber.add(c.member[i][j], ComplexNumber.multipilcation(a.member[i][k], b.member[k][j]));
                }
            }
        }
        return c;
    }
}
