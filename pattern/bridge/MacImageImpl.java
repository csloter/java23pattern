package pattern.bridge;

import pattern.bridge.base.ImageImpl;

public class MacImageImpl implements ImageImpl{

	@Override
	public void doPaint() {
		System.out.println("mac do paint");
	}

}
