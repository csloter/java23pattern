package pattern.template.base;

public abstract class AbstractTemplate {
	protected abstract void m1();
	protected abstract void m2();
	private String hook;
	public void setHook(String hook){
		this.hook = hook;
	}
	public final void templtetMethod(){
		m1();
		if(this.hook == "hook"){
			m2();
		}
	}
}
