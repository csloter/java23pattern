package pattern.test.bridge;

import pattern.test.bridge.base.Reporter;
/**
 * 说明：
 * 报表处理，将报表显示与数据采集这两个维度分开；系统有多种报表显示方式
 * 也可以有多种数据采集方式，可以从文本文件中读取，可以从数据库中读取。
 * 假设从文本中读取，需要调用第三方api。
 * 维度1：报表显示；
 * 维度2：数据采集；
 * @author dell990-026
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Reporter report = new ReporterWeb();
		report.setData(new LogDataCollection());
		report.showReport();
		
		report.setData(new DbDataCollection());
		report.showReport();
	}

}
