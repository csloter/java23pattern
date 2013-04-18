package pattern.visitor;

import pattern.visitor.base.Element;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Element e = new ConcreteElement();
		e.accept(new ConcreteVisitor());
		e.accept(new ConcreteVisitor1());
	}

}
