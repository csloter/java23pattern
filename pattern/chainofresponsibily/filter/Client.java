package pattern.chainofresponsibily.filter;

import pattern.chainofresponsibily.filter.base.Filter;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "AaAAAaa";
		Request req = new Request();
		req.setRequest(msg);
		Response res = new Response();
		ConcreteFilterChain filterChain = new ConcreteFilterChain();
		Filter f = new HTMLFilter();
		Filter f1 = new LowerFilter();
		filterChain.addFilter(f);
		filterChain.addFilter(f1);
		filterChain.doFilter(req, res);
		System.out.println(req.getRequest());
		System.out.println(res.getResponse());
		
	}

}
