package pattern.decorator.base;


public class DecoratorComponent implements Component{
	
	protected Component component;
	protected DecoratorComponent(Component component){
		this.component = component;
	}

	@Override
	public void operation(){
		this.component.operation();
	}
}
