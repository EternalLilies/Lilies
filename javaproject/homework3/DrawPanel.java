package homework3;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DrawPanel extends JPanel implements MyPanel{

	private static final long serialVersionUID = 1L;
	private MyPanel[] panels;
	private int type;
	
	private static final int NONE = 0;
	private static final int NULL = 1;
	private static final int NOTARRAY = 2;
	private static final int NORMALLY = 3;
	
	public DrawPanel()
	{
		setBackground(Color.BLACK);
		type = NONE;
	}
	
	public DrawPanel(MyPanel[] panels)
	{
		setBackground(Color.WHITE);
		if (panels == null)
		{
			type = NULL;
			return;
		}
		if (!panels.getClass().isArray())
		{
			type = NOTARRAY;
			return;
		}
		this.panels = panels;
		type = NORMALLY;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		switch(type){
		case NORMALLY:
			for (MyPanel panel : panels) {
				panel.draw(g);
			}
			break;
		case NULL:
			g.drawString("在DrawPanel的构造函数中，你传递的引用参数是NULL。", 50, 50);
			break;
		case NOTARRAY:
			g.drawString("在DrawPanle的构造函数中，你传递的引用参数必须是某个形状的数组类型。", 50, 50);
			break;
		}
	}

	public void draw(Graphics g) {
		paintComponent(g);
	}
}
