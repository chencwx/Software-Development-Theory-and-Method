package proxy;
import java.lang.reflect.*;
public class JdkProxy implements InvocationHandler {
private Object bean;
public JdkProxy(Object bean) {
this.bean = bean;
}
@Override
public Object invoke(Object proxy, Method method, Object[] args) throws
Throwable {
String methodName = method.getName();
if (methodName.equals("wakeup")){
System.out.println("�簲~~~~~~~~~");
}else if(methodName.equals("sleep")){
System.out.println("��~~~~~~~~~~");
}
return method.invoke(bean, args);
}
}