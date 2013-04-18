package pattern.observer.base;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<ObserverPull> observers = new ArrayList<ObserverPull>();
	
	private String state;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
		//this.notigyObservers();
	}
	public void register(ObserverPull observer){
		this.observers.add(observer);
	}
	public void unRegister(Observer observer){
		this.observers.remove(observer);
	}
	
	public void notigyObservers(){
		for(ObserverPull o:observers){
			o.update(this);
		}
	}
}
