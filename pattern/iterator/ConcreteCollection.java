package pattern.iterator;

import java.util.ArrayList;
import java.util.List;

import pattern.iterator.base.Iterator;
import pattern.iterator.base.MyCollection;

public class ConcreteCollection<E> implements MyCollection<E> {

	private List<E> list = new ArrayList<E>();
	@Override
	public void add(E e) {
		list.add(e);
	}

	@Override
	public void remove(E e) {
		list.remove(e);
	}

	@Override
	public Iterator<E> iterator() {
		return new ConcreteIterator<E>(list);
	}

}
