package homework3;

import java.awt.Color;
import javax.swing.JFrame;
import java.util.Random;

public class TestDraw {
	public static void main(String[] args) {
		DrawPanel panel = new DrawPanel(generatePanels());
		JFrame application = new JFrame();
		application.setTitle("面向对象程序设计第3次作业");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 300);
		application.setVisible(true);
	}

	public static MyPanel[] generatePanels() {
		MyLine[] lines = generateLines();
		MyCircle[] circles = generateCircles();
		MyRectangle[] rectangles = generateRectangles();
		MyOval[] ovals = generateOvals();
		MyPanel[] panels = new MyPanel[lines.length + circles.length + rectangles.length + ovals.length];
		int index = 0;
		for (MyLine line : lines) {
			panels[index++] = line;
		}
		for (MyCircle circle : circles) {
			panels[index++] = circle;
		}
		for (MyRectangle rectangle : rectangles) {
			panels[index++] = rectangle;
		}
		for (MyOval oval : ovals) {
			panels[index++] = oval;
		}
		return panels;
	}

	public static MyLine[] generateLines(){
		Random randomNumber = new Random();
		MyLine[] lines;
		lines = new MyLine[ 10 + randomNumber.nextInt(5)];
		for (int count = 0; count < lines.length; count++)
		{
			int x1 = randomNumber.nextInt(400);
			int y1 = randomNumber.nextInt(300);
			int x2 = randomNumber.nextInt(400);
			int y2 = randomNumber.nextInt(300);
			Color color = new Color( randomNumber.nextInt(256), randomNumber.nextInt(256), 
					randomNumber.nextInt(256));
			lines[count] = new MyLine(x1, y1, x2, y2, color);
		}
		return lines;
	}

	public static MyCircle[] generateCircles(){
		//该函数的功能类似于generateLines，功能是随机的产生不同颜色，不同大小的MyCircle类型对象，并将这些对象汇聚到数组中
		//函数将返回MyCircle类型的数组，该数组可以作为DrawPanel构造函数的参数，从而创建的DrawPanel可以绘制圆形。
		Random randomNumber = new Random();
		MyCircle[] circles;
		circles = new MyCircle[ 10 + randomNumber.nextInt(5)];
		for (int count = 0; count < circles.length; count++)
		{
			int x = randomNumber.nextInt(400);
			int y = randomNumber.nextInt(300);
			int radius = randomNumber.nextInt(100) + 1;
			Color color = new Color( randomNumber.nextInt(256), randomNumber.nextInt(256), 
					randomNumber.nextInt(256));
			circles[count] = new MyCircle(x, y, radius, color);
		}
		return circles;
	}

	public static MyRectangle[] generateRectangles(){
		//这个函数的解释见上面函数的解释
		Random randomNumber = new Random();
		MyRectangle[] rectangles;
		rectangles = new MyRectangle[ 10 + randomNumber.nextInt(5)];
		for (int count = 0; count < rectangles.length; count++)
		{
			int x = randomNumber.nextInt(400);
			int y = randomNumber.nextInt(300);
			int width = randomNumber.nextInt(100) + 1;
			int height = randomNumber.nextInt(100) + 1;
			Color color = new Color( randomNumber.nextInt(256), randomNumber.nextInt(256), 
					randomNumber.nextInt(256));
			rectangles[count] = new MyRectangle(x, y, width, height, color);
		}
		return rectangles;
	}

	public static MyOval[] generateOvals(){
		//这个函数的解释见上面函数的解释
		Random randomNumber = new Random();
		MyOval[] ovals;
		ovals = new MyOval[ 10 + randomNumber.nextInt(5)];
		for (int count = 0; count < ovals.length; count++)
		{
			int x = randomNumber.nextInt(400);
			int y = randomNumber.nextInt(300);
			int width = randomNumber.nextInt(100) + 1;
			int height = randomNumber.nextInt(100) + 1;
			Color color = new Color( randomNumber.nextInt(256), randomNumber.nextInt(256), 
					randomNumber.nextInt(256));
			ovals[count] = new MyOval(x, y, width, height, color);
		}
		return ovals;
	}
}
