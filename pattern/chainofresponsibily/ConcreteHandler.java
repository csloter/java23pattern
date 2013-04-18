package pattern.chainofresponsibily;

import pattern.chainofresponsibily.base.Handler;

public class ConcreteHandler extends Handler{

	@Override
	public void handleRequest() {
		if(this.getSuccessor() != null){
			System.out.println("≤ª¥¶¿Ì");
			this.getSuccessor().handleRequest();
		}else{
			System.out.println("do handle.");
		}
	}

}
