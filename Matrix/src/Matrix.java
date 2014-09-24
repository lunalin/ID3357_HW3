import java.util.Scanner;

public class Matrix {

    // Field
    protected int SIZE;
    protected int member[][];

    // Constructor
    public Matrix() {
        SIZE = 2;
        member = new int[SIZE][SIZE];
    }

    public Matrix(int initSIZE) {
        SIZE = initSIZE;
        member = new int[SIZE][SIZE];
    }

    // Method
    // Input matrix's member at index i,j
    public void setMemberAt(int i, int j, int val) {
        this.member[i][j] = val;
    }

    // Input all matrix's member
    public void inputAllMember() {
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                this.member[i][j] = sn.nextInt();
            }
        }
    }

    // Add two matrix
    public static Matrix add(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.member[i][j] = a.member[i][j] + b.member[i][j];
            }
        }
        return c;
    }

    // Substract two matrix
    public static Matrix substract(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.member[i][j] = a.member[i][j] - b.member[i][j];
            }
        }
        return c;
    }

    // Multiply two metrix
    public static Matrix multiplication(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                for (int k = 0; k < a.SIZE; k++) {
                    c.member[i][j] += a.member[i][k] * b.member[k][j];
                }
            }
        }
        return c;
    }

    // Print out matrix
    @Override
    public String toString() {
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                System.out.print(this.member[i][j] + " ");
            }
            System.out.println("");
        }
        return "";
    }

}
