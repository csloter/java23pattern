package pattern.proxy;

public class ProxySubject implements Subject {

	private Subject sub;
	public ProxySubject(){
		
	}
	public void setSubject(Subject sub){
		this.sub = sub;
	}
	
	private void pre(){
		System.out.println("pre proxy");
	}
	
	private void after(){
		System.out.println("after proxy");
	}
	@Override
	public void request() {
		if (null == this.sub){
			this.sub = new RealSubject();
		}
		this.pre();
		this.sub.request();
		this.after();
	}
	@Override
	public void request1() {
		
	}

}
