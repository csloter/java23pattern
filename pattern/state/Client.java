package pattern.state;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context c = new Context();
		c.request();
		c.request();
		c.request();
		c.request();
		c.request();
		c.request();
		c.request();
		c.request();
	}

}
