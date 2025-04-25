package homework2;

public class Complex {
    private double real;
    private double imag;
    private static final double EPSILON = 1e-8;

    public Complex(double real, double imag) {
        if(Double.isNaN(real) || Double.isNaN(imag)) {
            throw new IllegalArgumentException("Invalid complex number: " + real + " + " + imag + "i");
        }
        if(Double.isInfinite(real) || Double.isInfinite(imag)) {
            throw new IllegalArgumentException("Invalid complex number: " + real + " + " + imag + "i");
        }
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
        if(Double.isNaN(real)) {
            throw new IllegalArgumentException("Invalid real part: " + real);
        }
        if(Double.isInfinite(real)) {
            throw new IllegalArgumentException("Invalid real part: " + real);
        }
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        if(Double.isNaN(imag)) {
            throw new IllegalArgumentException("Invalid imaginary part: " + imag);
        }
        if(Double.isInfinite(imag)) {
            throw new IllegalArgumentException("Invalid imaginary part: " + imag);
        }
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        if(Double.isNaN(real) || Double.isNaN(imag)) {
            throw new IllegalArgumentException("Invalid complex number: " + real + " + " + imag + "i");
        }
        if(Double.isInfinite(real) || Double.isInfinite(imag)) {
            throw new IllegalArgumentException("Invalid complex number: " + real + " + " + imag + "i");
        }
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        if(imag == 0) {
            return String.valueOf(real);
        }
        if(real == 0) {
            return imag + "i";
        }
        if(imag < 0) {
            return real + " - " + (-imag) + "i";
        }
        return real + " + " + imag + "i";
    }

    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0 && !isReal();
    }

    public boolean equals(double real, double imag) {
        if(Double.isNaN(real) || Double.isNaN(imag)) {
            throw new IllegalArgumentException("Invalid complex number: " + real + " + " + imag + "i");
        }
        if(Double.isInfinite(real) || Double.isInfinite(imag)) {
            throw new IllegalArgumentException("Invalid complex number: " + real + " + " + imag + "i");
        }
        return this.real - real < EPSILON && this.real - real > -EPSILON
                && this.imag - imag < EPSILON && this.imag - imag > -EPSILON;
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
