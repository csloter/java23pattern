package pattern.composite;

import java.util.List;

import pattern.composite.base.Component;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Component root = new Composite("root"); 
		Component branch1 = new Composite("branch1");
		Component branch2 = new Composite("branch2");
		Component branch3 = new Composite("branch3");
		Component leaf1 = new Leaf("Leaf1");
		Component leaf2 = new Leaf("Leaf2");
		Component leaf3 = new Leaf("Leaf3");
		root.add(branch1);
		root.add(branch2);
		branch2.add(branch3);
		branch3.add(leaf1);
		branch3.add(leaf3);
		//root.add(leaf3);
		branch1.add(leaf2);
		//branch3.del(leaf3);
		//branch2.add(leaf1);
		displayTree(root,0);
		System.out.println("================");
		branch2.del(branch3);
		displayTree(root,0);
	}
	
	public static void displayTree(Component c,int deep){
		for(int i = 0; i < deep; i++){
			System.out.print("--");
		}
		c.display();
		List<Component> children = c.getChild();
		for (Component com : children){
			if (com instanceof Leaf){
				for(int i = 0; i <= deep; i++){
					System.out.print("--");
				}
				com.display();
			} else{
				displayTree(com, deep+1);
			}
			
		}
	}

}
