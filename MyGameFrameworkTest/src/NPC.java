import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
public class NPC implements IGameObject{
int vx,vy; //×ø±ê
int w,h; //¿íºÍ¸ß
public NPC(int vx,int vy,int w,int h){
this.vx = vx;
this.vy = vy;
this.w = w;
this.h = h;
}
@Override
public void render(Graphics g) {
g.setColor(Color.blue);
g.fillRect(vx, vy, w, h);
}
@Override
public void perform() {
// TODO Auto-generated method stub
}
@Override
public void keyPressed(KeyEvent arg0) {
// TODO Auto-generated method stub
}
@Override
public void mouseClicked(MouseEvent arg0) {
// TODO Auto-generated method stub
}
}