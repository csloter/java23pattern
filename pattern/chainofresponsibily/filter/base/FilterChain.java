package pattern.chainofresponsibily.filter.base;

import pattern.chainofresponsibily.filter.Request;
import pattern.chainofresponsibily.filter.Response;

public interface FilterChain {
	void doFilter(Request request, Response response);
}
