package homework1;

public class MatrixTest {
    public static void main(String[] args){
        int[][] mInt1={
            {1,2,3,2,1},
            {2,3,4,3,2},
            {1,2,3,2,1}
        },
        mInt2={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        double[][] mDouble1={
            {0.1,1.2,2.3,3.2,2.1,1.0},
            {1.0,2.1,3.2,2.3,1.2,1.0}
        },
        mDouble2={
            {1.1,2.1,3.1},
            {1.2,2.2,3.2},
            {1.3,2.3,3.3},
            {1.4,2.4,3.4},
            {1.5,2.5,3.5},
            {1.6,2.6,3.6}
        };
//        Matrix.print(Matrix.multiply(mInt1, mInt2));
        Matrix.print(mInt1);
        System.out.println();
        Matrix.print(mInt2);
        System.out.println();
        Matrix.print(mDouble1);
        System.out.println();
        Matrix.print(mDouble2);
        Matrix.print(Matrix.add(mInt1, mInt2));
        System.out.println();
        Matrix.print(Matrix.subtract(mInt1, mInt2));
        System.out.println();
        Matrix.print(Matrix.multiply(mDouble1, mDouble2));
        System.out.println();/**/
    }
}
