package pattern.strategy;

import pattern.strategy.base.Strategy;

public class Client {
	public static void main(String[] args){
		Strategy s = new ConcratStrategyA();
		Context c = new Context(s);
		c.request();
		s = new ConcratStrategyB();
		c = new Context(s);
		c.request();
	}
}
