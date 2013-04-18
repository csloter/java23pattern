package pattern.composite;

import java.util.List;

import pattern.composite.base.Component;

public class Leaf implements Component{

	private String name;
	public Leaf(){}
	public Leaf(String name){
		this.name = name;
	}
	@Override
	public void display() {
		System.out.println("Leaf: " + this.name);
	}

	@Override
	public void add(Component component) {
		
	}

	@Override
	public void del(Component component) {
		
	}

	@Override
	public List<Component> getChild() {
		 return null;
	}
	@Override
	public void setParent(Component component) {
	}

}
