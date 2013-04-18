package pattern.test.state;

import pattern.test.state.base.RoleState;

public class NormalState implements RoleState {

	@Override
	public void collide(Role role) {
		System.out.println("��ͨ״̬��ײ������");
		role.setRoleState(new DeadState());
	}

	@Override
	public void eat(Role role) {
		role.setCoins(1);
		if(role.getCoins() == 2){
			System.out.println("��ͨ״̬�Թ�2��Һ󣬱�Ϊ����״̬");
			role.setRoleState(new FlyState());
		}
		if(role.getCoins() == 3){
			System.out.println("��ͨ״̬�Թ�3��Һ󣬱�Ϊ�޵�״̬");
			role.setRoleState(new InvincibleState());
		}
		
	}

}
