import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
public class MyView extends JPanel implements Observer{
MyModel myModel; //���õ�ģ�Ͷ���
public MyView(MyModel m){
myModel = m;
}
//Observer�ӿڷ���
@Override
public void update() {
repaint(); //����ϵͳ�ػ����
}
public void paint(Graphics g){
g.setColor(Color.white);
g.fillRect(0, 0, this.getWidth(), this.getHeight());
myModel.render(g);
}
}