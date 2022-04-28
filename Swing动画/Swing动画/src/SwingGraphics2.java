import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SwingGraphics2 {
public static void main(String[] args) {
JFrame frame = new JFrame();
MyPanel panel = new MyPanel(); //创建这个自定义的MyPanel面板
frame.setBounds(200, 200, 1800, 1200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel); //给窗口添加面板
frame.setVisible(true);
while(true) //游戏大循环
{
//不停的重绘JPanel,实现动画的效果
panel.animate();
try
{
Thread.sleep(40);
}
catch (InterruptedException e)
{
e.printStackTrace();
}
}
}
}