package pattern.test.state;

import pattern.test.state.base.RoleState;

public class InvincibleState implements RoleState{

	@Override
	public void collide(Role role) {
		System.out.println("无敌状态碰撞后变成正常状态");
		role.setRoleState(new NormalState());
		
	}

	@Override
	public void eat(Role role) {
		
	}
	
}
