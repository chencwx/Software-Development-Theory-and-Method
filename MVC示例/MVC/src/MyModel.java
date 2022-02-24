import java.util.*;
import java.awt.event.*;
import java.awt.*;
public class MyModel {
	int cx,cy; //坐标
	int width,height; //宽和高
	int vx,vy; //速度
	ArrayList<Observer> observsers = new ArrayList<Observer>(); //所有的观察者
	public MyModel(int cx,int cy,int width,int height,int vx,int vy){
	this.cx = cx;
	this.cy = cy;
	this.width = width;
	this.height = height;
	this.vx = vx;
	this.vy = vy;
	}
	//注册观察者
	public void attach(Observer o){
	observsers.add(o);
	}
	//注销观察者
	public void dettach(Observer o){
	observsers.remove(o);
	}
	//以下是模型的服务方法
	public void moveUp(){ //向上移动
	cy -= vy;
	//模型状态发生变化后，要向注册的观察者发送更新消息
	for(Observer o : observsers){
	o.update();
	}
	}
	public void moveDown(){ //向下移动
	cy += vy;
	//模型状态发生变化后，要向注册的观察者发送更新消息
	for(Observer o : observsers){
	o.update();
	}
	}
	public void moveLeft(){ //向左移动
	cx -= vx;
	//模型状态发生变化后，要向注册的观察者发送更新消息
	for(Observer o : observsers){
	o.update();
	}
	}
	public void moveRight(){ //向右移动
	cx += vx;
	//模型状态发生变化后，要向注册的观察者发送更新消息
	for(Observer o : observsers){
	o.update();
	}
	}
	public void render(Graphics g){
	g.setColor(Color.red);
	g.fillOval(cx, cy, width, height);
	}
	}