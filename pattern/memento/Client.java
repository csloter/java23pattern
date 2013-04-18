package pattern.memento;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("111");
		Caretaker caretaker = new Caretaker(); 
		caretaker.saveMemento(o.createMemento());
		System.out.println(o.getState());
		o.setState("222");
		System.out.println(o.getState());
		o.restoreMemento(caretaker.retrieveMemento());
		System.out.println(o.getState());
		
	}

}
