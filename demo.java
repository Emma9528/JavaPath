public class demo<E>{
	private static class singlyLinkedListNode<E>{
	private singlyLinkedListNode<E> next;
	private E value;
	public singlyLinkedListNode(E value){
		this.value = value;
		next = null;
	}
	public singlyLinkedListNode(E value, singlyLinkedListNode<E> elem){
		this.value = value;
		next = elem;
	}
	public E value(){
		return value;
	}
	public singlyLinkedListNode<E> next(){
		return next;
	}
	public void setValue(E value){
		this.value = value;		
	}
	public void setNext(singlyLinkedListNode<E> elem){
		next = elem;
	}
}
	private singlyLinkedListNode<E> head=null;
	
	public singlyLinkedListNode<E> front(){
		return head;
	}
	public void insertFront(E elem){
		head = new singlyLinkedListNode<E>(elem, head);
	}
	public singlyLinkedListNode<E> find(E data) throws dataNotFoundException{
		singlyLinkedListNode<E> elem = head;
		while(elem.value()!=data && elem!=null){
			elem = elem.next(); 
		}
		if(elem == null){
			throw new dataNotFoundException("data not found in this list");
		}
		return elem;
	}
	public static void main(String[] args){
		demo<Integer> mylist = new demo<Integer>();
		mylist.insertFront(1);
		mylist.insertFront(2);
		mylist.insertFront(2);
		mylist.insertFront(3);
		mylist.find(3);
	}
}