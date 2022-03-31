import java.util.*;
//±®∏Ê¿‡
public abstract class Report {
Reporter reporter; 
public Report(Reporter reporter) { this.reporter = reporter; }
public void addReportItem(Object item){
reporter.addLine(item.toString()); 
}
public String getReport(){ return reporter.getReport(); } 
}