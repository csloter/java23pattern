package pattern.proxy;

public class RealSubject implements Subject{
	public RealSubject(){
		
	}

	@Override
	public void request() {
		System.out.println("real subject");
	}

	@Override
	public void request1() {
		System.out.println("real subject 1");
	}
}
