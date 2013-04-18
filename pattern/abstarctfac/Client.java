package pattern.abstarctfac;

import pattern.abstarctfac.base.AbstarctFactory;
import pattern.abstarctfac.base.Cpu;
import pattern.abstarctfac.base.Ram;

public class Client {
	private Ram ram;
	private Cpu cpu;
	public Client(AbstarctFactory factory){
		ram = factory.createRam();
		cpu = factory.createCpu();
	}
	
	public void com(){
		cpu.add(ram);
	}
	public static void main(String[] args){
		AbstarctFactory factory = new MacFactory();
		Client c = new Client(factory);
		c.com();
	}
}
