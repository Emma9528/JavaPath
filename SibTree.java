class SibTreeNode{                  
    Object item;
    boolean visited;
    SibTreeNode parent;                   
    SibTreeNode leftChild;                         
    SibTreeNode rightChild;
    int depth(){
    	int depth = 0;
    	SibTreeNode tempNode = this;
    	while(tempNode.parent!=null){
    		height++;
    		tempNode = tempNode.parent;
    	}
    	return depth;
    }
    boolean isLeaf(){
    	return leftChild == null && rightChild == null;
    }  
    	     
} 
class SibTree{ 
	SibTreeNode root;
	int size; 
	int height = 0;
	public boolean isBalanced(){
		if(root == null || root.isLeaf()){
			return true;
	}
	int height(){
		if(root != null){
			
		}
		 
		
}

	