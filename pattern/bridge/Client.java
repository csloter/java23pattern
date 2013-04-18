package pattern.bridge;

import pattern.bridge.base.Image;
import pattern.bridge.base.ImageImpl;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Image image = new JpgImage();
		ImageImpl imageImpl = new MacImageImpl();
		image.setImpl(imageImpl);
		image.parseFile("fileName");
		
		image.setImpl(new WinImageImpl());
		image.parseFile("f");
	}

}
