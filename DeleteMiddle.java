class threeStack{
	private int stackSize = 100;
	private int[] buffer = new int[3*stackSize];
	private int[] stackPointer = {-1,-1,-1};
	 
	public void push(int value, int stackNum) throws Exception{
		if(stackPointer[stackNum] == stackSize-1){
			throw new Exception("Out of space");
		}
		stackPointer[stackNum]++;
		buffer[stackPointer[stackNum]+stackSize*stackNum] = value;
	}
	public int pop(int stackNum) throws Exception{
		if(stackPointer[stackNum] == -1){
			throw new Exception("Trying to pop an empty stack");
		}
		int result = buffer[stackPointer[stackNum]+stackSize*stackNum];
		stackPointer[stackNum]--;
		return result;
	}
	public int peek(stackNum) throws Exception{
		if(stackPointer[stackNum] == -1){
			throw new Exception("This is an empty stack");
		}
		int result = buffer[stackPointer[stackNum]+stackSize*stackNum];
		return result;
	}
	
}