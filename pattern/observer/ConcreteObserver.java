package pattern.observer;

import pattern.observer.base.Observer;

public class ConcreteObserver implements Observer{

	@Override
	public void update() {
		System.out.println("update ");
	}

}
