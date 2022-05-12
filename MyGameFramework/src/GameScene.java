import java.awt.Color;
import java.awt.event.*;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.*;
public class GameScene extends JPanel implements Runnable{
//���������е���Ϸ����
protected ArrayList<IGameObject> allGameObjects = new ArrayList<IGameObject>
();
Thread gameLoop; //��Ϸ�߳�
public GameScene(){
gameLoop = new Thread(this); //��ʼ���̶߳���
}
//�����ͻ��ķ�������������Ϸ����ѭ��
public void startRun(){
gameLoop.start(); //�����̣߳���run������ʼִ��
}
//�߳̽ӿڷ�����������������д
public final void run(){
while(gameLoop != null){
for(IGameObject go : allGameObjects){ //����������Ϸ����
go.perform(); //����Ϸ�������
}
repaint(); //����ϵͳ�ػ���paint�����ᱻ����
try {
Thread.sleep(40); //��ͣ�̣߳��γ���Ϸ����
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
//JPanel��Ĺ��Ӻ�������������Ⱦ��Ϸ����
public void paint(Graphics g){
//������Ļ����
g.setColor(Color.white);
g.fillRect(0, 0, this.getWidth(),this.getHeight());
for(IGameObject go : allGameObjects){ //����������Ϸ����
go.render(g); //��Ⱦ��Ϸ����
}
}
public void addGameObject(IGameObject go){ //����Ϸ�������һ����Ϸ����
allGameObjects.add(go);
}
public void removeGameObject(IGameObject go){
allGameObjects.remove(go);
}
public void keyPressed(KeyEvent ke) {
for(IGameObject go : allGameObjects){ //����������Ϸ����
go.keyPressed(ke); //��Ϸ��������̰����¼�
}
}
public void mouseClicked(MouseEvent me) {
for(IGameObject go : allGameObjects){ //����������Ϸ����
go.mouseClicked(me); //��Ϸ������������¼�
}
}
}
