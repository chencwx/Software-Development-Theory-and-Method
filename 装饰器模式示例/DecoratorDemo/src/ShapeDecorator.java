public class ShapeDecorator implements IShape{
protected IShape decoratedShape; //°üº¬ÁíÒ»¸öIShape
public ShapeDecorator(IShape decoratedShape){
this.decoratedShape = decoratedShape;
}
public void draw() {
decoratedShape.draw();
}
}