package pattern.bridge;

import pattern.bridge.base.Image;

public class JpgImage extends Image{

	@Override
	public void parseFile(String fileName) {
		this.impl.doPaint();
		System.out.println(fileName + "jpg file parse");
	}

}
