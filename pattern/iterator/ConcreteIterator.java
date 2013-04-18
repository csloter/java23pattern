package pattern.iterator;

import java.util.ArrayList;
import java.util.List;

import pattern.iterator.base.Iterator;

public class ConcreteIterator<E> implements Iterator<E>{

	private List<E> list = new ArrayList<E>();
	private int cursor = 0;
	
	public ConcreteIterator(List<E> list){
		this.list = list;
	}
	
	@Override
	public E next() {
		E e = null;
		if(this.hasNext()){
			e = this.list.get(cursor++);
		}
		return e;
	}

	@Override
	public boolean hasNext() {
		return cursor != list.size(); 
	}

	@Override
	public E pre() {
		E e = null;
		if(this.hasPre()){
			e = this.list.get(--cursor);
		}
		return e;
	}

	@Override
	public boolean hasPre() {
		return cursor > 0; 
	}

}
