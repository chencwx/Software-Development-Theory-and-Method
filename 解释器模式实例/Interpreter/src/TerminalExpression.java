import java.util.*;
class TerminalExpression implements AbstractExpression {
	private Set<String> set=new HashSet<String>();  //���������е��ս����������ǳ��л���Ⱥ
	public TerminalExpression(String[] data) 
	{for (int i=0; i<data.length; i++) 
		set.add(data[i]);    }//�����������Ƿ�������Լ�������ս�������У�������򷵻�true�����򷵻�false
	public boolean interpret(String info)
	{
		if (set.contains(info)) 
		{
			return true;        
		}
	 return false;    }
	}
