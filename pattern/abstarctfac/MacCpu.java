package pattern.abstarctfac;

import pattern.abstarctfac.base.Cpu;
import pattern.abstarctfac.base.Ram;

public class MacCpu implements Cpu {

	@Override
	public void add(Ram r) {
		System.out.println("mac cpu add");
	}

}
