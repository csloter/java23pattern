package pattern.decorator;

import pattern.decorator.base.Component;
import pattern.decorator.base.DecoratorComponent;

public class DecoratorComponentImpl1 extends DecoratorComponent {

	public DecoratorComponentImpl1(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		System.out.println("decorator impl1 before");
		this.component.operation();
	}

}
