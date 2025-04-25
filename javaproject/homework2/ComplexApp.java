package homework2;

import java.util.Scanner;

public class ComplexApp {
    private static Scanner in = new Scanner(System.in);

    private static void printfPart(int number, Complex complex ) {
        System.out.println("Number " + number + " is: (" + complex.toString() + ")");
        System.out.println("(" + complex.toString() + ") is " + (complex.isReal() ? "" : "NOT ")
                + "a pure real number");
        System.out.println("(" + complex.toString() + ") is " + (complex.isImaginary() ? "" : "NOT ")
                + "a pure imaginary number");
    }

    private static void printfTwo(Complex c1, Complex c2) {
        System.out.println("(" + c1.toString() + ") is " + (c1.equals(c2) ? "" : "NOT ")
                + "equal to (" + c2.toString() + ")");
        System.out.println("(" + c1.toString() + ") + (" + c2.toString() + ") = (" + c1.add(c2).toString() + ")");
    }

    private static Complex getComplex(int number) {
        System.out.print("Enter complex number " + number + " (real and imaginary parts): ");
        double real = in.nextDouble(), imag = in.nextDouble();
        return new Complex(real, imag);
    }

    public static void main(String[] args) {
        Complex c1 = getComplex(1);
        Complex c2 = getComplex(2);
        printfPart(1, c1);
        printfPart(2, c2);
        printfTwo(c1, c2);
        in.close();
    }
}
