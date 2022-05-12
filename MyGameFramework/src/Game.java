import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JPanel;
public class Game extends JFrame implements KeyListener,MouseListener{
protected GameScene curScene; //��Ϸ��ǰ�ĳ���
//�������Ĺ��캯�������������ò�������ʼ��Ϸ�����ķ���ѭ��
public Game(GameScene scene){
setCurScene(scene);
this.setSize(1024,768); //���ô���ȱʡ��С
this.addKeyListener(this); //��Ӽ��̼�����
this.addMouseListener(this); //�����������
this.addWindowListener(new WindowAdapter(){ //��Ӵ��ڹرհ�ť
public void windowClosing(WindowEvent we){
System.exit(0);
}
});}
public void setCurScene(GameScene scene){ //������������Ϸ�ĵ�ǰ����
curScene = scene;
this.setContentPane(scene);
if(curScene != null){
curScene.startRun(); //������ǰ��Ϸ�����ķ���ѭ��
}else{
System.out.println("initGameScene������ʼ����Ϸ����ʧ�ܣ�");
}
}
public static void main(String[] args) { //������������Ӧ�ó����д
Game game = new Game(new GameScene());
game.setVisible(true);
}
//KeyListener�Ľӿڷ��������̰���ʱ������
@Override
public void keyPressed(KeyEvent ke) {
curScene.keyPressed(ke);
}
//MouseListener�Ľӿڷ����������ʱ������
@Override
public void mouseClicked(MouseEvent me) {
curScene.mouseClicked(me);
}
//�����û����뱾�����ʱ���账��
@Override
public void keyReleased(KeyEvent ke) {}
@Override
public void keyTyped(KeyEvent ke) { }
@Override
public void mouseEntered(MouseEvent me) {}
@Override
public void mouseExited(MouseEvent me) {}
@Override
public void mousePressed(MouseEvent me) {}
@Override
public void mouseReleased(MouseEvent arg0) {}
}