import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
class MyPanel extends JPanel {
Ball ball; //��������һ�������
public MyPanel(){
ball = new Ball(0,0,100,20,20); //��ʼ����
}
//��������
public void animate(){
ball.update(); //�������״̬
this.repaint(); //����ϵͳ�ػ�
}
//JPanel�Ļ�ͼ�ص�������Graphics��Java�Ļ�ͼ���߶���
public void paint(Graphics g){
g.setColor(Color.white);
g.fillRect(0, 0, this.getWidth(), this.getHeight()); //�ð�ɫ�����Ļ
ball.render(g); //��Ⱦ��
}
}