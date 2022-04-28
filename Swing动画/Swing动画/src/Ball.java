import java.awt.Graphics;
import java.awt.Color;
class Ball{
private int cx,cy; //坐标
private int vx,vy; //速度
private int d; //直径
public Ball(int cx,int cy,int d,int vx,int vy){
this.cx = cx;
this.cy = cy;
this.d = d;
this.vx = vx;
this.vy = vy;
}
public void update(){
cx += vx;
cy += vy;
}
public void render(Graphics g){
g.setColor(Color.red);
g.fillOval(cx, cy, d, d);
}
}