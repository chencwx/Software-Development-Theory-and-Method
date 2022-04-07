public class ShapeDecorator implements IShape{
protected IShape decoratedShape; //������һ��IShape
public ShapeDecorator(IShape decoratedShape){
this.decoratedShape = decoratedShape;
}
public void draw() {
decoratedShape.draw();
}
}