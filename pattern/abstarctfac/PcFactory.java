package pattern.abstarctfac;

import pattern.abstarctfac.base.AbstarctFactory;
import pattern.abstarctfac.base.Cpu;
import pattern.abstarctfac.base.Ram;

public class PcFactory implements AbstarctFactory {

	@Override
	public Ram createRam() {
		return new PcRam();
	}

	@Override
	public Cpu createCpu() {
		return new PcCpu();
	}

}
