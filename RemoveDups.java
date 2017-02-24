public LinkedListNode partition(LinkedListNode Node, int pivot){
	LinkedListNode beforeStart = null;
	LinkedListNode beforeEnd = null;
	LinkedListNode afterStart = null;
	LinkedListNode afterEnd = null;
	while(Node!=null){
		LinkedListNode next = Node.next;
		Node.next = null;
		if(Node.data < pivot){
			if(beforeStart == null){
				beforeStart = Node;
				beforeEnd = beforeStart;
			}
			else{
				beforeEnd.next = Node;
				beforeEnd = beforeEnd.next;
			}
		}
		else{
			if(afterStart == null){
				afterStart = Node;
				afterEnd = afterStart;
			}
			else{
				afterEnd.next = Node;
				afterEnd = afterEnd.next;
			}
		}
		Node = next;
	}
	if(beforeStart == null){
		return afterStart;
	}
	else{
		beforeEnd.next = afterStart;
		return beforeStart;
	}
}	
public LinkedListNode partition(LinkedListNode node, int pivot){
	LinkedListNode beforeStart = null;
	LinkedListNode afterStart = null;
	while(node!=null){
		LinkedListNode next = node.next;
		if(node.data < pivot){
			node.next = beforeStart;
			beforeStart = node;
		}
		else{
			node.next = afterStart;
			afterStart = node;
		}
		node = next;
	}
	if(beforeStart == null){
		return afterStart;
	}
	LinkedListNode head = beforeStart;
	while(beforeStart.next != null){
		beforeStart = beforeStart.next;
	}
	beforeStart.next = afterStart;
	return head;
}
	
	