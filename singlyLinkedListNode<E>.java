public class singlyLinkedListNode<E>{
	private singlyLinkedListNode<E> next;
	private E value;
	public singlyLinkedListNode<E>(E value){
		this.value = value;
		next = null;
	}
	public singlyLinkedListNode<E>(E value, singlyLinkedListNode<E> elem){
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