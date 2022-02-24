import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
public class MyView extends JPanel implements Observer{
MyModel myModel; //引用的模型对象
public MyView(MyModel m){
myModel = m;
}
//Observer接口方法
@Override
public void update() {
repaint(); //请求系统重画面板
}
public void paint(Graphics g){
g.setColor(Color.white);
g.fillRect(0, 0, this.getWidth(), this.getHeight());
myModel.render(g);
}
}