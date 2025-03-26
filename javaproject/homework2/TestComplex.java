package homework2;

public class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(1.0, 1.2);
        Complex c3 = new Complex(1, 0);
        Complex c4 = new Complex(0, 1.1);
        Complex c5 = new Complex(1, 1.2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c2.getReal()+" "+c2.getImag());
        c2.setReal(2.0);
        c2.setImag(2.2);
        System.out.println(c2.getReal()+" "+c2.getImag());
        c2.setValue(3.0, 3.3);
        System.out.println(c2.getReal()+" "+c2.getImag());
        System.out.println(c2.toString());
        System.out.println(c1.isReal());
        System.out.println(c2.isReal());
        System.out.println(c3.isReal());
        System.out.println(c4.isReal());
        System.out.println(c1.isImaginary());
        System.out.println(c4.isImaginary());
        System.out.println(c2.equals(c5));
        System.out.println(c2.equals(3.0, 3.3));
        System.out.println(c1.abs());
        System.out.println(c2.abs());
        Complex c6 = new Complex(3, 4);
        System.out.println(c6.abs());
        Complex c7 = c2.add(c6);
        Complex c8 = c2.subtract(c6);
        Complex c9 = c2.multiply(c6);
        Complex c10 = c2.divide(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
        System.out.println(c10);
        Complex c11 = c2.divide(c1);
        System.out.println(c11);
    }
}
