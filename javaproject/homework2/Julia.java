package homework2;

import xjtu.se.Picture;
import java.awt.Color;
import java.io.IOException;

public class Julia {
    /**
     * The C is:
     * -0.8, 0.156
     * 0.285, -0.01
     * 0.38, -0.18
     * -0.835, -0.2321
     * -0.7269, 0.1889
    */
    private static final Complex C = new Complex(-0.8, 0.156);
    private static final int WIDTH = 1024;
    private static final int HEIGHT = 1024;
    private static final int MAX = 255;
    
    private static Complex complexCoordinate(int x, int y) {
        double real = - (x * 4.0 / WIDTH) + 2.0;
        double imag = (y * 4.0 / HEIGHT) - 2.0;
        return new Complex(real, imag);
    }

    private static int julia(Complex z) {
        int n = 0;
        while (n < MAX && z.abs() < 2) {
            z = z.multiply(z).add(C);
            n++;
        }
        return n;
    }

    private static Color getColor(int n) {
        return new Color(255-n % 256, 255-n % 256, 255-n % 256);
    }

    public static void main(String[] args) throws IOException {
        Picture picture = new Picture(WIDTH, HEIGHT);
        Complex c;
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                c = complexCoordinate(x, y);
                picture.setColor(x, y, getColor(julia(c)));
            }
        }
//        picture.save("C:\\code\\Lilies\\javaproject\\homework2\\julia_output.png");
        picture.show();
    }
}
