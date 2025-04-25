package homework3;

import java.awt.Graphics;
import java.awt.Color;

public class MyRectangle implements MyPanel {
	private int x; // 矩形的左上角x坐标
	private int y; // 矩形的左上角y坐标
	private int width; // 矩形的宽度
	private int height; // 矩形的高度
	private Color color; // 矩形的颜色

	public MyRectangle(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void draw(Graphics g)
	{
		g.setColor(color);
		g.drawRect(x, y, width, height);
	}
}
