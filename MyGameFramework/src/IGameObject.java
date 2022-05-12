import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
import javax.swing.JPanel;
public interface IGameObject {
public void perform();
public void render(Graphics g);
public void keyPressed(KeyEvent ke);
public void mouseClicked(MouseEvent me);
}