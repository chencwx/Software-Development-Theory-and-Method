package proxy;
import java.lang.reflect.*;
public class AOPJDKProxy {
	public static void main(String[] args) {
		JdkProxy proxy = new JdkProxy(new Student("����"));
		//��̬����Person�ӿڶ���student,
		Person student = (Person)
		Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]
		{Person.class}, proxy);
		student.wakeup();
		student.sleep();}
}
