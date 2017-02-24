public class singlyLinkedListDemo{
	public static void main(String[] args){
		SinglyLinkedList<Integer> mylist = new SinglyLinkedList<>();
		mylist.addFirst(new Integer(1));
		mylist.addFirst(new Integer(2));
		mylist.addFirst(new Integer(1));
		mylist.addFirst(new Integer(4));
		mylist.addLast(new Integer(3));
		mylist.removeFirst();
	}
}