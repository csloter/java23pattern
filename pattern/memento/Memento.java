package pattern.memento;

/**
 * ±¸ÍüÂ¼ Àà
 * @author dell990-026
 *
 */
public class Memento {
	private String state;
	public Memento(){}
	public Memento(String state){
		this.state = state;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
