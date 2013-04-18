package pattern.visitor;

import pattern.visitor.base.Visitor;

public class ConcreteVisitor1 implements Visitor{

	@Override
	public void visit(ConcreteElement e) {
		e.doSth1();
	}

}
