package pattern.state;

import pattern.state.base.State;

public class StateGreenLight implements State{

	@Override
	public void execute(Context context) {
		System.out.println("green light on");
		context.setState(new StateRedLight());
	}

}
