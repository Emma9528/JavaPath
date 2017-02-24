public class myLinkedList<E>{
	private static class myNode<E>{
		private E data;
		private myNode<E> next;
		public myNode(E data, myNode<E> next){
			this.data = data;
			this.next = next;
		}
		public E getElement(){
			return data;
		}
		public myNode<E> getNext(){
			return next;
		}
		public void setNext(myNode<E> n){
			next = n;
		}
	}
	private myNode<E> head = null;
	private myNode<E> tail = null;
	private int size = 0;
	public E first(){
		return head.getElement();
	}
	public E last(){
		return tail.getElement();
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public void addFirst(E elem){
		head = new myNode<E>(elem, head);
		if(size == 0){
			tail = head; 
		}
		size++;
	}
	public void addLast(E elem){
		myNode<E> newone = new myNode<E>(elem, null);
		if(size == 0){
			head = newone;
		}
		else{
			tail.setNext(newone);
		}
		tail = newone;
		size++;
	}
	public E removeFirst(){
		if(size == 0){
			return null;
		}
		E ans = head.getElement();
		head = head.getNext();
		size--;
		if(size == 0){
			tail = null;
		}
		return ans;
	}
	public static void main(String[] args){
		myLinkedList<Double> mylist = new myLinkedList<>();
		mylist.addFirst(1.0);
		mylist.addFirst(2.0);
		
		System.out.println(mylist.removeFirst());
	}
}