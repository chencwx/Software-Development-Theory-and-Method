import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SwingGraphics2 {
public static void main(String[] args) {
JFrame frame = new JFrame();
MyPanel panel = new MyPanel(); //��������Զ����MyPanel���
frame.setBounds(200, 200, 1800, 1200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel); //������������
frame.setVisible(true);
while(true) //��Ϸ��ѭ��
{
//��ͣ���ػ�JPanel,ʵ�ֶ�����Ч��
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