package pattern.template;

import pattern.template.base.AbstractTemplate;

public class AbstractTemplateImpl extends AbstractTemplate {

	@Override
	protected void m1() {
		System.out.println("m1");
	}

	@Override
	protected void m2() {
		System.out.println("m2");
	}

}
