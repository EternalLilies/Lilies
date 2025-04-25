package homework3;

import java.awt.Graphics;
import java.awt.Color;
import homework2.*;

public class MyClock extends MyTime implements MyPanel {
    // MyClock类实现了MyPanel接口，表示一个时钟
    private int x; // 圆心的x坐标
    private int y; // 圆心的y坐标
    private int radius; // 圆的半径

    public MyClock(int x, int y, int radius, int hour, int minute, int second) {
        super(hour, minute, second); // 调用父类MyTime的构造函数
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public MyClock(int x, int y, int radius, MyTime time) {
        super(time); // 调用父类MyTime的构造函数
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(Graphics g) {
        // 绘制时钟的圆形边框
        g.setColor(Color.BLACK);
        g.drawOval(x, y, radius, radius);

        // 绘制时钟的刻度
        for (int i = 0; i < 12; i++) {
            int startX = x + radius / 2 + toX(i * 30 - 90, radius / 2 - 10);
            int startY = y + radius / 2 + toY(i * 30 - 90, radius / 2 - 10);
            int endX = x + radius / 2 + toX(i * 30 - 90, radius / 2);
            int endY = y + radius / 2 + toY(i * 30 - 90, radius / 2);
            g.drawLine(startX, startY, endX, endY);
        }

        // 绘制时钟的数字
        g.setColor(Color.BLACK);
        for (int i = 1; i <= 12; i++) {
            String number = String.valueOf(i);
            int textX = x + radius / 2 + toX(i * 30 - 90, radius / 2 - 30);
            int textY = y + radius / 2 + toY(i * 30 - 90, radius / 2 - 30);
            g.drawString(number, textX, textY);
        }

        // 绘制时钟的中心点
        g.setColor(Color.RED);
        g.fillOval(x + radius / 2 - 5, y + radius / 2 - 5, 10, 10); // 中心点

        // 绘制时针、分针和秒针
        int hourX = x + radius / 2 + toX(hour * 30 - 90 + minute / 2, radius / 4);
        int hourY = y + radius / 2 + toY(hour * 30 - 90 + minute / 2, radius / 4);
        int minuteX = x + radius / 2 + toX(minute * 6 - 90, radius / 3);
        int minuteY = y + radius / 2 + toY(minute * 6 - 90, radius / 3);
        int secondX = x + radius / 2 + toX(second * 6 - 90, radius / 2.5);
        int secondY = y + radius / 2 + toY(second * 6 - 90, radius / 2.5);
        g.setColor(Color.GREEN);
        g.drawLine(x + radius / 2, y + radius / 2, hourX, hourY); // 时针
        g.setColor(Color.BLUE);
        g.drawLine(x + radius / 2, y + radius / 2, minuteX, minuteY); // 分针
        g.setColor(Color.RED);
        g.drawLine(x + radius / 2, y + radius / 2, secondX, secondY); // 秒针
    }

    private int toX(double angle, double radius) {
        return (int) (radius * Math.cos(Math.toRadians(angle)));
    }

    private int toY(double angle, double radius) {
        return (int) (radius * Math.sin(Math.toRadians(angle)));
    }
}
