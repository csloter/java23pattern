package pattern.strategy;

import pattern.strategy.base.Strategy;

public class Context {
	private Strategy stragegy;
	public Context(Strategy stragegy){
		this.stragegy = stragegy;
	}
	public void request(){
		this.stragegy.algorithm();
	}
		
}
