import java.util.*;
public class InterpreterClient {
	public static void main(String[] args) 
	{
		Interpreter bus=new Interpreter();  //创建一个解释器//使用解释器的功能
		bus.freeRide("北京的老人");
		bus.freeRide("天津的年轻人");
		bus.freeRide("广州的孕妇");
		bus.freeRide("上海的儿童");
		bus.freeRide("山东的儿童");
		bus.freeRide("成都的老人");    }
}
