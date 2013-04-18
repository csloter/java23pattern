package pattern.command.base;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	//private Command command;
	public void setCommand(Command command){
		//this.command = command;
		this.allCommands.add(command);
	}
	public void action(){
		for(Command c: this.allCommands){
			c.execute();
		}
	}
	// 
	List<Command> allCommands = new ArrayList<Command>();
	public void undoCommand(Command command){
		this.allCommands.remove(command);
	}
}
