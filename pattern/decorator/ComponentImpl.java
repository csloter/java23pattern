package pattern.decorator;

import pattern.decorator.base.Component;

/**
 * ʵ����
 * @author dell990-026
 *
 */
public class ComponentImpl implements Component{

	@Override
	public void operation() {
		System.out.println("base impl operation");
	}

}
