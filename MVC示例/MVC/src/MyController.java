import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.*;
import javax.swing.*;
public class MyController extends JFrame implements KeyListener, Observer{
	MyModel myModel; //ģ��Model
	MyView myView; //��ͼView
	public MyController(){
		myModel = new MyModel(500,500,200,200,20,20);
		myView = new MyView(myModel); //������ͼ����ģ�Ͷ�������
		myModel.attach(this); //��������ģ��ע��
		myModel.attach(myView); //��ͼ��ģ��ע��
		this.setContentPane(myView); //�����������
		this.setSize(1024,768); //���ô���ȱʡ��С
		this.addKeyListener(this); //��Ӽ��̼�����
		this.addWindowListener(new WindowAdapter(){ //��Ӵ��ڹرհ�ť
			public void windowClosing(WindowEvent we){
			System.exit(0);
			}
		});
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MyController();
	}
	@Override
	public void keyPressed(KeyEvent e) {
	//���������յ��û������¼��󣬸��ݲ�ͬ�ļ����������ģ�͵Ĳ�ͬ���񷽷�
		if( e.getKeyCode() == KeyEvent.VK_W ){
			myModel.moveUp();
		}else if( e.getKeyCode() == KeyEvent.VK_S ){
			myModel.moveDown();
		}else if( e.getKeyCode() == KeyEvent.VK_A ){
			myModel.moveLeft();
		}else if( e.getKeyCode() == KeyEvent.VK_D){
			myModel.moveRight();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
	//Observer�ӿڷ���������������ʲô
	@Override
	public void update() {
	}
}