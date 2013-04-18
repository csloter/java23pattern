package pattern.test.state;

import pattern.test.state.base.RoleState;

public class NormalState implements RoleState {

	@Override
	public void collide(Role role) {
		System.out.println("普通状态碰撞后死亡");
		role.setRoleState(new DeadState());
	}

	@Override
	public void eat(Role role) {
		role.setCoins(1);
		if(role.getCoins() == 2){
			System.out.println("普通状态吃够2金币后，变为飞行状态");
			role.setRoleState(new FlyState());
		}
		if(role.getCoins() == 3){
			System.out.println("普通状态吃够3金币后，变为无敌状态");
			role.setRoleState(new InvincibleState());
		}
		
	}

}
