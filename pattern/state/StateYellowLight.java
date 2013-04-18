package pattern.state;

import pattern.state.base.State;

public class StateYellowLight implements State{

	@Override
	public void execute(Context context) {
		System.out.println("yellow light on");
		context.setState(new StateGreenLight());
	}

}
