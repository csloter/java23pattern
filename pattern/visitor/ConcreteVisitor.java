package pattern.visitor;

import pattern.visitor.base.Visitor;

public class ConcreteVisitor implements Visitor{

	@Override
	public void visit(ConcreteElement e) {
		e.doSth();
	}

}
