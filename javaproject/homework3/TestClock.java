package homework3;

import javax.swing.JFrame;
import java.util.Random;

public class TestClock {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;
    private static final int RADIUS = 500;
    public static void main(String[] args) {
        Random randomNumber = new Random();
        MyClock clock = new MyClock((WIDTH - RADIUS) / 2, (HEIGHT - RADIUS) / 2, RADIUS, randomNumber.nextInt(24), randomNumber.nextInt(60), randomNumber.nextInt(60)); // 创建MyClock对象
        MyPanel[] panels = { clock };
        DrawPanel panel = new DrawPanel(panels);
        JFrame application = new JFrame();
        application.setTitle("面向对象程序设计第3次作业");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(WIDTH, HEIGHT);
		application.setVisible(true);

        Thread t = new Thread() {
            public void run() {
                while (true) {
                try {
                Thread.sleep(1000); //设置绘制的时间间隔为 1 秒
                } catch (InterruptedException e) {
                System.err.println(e);
                }
                clock.incrementSecond();
                //更新绘制图形面板上的内容（也就是绘制的图像）
                panel.updateUI();
                }
            }
        };
        t.start();
    }
    
}
