//html��ʽ�ľ��屨����
public class HTMLReporter extends Reporter{
public HTMLReporter(){
setHeader("<HTML>\n<HEAD></HEAD>\n<BODY>\n");
setTrailer("</BODY>\n</HTML>");
}
public void addLine(String line){
report += line + "<BR>\n";
}
}