package pattern.test.bridge;

import pattern.test.bridge.base.DataCollection;
import pattern.test.bridge.base.ReadDataLog;

public class LogDataCollection implements DataCollection {
	
	private ReadDataLog readDataLog;
	public LogDataCollection(){
		readDataLog = new ReadDataLog();
	}
	@Override
	public String getData() {
		String logData = readDataLog.getDataFromLog();
		System.out.println(logData);
		return "data from log";
	}

}
