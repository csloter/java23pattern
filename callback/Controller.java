package callback;

public class Controller {
	private CallBack cb;
	public Controller(){
	}
	public void d(){
		this.cb.call();
	}
	public void addListener(CallBack cb){
		this.cb = cb;
	}
	public static void main(String[] args){
		Controller c = new Controller();
		c.addListener(new CallBack(){
			@Override
			public void call() {
				System.out.println("ddd");
			}
		});
		c.d();
	}
}
