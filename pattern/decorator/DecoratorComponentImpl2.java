package pattern.decorator;

import pattern.decorator.base.Component;
import pattern.decorator.base.DecoratorComponent;

public class DecoratorComponentImpl2 extends DecoratorComponent {

	public DecoratorComponentImpl2(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		this.component.operation();
		System.out.println("decorator impl2 before");
	}

}
