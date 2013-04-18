package pattern.visitor;

import pattern.visitor.base.Element;
import pattern.visitor.base.Visitor;

public class ConcreteElement implements Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void doSth() {
		System.out.println("e do sth.");
	}
	
	public void doSth1(){
		System.out.println("e do sth1.");
	}
}
