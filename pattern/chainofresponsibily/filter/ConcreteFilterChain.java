package pattern.chainofresponsibily.filter;

import java.util.ArrayList;
import java.util.List;

import pattern.chainofresponsibily.filter.base.Filter;
import pattern.chainofresponsibily.filter.base.FilterChain;

public class ConcreteFilterChain implements FilterChain{

	private List<Filter> filters = new ArrayList<Filter>();
	private int index = 0;
	public void addFilter(Filter f){
		this.filters.add(f);
	}
	@Override
	public void doFilter(Request request, Response response) {
		if(index == filters.size()){
			return;
		}
		Filter f = filters.get(index++);
		f.doFilter(request, response, this);
	}

}
