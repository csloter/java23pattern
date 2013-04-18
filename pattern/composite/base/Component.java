package pattern.composite.base;

import java.util.List;

public interface Component {
	void display();
	void add(Component component);
	void del(Component component);
	void setParent(Component component);
	List<Component> getChild();
}
