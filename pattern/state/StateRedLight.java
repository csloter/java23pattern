package pattern.state;

import pattern.state.base.State;

public class StateRedLight implements State{

	@Override
	public void execute(Context context) {
		System.out.println("red light on");
		context.setState(new StateYellowLight());
	}

}
