class Interpreter 
{ private String [] citys= {"����","�Ϻ�","����","����"};  //��������з��������ĳ���
  private String [] persons= {"����", "��Ů", "��ͯ"};    //��������з�����������Ⱥ
  private AbstractExpression cityPerson;                        //�������ʽ
  public Interpreter() 
  { AbstractExpression city = new TerminalExpression(citys);         //����������е��ս�����ʽ
    AbstractExpression person=new TerminalExpression(persons);     //����������Ⱥ���ս�����ʽ
    cityPerson=new AndExpression(city, person);            //����������������ķ��ս�����ʽ
  }
//�������Ĺ��ܺ���
  public void freeRide(String info) 
  {  boolean ok= cityPerson.interpret(info);   //����������Ƿ�����������
     if (ok) 
     {System.out.println("����"+info+"�������γ˳���ѣ�");        
     }
     else
     {System.out.println(info+"�������������Ա�����γ˳��۷�2Ԫ��");       
       }    
     }
  }
