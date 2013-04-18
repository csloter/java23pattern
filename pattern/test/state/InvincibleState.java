package pattern.test.state;

import pattern.test.state.base.RoleState;

public class InvincibleState implements RoleState{

	@Override
	public void collide(Role role) {
		System.out.println("�޵�״̬��ײ��������״̬");
		role.setRoleState(new NormalState());
		
	}

	@Override
	public void eat(Role role) {
		
	}
	
}
