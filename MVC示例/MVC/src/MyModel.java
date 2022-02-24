import java.util.*;
import java.awt.event.*;
import java.awt.*;
public class MyModel {
	int cx,cy; //����
	int width,height; //��͸�
	int vx,vy; //�ٶ�
	ArrayList<Observer> observsers = new ArrayList<Observer>(); //���еĹ۲���
	public MyModel(int cx,int cy,int width,int height,int vx,int vy){
	this.cx = cx;
	this.cy = cy;
	this.width = width;
	this.height = height;
	this.vx = vx;
	this.vy = vy;
	}
	//ע��۲���
	public void attach(Observer o){
	observsers.add(o);
	}
	//ע���۲���
	public void dettach(Observer o){
	observsers.remove(o);
	}
	//������ģ�͵ķ��񷽷�
	public void moveUp(){ //�����ƶ�
	cy -= vy;
	//ģ��״̬�����仯��Ҫ��ע��Ĺ۲��߷��͸�����Ϣ
	for(Observer o : observsers){
	o.update();
	}
	}
	public void moveDown(){ //�����ƶ�
	cy += vy;
	//ģ��״̬�����仯��Ҫ��ע��Ĺ۲��߷��͸�����Ϣ
	for(Observer o : observsers){
	o.update();
	}
	}
	public void moveLeft(){ //�����ƶ�
	cx -= vx;
	//ģ��״̬�����仯��Ҫ��ע��Ĺ۲��߷��͸�����Ϣ
	for(Observer o : observsers){
	o.update();
	}
	}
	public void moveRight(){ //�����ƶ�
	cx += vx;
	//ģ��״̬�����仯��Ҫ��ע��Ĺ۲��߷��͸�����Ϣ
	for(Observer o : observsers){
	o.update();
	}
	}
	public void render(Graphics g){
	g.setColor(Color.red);
	g.fillOval(cx, cy, width, height);
	}
	}