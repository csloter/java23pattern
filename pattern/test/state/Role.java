package pattern.test.state;

import pattern.test.state.base.RoleState;


public class Role {
	private RoleState roleState;
	private int coins;
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins += coins;
	}
	public void setRoleState(RoleState roleState) {
		this.roleState = roleState;
	}
	public RoleState getRoleState() {
		return this.roleState;
	}
	public Role(){
		this.roleState = new NormalState();
	}
	public Role(RoleState roleState){
		this.roleState = roleState;
	}
	
	public void collide(){
		this.roleState.collide(this);
	}
	public void eat(){
		this.roleState.eat(this);
	}
}
