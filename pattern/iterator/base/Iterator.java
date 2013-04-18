package pattern.iterator.base;

public interface Iterator<E> {
	E next();
	E pre();
	boolean hasNext();
	boolean hasPre();
}
