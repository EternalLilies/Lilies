package homework3;

import java.awt.Graphics;
import java.awt.Color;

public class MyOval implements MyPanel {
    private int x; // 椭圆的左上角x坐标
    private int y; // 椭圆的左上角y坐标
    private int width; // 椭圆的宽度
    private int height; // 椭圆的高度
    private Color color; // 椭圆的颜色

    public MyOval(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, width, height);
    }

}
