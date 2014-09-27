import java.util.Scanner;

public class BinaryMatrix extends Matrix {

    // Constructor
    public BinaryMatrix() {
        super.SIZE = 2;

    }

    public BinaryMatrix(int initSIZE) {
        super(initSIZE);
    }

    // Method
    @Override
    public void inputAllMember() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter value for binary matrix's member < " + SIZE + "*" + SIZE + " > [only 0,1]");
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                this.member[i][j] = sn.nextByte();
            }
        }
    }

    public static BinaryMatrix add(BinaryMatrix a, BinaryMatrix b) {
        BinaryMatrix c = new BinaryMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.member[i][j] = a.member[i][j] + b.member[i][j];
                if (c.member[i][j] > 1) {
                    c.member[i][j] = 1;
                }
            }
        }
        return c;
    }

    public static BinaryMatrix substract(BinaryMatrix a, BinaryMatrix b) {
        BinaryMatrix c = new BinaryMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.member[i][j] = (byte) (a.member[i][j] - b.member[i][j]);
                if (c.member[i][j] < 0) {
                    c.member[i][j] = 0;
                }
            }
        }
        return c;
    }

    public static BinaryMatrix multiplication(BinaryMatrix a, BinaryMatrix b) {
        BinaryMatrix c = new BinaryMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                for (int k = 0; k < a.SIZE; k++) {
                    c.member[i][j] += a.member[i][k] * b.member[k][j];
                    if (c.member[i][j] > 1) {
                        c.member[i][j] = 1;
                    }
                }
            }
        }
        return c;
    }

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
