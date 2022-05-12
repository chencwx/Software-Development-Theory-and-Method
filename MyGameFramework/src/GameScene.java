import java.awt.Color;
import java.awt.event.*;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.*;
public class GameScene extends JPanel implements Runnable{
//场景中所有的游戏对象
protected ArrayList<IGameObject> allGameObjects = new ArrayList<IGameObject>
();
Thread gameLoop; //游戏线程
public GameScene(){
gameLoop = new Thread(this); //初始化线程对象
}
//留给客户的方法，以启动游戏仿真循环
public void startRun(){
gameLoop.start(); //启动线程，让run方法开始执行
}
//线程接口方法，不允许子类重写
public final void run(){
while(gameLoop != null){
for(IGameObject go : allGameObjects){ //遍历所有游戏对象
go.perform(); //让游戏对象表演
}
repaint(); //请求系统重画，paint方法会被激发
try {
Thread.sleep(40); //暂停线程，形成游戏动画
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
//JPanel类的钩子函数，在这里渲染游戏对象
public void paint(Graphics g){
//清理屏幕残留
g.setColor(Color.white);
g.fillRect(0, 0, this.getWidth(),this.getHeight());
for(IGameObject go : allGameObjects){ //遍历所有游戏对象
go.render(g); //渲染游戏对象
}
}
public void addGameObject(IGameObject go){ //给游戏世界添加一个游戏对象
allGameObjects.add(go);
}
public void removeGameObject(IGameObject go){
allGameObjects.remove(go);
}
public void keyPressed(KeyEvent ke) {
for(IGameObject go : allGameObjects){ //遍历所有游戏对象
go.keyPressed(ke); //游戏对象处理键盘按下事件
}
}
public void mouseClicked(MouseEvent me) {
for(IGameObject go : allGameObjects){ //遍历所有游戏对象
go.mouseClicked(me); //游戏对象处理鼠标点击事件
}
}
}
