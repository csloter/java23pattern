package pattern.test.state;

import pattern.test.state.base.RoleState;

public class DeadState implements RoleState{


	@Override
	public void collide(Role role) {
		System.out.println("ËÀÍö×´Ì¬");
	}

	@Override
	public void eat(Role role) {
		
	}

}
