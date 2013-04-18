package pattern.iterator;

import pattern.iterator.base.Iterator;
import pattern.iterator.base.MyCollection;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyCollection<String> list = new ConcreteCollection<String>();
		list.add("一个");
		list.add("两个");
		list.add("三个");
		list.add("四个");
		Iterator<String> it = list.iterator();
		for(;it.hasNext();){
			System.out.println(it.next());
		}
		for(;it.hasPre();){
			System.out.println(it.pre());
		}
	}

}
