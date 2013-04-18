package pattern.adapte;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Target t = new AdapterExtendStyle();
		t.targetInterface();
		Target t1 = new AdapterCombStyle();
		t1.targetInterface();
	}

}
