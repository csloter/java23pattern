package pattern.test.state;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Role r = new Role();
		r.eat();
		r.setRoleState(new InvincibleState());
		r.collide();
		r.collide();
		System.out.println(r.getCoins());
	}

}
