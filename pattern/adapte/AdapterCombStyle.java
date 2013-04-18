package pattern.adapte;

public class AdapterCombStyle implements Target{

	private Adaptee adaptee;
	public AdapterCombStyle(){
		this.adaptee = new Adaptee();
	}
	@Override
	public void targetInterface() {
		this.adaptee.doSth();
	}

}
