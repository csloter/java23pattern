package condurrenc;

public class LiffOff implements Runnable{
	private int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount ++;
	
	public LiffOff(){
	}
	public LiffOff(int countDown){
		this.countDown = countDown;
	}
	public String status(){
		return "#" + id +(countDown > 0 ?countDown:" liftOff");
 	}
	public void run(){
		while(countDown -- > 0){
			System.out.println(status());
		}
	}
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			new Thread(new LiffOff()).start();
		}
	}
}
