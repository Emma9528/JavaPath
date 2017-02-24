public static LinkedListNode findKth(LinkedListNode node,int k){
	LinkedListNode runner = node;
	int trackNum = 0;
	while(trackNum < k && node!=null){
		node = node.next;
		trackNum++;
	}
	if(node == null){
		return null;
	}
	while(node!=null){
		node = node.next;
		runner = runner.next;
	}
	return runner;
 	