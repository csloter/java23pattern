package pattern.test.state.base;

import pattern.test.state.Role;

public interface RoleState {
	void collide(Role role);
	void eat(Role role);
}
