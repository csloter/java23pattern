package pattern.abstarctfac;

import pattern.abstarctfac.base.AbstarctFactory;
import pattern.abstarctfac.base.Cpu;
import pattern.abstarctfac.base.Ram;

public class MacFactory implements AbstarctFactory {

	@Override
	public Ram createRam() {
		return new MacRam();
	}

	@Override
	public Cpu createCpu() {
		return new MacCpu();
	}

}
