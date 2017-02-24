public static void removeDuplicates(LinkedListNode node){
	Hashtable table = new Hashtable();
	LinkedListNode ans = null;
	while(node!=null){
		if(table.containsKey(node.data)){
			ans.next = node.next;
		}
		else{
			table.put(node.data,true);
			ans = node;
		}
		node = node.next;
	}
} 
public static void removeDuplicates(LinkedListNode node){
	if(node == null){
		return;
	}
	LinkedListNode current = node;
	while(current!=null){
		LinkedListNode runner = current;
		while(runner.next!=null){
			if(runner.next.data == current.data){
				runner.next = runner.next.next;
			}
			else{
				runner = runner.next;
			}
		}
		current = current.next;
	}
	}
public static void removeDuplicates(LinkedListNode node){
	LinkedListNode current = node;
	while(node!=null){
		LinkedListNode runner = current;
		while(runner.next!=null){
			if(runner.next.data == current.data){
				runner.next = runner.next.next;
			}
			else{
				runner = runner.next;
			}
		}
		current = current.next;
	}
}

				