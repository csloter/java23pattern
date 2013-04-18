package pattern.composite;

import java.util.ArrayList;
import java.util.List;

import pattern.composite.base.Component;

public class Composite implements Component{

	private List<Component> childList = new ArrayList<Component>();
	private String name;
	
	@SuppressWarnings("unused")
	private Component parent;
	
	public void setName(String name){
		this.name = name;
	}
	public Composite(){}
	public Composite(String name){
		this.name = name;
	}
	@Override
	public void display() {
		System.out.println("Conposite: " + this.name);
	}

	@Override
	public void add(Component child) {
		childList.add(child);
		//
		child.setParent(this);
	}

	@Override
	/**
	 * 将component的子节点，加到当前接点上
	 */
	public void del(Component component) {
		if (component.getChild().size() > 1){
			for(Component c: component.getChild()){
				c.setParent(this);
				this.childList.add(c);
			}
		}
		childList.remove(component);
	}
	@Override
	public List<Component> getChild() {
		return childList;
	}
	@Override
	public void setParent(Component parent) {
		this.parent = parent;
	}


}
