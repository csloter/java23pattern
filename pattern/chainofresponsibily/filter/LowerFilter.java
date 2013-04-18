package pattern.chainofresponsibily.filter;

import pattern.chainofresponsibily.filter.base.Filter;
import pattern.chainofresponsibily.filter.base.FilterChain;

public class LowerFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		String r = request.getRequest().toLowerCase();
		response.setResponse(r);
		filterChain.doFilter(request, response);
	}
	
}
