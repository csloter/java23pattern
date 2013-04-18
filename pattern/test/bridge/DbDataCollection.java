package pattern.test.bridge;

import pattern.test.bridge.base.DataCollection;

public class DbDataCollection implements DataCollection{

	@Override
	public String getData() {
		return "data from db";
	}

}
