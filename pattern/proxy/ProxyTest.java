package pattern.proxy;

public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject sub = new ProxySubject();
		sub.request();
	}

}
