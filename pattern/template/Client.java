package pattern.template;

import pattern.template.base.AbstractTemplate;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractTemplate a = new AbstractTemplateImpl();
		a.templtetMethod();
		a.setHook("hook");
		a.templtetMethod();
	}

}
