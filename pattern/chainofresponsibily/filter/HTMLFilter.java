package pattern.chainofresponsibily.filter;

import pattern.chainofresponsibily.filter.base.Filter;
import pattern.chainofresponsibily.filter.base.FilterChain;

public class HTMLFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		String r = request.getRequest().replace("aa", "");
		response.setResponse(r);
		filterChain.doFilter(request, response);
	}
	
}
