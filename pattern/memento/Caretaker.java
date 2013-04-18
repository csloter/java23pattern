package pattern.memento;

public class Caretaker {
	private Memento memento;
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
	public Memento retrieveMemento(){
		return this.memento;
	}
}
