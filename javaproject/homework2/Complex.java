package homework2;

public class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex() {
        this(0, 0);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return real + (imag >= 0 ? "+" : "-") + imag + "i";
    }

    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0 && !isReal();
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(Complex other) {
        return equals(other.real, other.imag);
    }

    public double abs() {
        return Math.sqrt(real * real + imag * imag);
    }

    public Complex add(Complex right) {
        return new Complex(this.real + right.real, this.imag + right.imag);
    }

    public Complex subtract(Complex right) {
        return new Complex(this.real - right.real, this.imag - right.imag);
    }

    public Complex multiply(Complex right) {
        return new Complex(this.real * right.real - this.imag * right.imag,
                this.real * right.imag + this.imag * right.real);
    }

    public Complex divide(Complex right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        if(denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        Complex multiComplex = new Complex(right.real, -right.imag);
        Complex numerator = this.multiply(multiComplex);
        return new Complex(numerator.real / denominator, numerator.imag / denominator);
    }

}
