package pattern.prototype;

public class Monkey extends AbstractMonkey {

	@Override
	public void doSth() {
		System.out.println(this.getIntVal().hashCode() + ": do");
		System.out.println(this.getStrVal().hashCode() + ": do");
		System.out.println(this.getArrVal() + ": do");
	}

}
