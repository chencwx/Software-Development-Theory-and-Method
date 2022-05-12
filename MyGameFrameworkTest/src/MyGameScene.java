
public class MyGameScene extends GameScene{
public MyGameScene(){
super();
this.addGameObject(new Avatar(1000,200,100,20));
this.addGameObject(new NPC(1000,500,200,100));
}
}