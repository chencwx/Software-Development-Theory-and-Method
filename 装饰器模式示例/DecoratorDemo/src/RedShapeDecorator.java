public class RedShapeDecorator extends ShapeDecorator{
public RedShapeDecorator(IShape decoratedShape) {
super(decoratedShape);
}
public void draw() {
decoratedShape.draw(); //�Ȼ��ư�����IShape
setRedBorder(decoratedShape); //Ȼ���ٽ����Լ��Ļ���
}
private void setRedBorder(IShape decoratedShape){//���ƺ�ɫ�߿�
System.out.println("���к�߿�");
}
}