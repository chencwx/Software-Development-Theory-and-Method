import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JPanel;
public class Game extends JFrame implements KeyListener,MouseListener{
protected GameScene curScene; //游戏当前的场景
//带参数的构造函数，在这里设置并启动初始游戏场景的仿真循环
public Game(GameScene scene){
setCurScene(scene);
this.setSize(1024,768); //设置窗口缺省大小
this.addKeyListener(this); //添加键盘监听者
this.addMouseListener(this); //添加鼠标监听者
this.addWindowListener(new WindowAdapter(){ //添加窗口关闭按钮
public void windowClosing(WindowEvent we){
System.exit(0);
}
});}
public void setCurScene(GameScene scene){ //运行中设置游戏的当前场景
curScene = scene;
this.setContentPane(scene);
if(curScene != null){
curScene.startRun(); //启动当前游戏场景的仿真循环
}else{
System.out.println("initGameScene方法初始化游戏场景失败！");
}
}
public static void main(String[] args) { //主函数，留给应用程序改写
Game game = new Game(new GameScene());
game.setVisible(true);
}
//KeyListener的接口方法，键盘按下时被调用
@Override
public void keyPressed(KeyEvent ke) {
curScene.keyPressed(ke);
}
//MouseListener的接口方法，鼠标点击时被调用
@Override
public void mouseClicked(MouseEvent me) {
curScene.mouseClicked(me);
}
//以下用户输入本框架暂时不予处理
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