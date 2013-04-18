package collection;

public class DobuleLinkList {

	private Node head;
	private int size;
	
	public int getSize(){
		return this.size;
	}
	
	private Node getNode(int index){
		Node cur = this.head;
		int revIndex = this.size - index;
		if(index <= revIndex){
			for (int i=0; i <= index;i++){
				cur = cur.next;
			}
		}else{
			for (int i=0; i <= revIndex;i++){
				cur = cur.prev;
			}
		}
		return cur;
	}
	
	public DobuleLinkList(){
		head = new Node();
		head.prev = head.next = head;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	public boolean addTail(Object o){
		Node last = head.prev;
		Node lastSecond = last.prev;
		Node newNode = new Node(o,last,head);
		last.next = newNode;
		head.prev = newNode;
		this.size ++;
		return true;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DobuleLinkList d = new DobuleLinkList();
		System.out.println(d);
		System.out.println(d.getSize());
		d.addTail(10);
		System.out.println(d.getSize());
		System.out.println(d.getNode(0).data);

	}

	class Node{
		Node prev;
		Node next;
		Object data;
		public Node(Object data,Node prev,Node next){
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
		public Node(Node prev,Node next){
			this.prev = prev;
			this.next = next;
		}
		public Node(){
			
		}
		
	}
}

