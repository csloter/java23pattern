package test;

public class SupperMan extends Manager {

	public SupperMan(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3278450953605059504L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SupperMan s = new SupperMan(" supper");
		System.out.println(s.getName());
	}

}
