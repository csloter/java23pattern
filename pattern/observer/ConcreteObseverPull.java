package pattern.observer;

import pattern.observer.base.ObserverPull;
import pattern.observer.base.Subject;

public class ConcreteObseverPull implements ObserverPull{

	@Override
	public void update(Subject s) {
		System.out.println(s.getState());
	}

}
