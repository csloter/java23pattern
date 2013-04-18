package pattern.visitor.base;

import pattern.visitor.ConcreteElement;

public interface Visitor {
	void visit(ConcreteElement e);
}
