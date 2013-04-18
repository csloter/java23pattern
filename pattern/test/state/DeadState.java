package pattern.test.state;

import pattern.test.state.base.RoleState;

public class DeadState implements RoleState{


	@Override
	public void collide(Role role) {
		System.out.println("����״̬");
	}

	@Override
	public void eat(Role role) {
		
	}

}
