import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
class MyPanel extends JPanel {
Ball ball; //画面中有一个球对象
public MyPanel(){
ball = new Ball(0,0,100,20,20); //初始化球
}
//动画方法
public void animate(){
ball.update(); //更新球的状态
this.repaint(); //呼唤系统重画
}
//JPanel的绘图回调函数。Graphics是Java的绘图工具对象。
public void paint(Graphics g){
g.setColor(Color.white);
g.fillRect(0, 0, this.getWidth(), this.getHeight()); //用白色清空屏幕
ball.render(g); //渲染球
}
}