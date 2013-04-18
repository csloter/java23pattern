package pattern.prototype;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractMonkey m = new Monkey();
		m.doSth();
		AbstractMonkey m1 = (AbstractMonkey) m.clone();
		m1.doSth();
	}

}
