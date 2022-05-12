public class MyGameFrameworkTest extends Game{
public MyGameFrameworkTest(GameScene scene){
super(scene);
}
public static void main(String[] args) {
MyGameFrameworkTest game = new MyGameFrameworkTest(new MyGameScene());
game.setSize(1920, 1400);
game.setVisible(true);
}
}