package pattern.adapte;

public class AdapterExtendStyle extends Adaptee implements Target{

	@Override
	public void targetInterface() {
		super.doSth();
	}

}
