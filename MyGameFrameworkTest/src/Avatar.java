import java.awt.Color;
import java.awt.event.*;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.*;

public class Avatar implements IGameObject{
int vx,vy; //坐标
int d; //直径
int s; //速度
public Avatar(int vx,int vy,int d,int s){
this.vx = vx;
this.vy = vy;
this.d = d;
this.s = s;
}
@Override
public void render(Graphics g) {
g.setColor(Color.red);
g.fillOval(vx, vy, 100, 100);
}
@Override
public void keyPressed(KeyEvent ke) {
// TODO Auto-generated method stub
if( ke.getKeyCode() == KeyEvent.VK_LEFT){
vx -= s;
}else if( ke.getKeyCode() == KeyEvent.VK_RIGHT){
vx += s;
}else if( ke.getKeyCode() == KeyEvent.VK_UP){
vy -= s;
}else if( ke.getKeyCode() == KeyEvent.VK_DOWN){
vy += s;
}
}
@Override
public void mouseClicked(MouseEvent me) {
// TODO Auto-generated method stub
}
@Override
public void perform() {
// TODO Auto-generated method stub
}
}