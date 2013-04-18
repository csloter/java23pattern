package pattern.observer;

import pattern.observer.base.ObserverPull;
import pattern.observer.base.Subject;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Observer o = new ConcreteObserver();
		Subject s = new Subject();
		//s.register(o);
		//s.notigyObservers();
		s.setState("abc");
		ObserverPull op = new ConcreteObseverPull();
		s.register(op);
		//s.notigyObservers();
		//op.update(s);
		s.setState("ddd");
		op.update(s);
		
	}
}
