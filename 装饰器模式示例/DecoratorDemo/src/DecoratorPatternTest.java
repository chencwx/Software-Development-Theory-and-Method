public class DecoratorPatternTest {
public static void main(String[] args) {
IShape circle = new Circle();
ShapeDecorator redCircle =
new RedShapeDecorator(new Circle());
ShapeDecorator redRectangle =
new RedShapeDecorator(new Rectangle());
System.out.println("�ޱ߿��Circle��");
circle.draw();
System.out.println("\n����ɫ�߿��Circle��");
redCircle.draw();
System.out.println("\n����ɫ�߿��Rectangle��");
redRectangle.draw();
}
}