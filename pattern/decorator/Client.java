package pattern.decorator;

import pattern.decorator.base.Component;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Component component = new ComponentImpl();
		Component beDecorated = new DecoratorComponentImpl1(new DecoratorComponentImpl2(new DecoratorComponentImpl1(component)));
		beDecorated.operation();
	}

}
