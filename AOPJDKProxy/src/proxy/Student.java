package proxy;

public class Student implements Person{
private String name;
public Student() { }
public Student(String name) {
this.name = name;
}
@Override
public void wakeup() {
System.out.println("ѧ��"+name+"�糿������");
}
@Override
public void sleep() {
System.out.println("ѧ��"+name+"������˯����");
}
}