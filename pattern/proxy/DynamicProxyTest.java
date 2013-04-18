package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject sub = new RealSubject();
		InvocationHandler handler = new DynamicHandler(sub);
		Subject proxy = (Subject) Proxy.newProxyInstance(sub.getClass().getClassLoader(), sub.getClass().getInterfaces(), handler);
		proxy.request();
		proxy.request1();
//		System.out.println(Proxy.getInvocationHandler(proxy));
//		System.out.println(Proxy.isProxyClass(sub.getClass()));
//		System.out.println(Proxy.isProxyClass(handler.getClass()));
//		System.out.println(Proxy.isProxyClass(proxy.getClass()));
//		System.out.println(Proxy.getProxyClass(sub.getClass().getClassLoader(), Date.class.getInterfaces()));
		
		
	}

}
