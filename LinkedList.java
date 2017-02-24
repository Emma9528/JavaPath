public class LinkedList<E>{
	private static class Node<E>{
		private E data;
		private Node<E> next;
		public Node(E data, Node<E> next){
			this.data = data;
			this.next = next;
		}
		public E getElement(){
		 	return data;
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
	public E first(){
		return head.getElement();
	}
	public E last(){
		return tail.getElement();
	}
	public Node<E> kth(int location){
		int i = 1;
		Node<E> toFind = head;
		while(i<location){
			toFind = toFind.getNext();
			i++;
		}
		return toFind;
	}
	public Node<E> head(){
		return kth(1);
	}
	public void addFirst(E elem){
		head = new Node<E>(elem,head);
		if(size == 0){
			tail = head;
		}
		size++;
	}
	public void addLast(E elem){
		Node<E> newone = new Node<E>(elem,null);
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
	public void insertBefore(E elem, Node<E> node){
		Node<E> temp = head;
		if(node == null){
			addLast(elem);
		}
		
		else if(temp == node){
			head = new Node<E>(elem,head);
			size++;
		}
		else{
			while(temp.getNext()!=node && temp!= null){
				temp = temp.getNext();
			}
			if(temp!=null){
				Node<E> newone = new Node<E>(elem, temp.getNext());
				temp.setNext(newone);
				size++;
			}
			else{
				System.out.println("no such node in the list");
			}
		}
	}
	public void insertAfter(E elem, Node<E> node){
		Node<E> temp = head;
		if(node == null){
			return;
		}
		
		while(temp != null && temp != node){
			temp = temp.getNext();
		}
		if(temp!=null){
			Node<E> newone = new Node<E>(elem, temp.getNext());
			temp.setNext(newone);
			size++;
		}
		else{
			System.out.println("no such node in the list");
		}
		
	}
	public void deleteElement(Node<E> node){
		if(node == head){
			head = head.getNext();
			size--;
			return;
		}
		Node<E> temp1 = head;
		Node<E> temp2 = head.getNext();
		
		while(temp2!= null && temp2!= node){
			temp2 = temp2.getNext();
			temp1 = temp1.getNext();
		}
		
		if(temp2!=null){
			temp1.setNext(temp2.getNext());
			size--;
		}
		else{
			System.out.println("no such node in the list");
		}
	}
	public E findKth(int k){
		Node<E> runner = head;
		Node<E> ans = head;
		int trackNum = 0;
		while(trackNum < k && runner != null){
			runner = runner.next;
			trackNum++;
		}
		
		if(runner == null){
			return null;
		}
		while(runner!=null){
			ans = ans.next;
			runner = runner.next;
		}
		return ans.getElement();
	}
	
	public boolean isPalindrome(){
		Node<E> reversedNode = null;
		Node<E> current = head;
		while(current!=null){
			reversedNode = new Node<E>(current.getElement(),reversedNode);
			current = current.getNext();
		}
		current = head;
		while(current!=null){
			if(!current.getElement().equals(reversedNode.getElement())){
				return false;
			}
			current = current.getNext();
			reversedNode = reversedNode.getNext();
		}
		return true;
	}
	public void partition(E pivot){
		int tracker = 0;
		Node<E> current = head;
		while(tracker<size){
			if(current.getElement().compareTo(pivot)>=0){
				addLast(current.getElement());
				deleteElement(current);
			}
			tracker++;
			current = current.getNext();
		}
	}
	public Node<E> loopNode(){
		Node<E> temp1 = head;
		Node<E> temp2 = head.getNext();
		while(temp1!=temp2){
			temp1 = temp1.getNext();
			temp2 = temp2.getNext().getNext();
		}
		return temp1;
	}
	public LinkedList<E> sumTwoList(LinkedList<E> anotherList){
		
	}	
	public static void main(String[] args){
		LinkedList<Double> mylist = new LinkedList<>();
		mylist.addLast(1.0);
		mylist.addLast(2.0);
		mylist.addLast(3.0);
		mylist.addLast(4.0);
		mylist.addFirst(4.0);
		
		System.out.println(mylist.isPalindrome());
		System.out.println(mylist.first());
		System.out.println(mylist.last());
		System.out.println(mylist.findKth(2));
	}	
}