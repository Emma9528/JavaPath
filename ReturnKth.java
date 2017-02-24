class stack{
	
	private int length = 100;
	private int last = 0;
	private Object[] myArray = new Object[length];
	public Object pop(){
		if(last == 0){
			return null;
		}else{
			Object result = myArray[last];
			last--;
			return result;
		}
	}
	public void push(Object item){
		if(last == length-1){
			length *= 2;
			Object[] tempArray = new Object[length];
			for(int i = 0; i<=last; i++){
				tempArray[i] = myArray[i];
			}
			myArray = tempArray;
		}
		last++;
		myArray[last] = item;
	}
	public Object peek(){
		return myArray[last];
	}
		
}

class stack{
	private Node top;
	private no_min_stack minStack;
	public int pop(){
		if(top == null){
			return null;
		}else{
			int item = top.data;
			if(item == minStack.peek()){
				minStack.pop();
			}
			top = top.next;
			return item;
		}
	}
	public void push(int item){
		Node newtop = new Node(item);
		newtop.next = top;
		top = newtop;
			
		if(top == null||item <= minStack.peek()){
			minStack.push(item);
		}
	}
	public int peek(){
		return top.data;
	}
	public int min(){
		return minStack.peek();
	}
		
}
class Node{
	int value;
	Node next;
	Node nexthead;
	}
class SetOfStacks extends stack{
	int count = 0;
	int THRESHOLD = 100;
	Node top;
	public void push(int item){
		Node newtop = new Node(item);
		if(count == 0 || count%100 != 0){
			newtop.next = top;
		}else{
			newtop.nexthead = top;
		}
		top = newtop;
		count++;
	}
	public int pop(){
		if(top == null){
			return null;
		}else{
			int item = top.value;
			if(count%100 == 1 && count != 1){
				top = top.nexthead;
			}else{
				top = top.next;
			}
			return item;
		}
		}
	public int peek(){
		return top.value;
	}
}