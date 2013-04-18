package pattern.test.bridge.base;

public abstract class Reporter {
	protected DataCollection data;
	public void setData(DataCollection data){
		this.data = data;
	}
	public abstract void showReport();
}
