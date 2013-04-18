package pattern.visitor.base;

public interface Element {
	void accept(Visitor visitor);
	void doSth();
}
