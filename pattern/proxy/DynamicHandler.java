package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicHandler implements InvocationHandler {

	private Object proxyed;
	
	public DynamicHandler(Object proxyed){
		this.proxyed = proxyed;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		this.pre();
		if (method.getName().equals("request")){
			return null;
		}
		method.invoke(this.proxyed, args);
		this.after();
		return null;
	}
	private void pre(){
		System.out.println("pre proxy");
	}
	
	private void after(){
		System.out.println("after proxy");
	}

}
