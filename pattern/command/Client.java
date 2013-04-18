package pattern.command;

import pattern.command.base.Command;
import pattern.command.base.Invoker;
import pattern.command.base.Receiver;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Receiver r = new Receiver();
		Command c = new CommandImpl(r);
		Command c1 = new CommandImpl(r);
		Invoker invoker = new Invoker();
		invoker.setCommand(c);
		invoker.setCommand(c1);
		invoker.action();
		invoker.undoCommand(c);
		invoker.action();
	}

}
