package test;

public class Manager extends Employee{

	public Manager(String name) {
		super(name);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1096164797357968394L;
	public static void main(String[] args){
		Manager m  = new Manager( " mm");
		System.out.println(m.getName());
		
	}
}
