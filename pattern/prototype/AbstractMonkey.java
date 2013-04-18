package pattern.prototype;


public abstract class AbstractMonkey implements Cloneable{
	private String strVal = "String";
	private Integer intVal = 100;
//	private ArrayList<String> liVal = new ArrayList<String>();
	private String[] arrVal = {"a","b"};
	
	public String getStrVal() {
		return strVal;
	}
	public Integer getIntVal() {
		return intVal;
	}
//	public List<String> getLiVal() {
//		return liVal;
//	}
	public String[] getArrVal(){
		return arrVal;
	}
	@Override
	public Object clone(){
		AbstractMonkey o = null;
		try {
			o = (AbstractMonkey) super.clone();
			//o.liVal = (ArrayList<String>) this.liVal.clone();
			o.arrVal = this.arrVal.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
	public abstract void doSth();
}
