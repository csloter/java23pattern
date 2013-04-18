package pattern.bridge;

import pattern.bridge.base.ImageImpl;

public class WinImageImpl implements ImageImpl{

	@Override
	public void doPaint() {
		System.out.println("window do paint");
	}

}
