package pattern.command;

import pattern.command.base.Command;
import pattern.command.base.Receiver;

public class CommandImpl implements Command{

	private Receiver receiver;
	public CommandImpl(Receiver receiver){
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		this.receiver.doReal();
	}

}
