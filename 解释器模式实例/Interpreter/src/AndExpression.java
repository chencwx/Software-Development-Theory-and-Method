class AndExpression implements AbstractExpression 
{ private AbstractExpression city=null;
  private AbstractExpression person=null;
  public AndExpression(AbstractExpression city, AbstractExpression person)
   {//���조X���е�Y�ˡ����ʽ
	  this.city=city;this.person=person;   
	  }
    public boolean interpret(String info)
     {String s[] =info.split("��");   //�á��ġ��ַָ�ҳ�info�����еĳ��к���Ⱥ
     return city.interpret(s[0]) && person.interpret(s[1]); //����Ƿ���������    }}
   }
}