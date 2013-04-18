package pattern.chainofresponsibily.filter.base;

import pattern.chainofresponsibily.filter.Request;
import pattern.chainofresponsibily.filter.Response;

public interface Filter {
	void doFilter(Request request,Response response,FilterChain filter);
}
