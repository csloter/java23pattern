package pattern.iterator.base;

public interface MyCollection<E> {
	void add(E e);
	void remove(E e);
	Iterator<E> iterator();
}
