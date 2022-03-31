import java.util.ArrayList;
import java.util.*;
//≤÷¥¢±®∏Ê¿‡
public class StockListReport<StockItem> extends Report{
	ArrayList stock = new ArrayList();
	public StockListReport(Reporter reporter){
	super(reporter);
	}
	public void addStockItem(StockItem stockItem){
	stock.add(stockItem); 
	addReportItem(stockItem); 
	}
}