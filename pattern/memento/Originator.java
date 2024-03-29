package pattern.memento;

/**
 * ԭʼ��
 * @author dell990-026
 *
 */
public class Originator {
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	public void restoreMemento(Memento memento){
		this.state = memento.getState();
	}
}
