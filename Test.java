

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(RandomStringUtils.random(2,new char[]{'a','b'}));
		//System.out.println(RandomStringUtils.randomAlphabetic(20));
		//Father f = new Father();
		//System.out.println(f.getArr());
		Father s = new Son();
		Father s1 = new Son();
		System.out.println(s.getArr());
		System.out.println(s1.getArr());
		
		s.setArr(new String[]{"son"});
		System.out.println(s.getArr());
		System.out.println(s1.getArr());
//		Innter inner =  new Test().new Innter();
		
		A a = new B();
		a.foo();
	}
	class Innter{
		
	}
}
class Father{
	private String[] arr = {"father"};
	public String[] getArr(){
		System.out.println(this.arr[0] + ":f");
		return this.arr;
	}
	public void setArr(String[] arr){
		this.arr = arr;
	}
	public final void te(){
		
	}
}
class Son extends Father{
	@Override
	public void setArr(String[] arr){
		super.setArr(arr);
	}
}
abstract class A{
	public A(){
		System.out.println(this);
	}
	public abstract void  m();
	public void foo(){
		System.out.println(A.this);
	}
}

class B extends A{

	@Override
	public void m() {
		
	}
	
}