package pattern.test.bridge;

import pattern.test.bridge.base.Reporter;

public class ReporterWeb extends Reporter{

	@Override
	public void showReport() {
		String data = this.data.getData();
		System.out.println("Web show " + data);
	}

}
