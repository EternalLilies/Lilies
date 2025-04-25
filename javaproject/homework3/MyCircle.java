package homework3;

import java.awt.Graphics;
import java.awt.Color;

public class MyCircle implements MyPanel {
	private int x; // 圆心的x坐标
	private int y; // 圆心的y坐标
	private int radius; // 圆的半径
	private Color color; // 圆的颜色

	public MyCircle(int x, int y, int radius, Color color) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}

	public void draw(Graphics g)
	{
		g.setColor(color);
		g.drawOval(x, y, radius, radius);
	}
}
