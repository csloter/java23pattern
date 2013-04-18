package pattern.iterator;

import pattern.iterator.base.Iterator;
import pattern.iterator.base.MyCollection;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyCollection<String> list = new ConcreteCollection<String>();
		list.add("һ��");
		list.add("����");
		list.add("����");
		list.add("�ĸ�");
		Iterator<String> it = list.iterator();
		for(;it.hasNext();){
			System.out.println(it.next());
		}
		for(;it.hasPre();){
			System.out.println(it.pre());
		}
	}

}
