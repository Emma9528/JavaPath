public class SinglyLinkedList<E> {
	private static class Node<E> {
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n){
			element = e;
			next = n;
		}
		public E getElement(){
			return element;
		}
		public Node<E> getNext(){
			return next;
		}
		public void setNext(Node<E> n){
			next = n;
		}
		}
		private Node<E> head = null;
		private Node<E> tail = null;
		private int size = 0;
		public boolean isEmpty(){
			return size == 0;
		}
		public E first(){
			if(size == 0){
				return null;
			}
			return head.getElement();
		}
		public E last(){
			if(size == 0){
				return null;
			}
			return tail.getElement();
		}
		public void addFirst(E e){
			head = new Node<E>(e, head);
			if(size == 0){
				tail = head;
			}
			size++;
		}
		public void addLast(E e){
			Node<E> newone = new Node<E>(e,null);
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
			if(size > 0){
				E ans = head.getElement();
				head = head.getNext();
				size--;
				if(size == 0){
					tail = null;
				}
				return ans;
			}
			return null;
		}
		public static void main(String[] args){
		SinglyLinkedList<Integer> mylist = new SinglyLinkedList<Integer>();
		mylist.addFirst(1);
		mylist.addFirst(2);
		mylist.addFirst(3);
		mylist.addFirst(4);
		mylist.addLast(5);
		System.out.println(mylist.removeFirst());
		System.out.println(mylist.removeFirst());
		System.out.println(mylist.removeFirst());
		System.out.println(mylist.removeFirst());
		System.out.println(mylist.removeFirst());
		System.out.println(mylist.removeFirst());
	}
	}
	
