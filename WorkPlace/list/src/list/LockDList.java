package list;

public class LockDList extends DList{
	LockDListNode ahead;
	
	public void lockNode(DListNode node) {
		
		
		((LockDListNode)node).locked=true;
	}
	
	  public void remove(DListNode node) {
		  if(((LockDListNode)node).locked)
		  {
			  
		  }
		  else if(node!=null)
		  {
			  ((LockDListNode)node).anext.aprev=((LockDListNode)node).aprev;
			  ((LockDListNode)node).aprev.anext=((LockDListNode)node).anext;
			  size--;
			  
		  }
	    // Your solution here.
	  }
	  public LockDList() {
		    size=0;
		    ahead=new LockDListNode();
		    ahead.aprev=ahead;
		    ahead.anext=ahead;
		    //  Your solution here.
		  }
		protected LockDListNode newNode(Object item, LockDListNode aprev, LockDListNode anext) {
		    return new LockDListNode(item, aprev, anext);
		  }
		public void insertFront(Object item) {
			if(ahead.anext==null)
			{
				LockDListNode newest = new LockDListNode(item,ahead,ahead);
				ahead.anext=newest;
				ahead.aprev=newest;
				size++;
			}
			else
			{
				LockDListNode newest = new LockDListNode(item,ahead,ahead.anext);
		    ahead.anext.aprev=newest;
		    ahead.anext = newest;
		    size++;
			}
			
		    // Your solution here.
		  }
		public void insertBack(Object item) {
			  if(ahead.aprev==null)
				{
				  LockDListNode newest = new LockDListNode (item,ahead,ahead);
					ahead.anext=newest;
					ahead.aprev=newest;
					size++;
				}
			  else
			  {
			  LockDListNode newest = new LockDListNode (item,ahead.aprev,ahead);
			  ahead.aprev.anext=newest;
			  ahead.aprev=newest;
			  size++;
				}
		}
		  /**
		   *  remove() removes "node" from this DList.  If "node" is null, do nothing.
		   *  Performance:  runs in O(1) time.
		   */
	public LockDListNode front() {
			  if(size==0)
			  {
				  return null;
			  }
			  else
			  {
				  return  ahead.anext;
			  }
		    // Your solution here.
		  }

		  /**
		   *  back() returns the node at the back of this DList.  If the DList is
		   *  empty, return null.
		   *
		   *  Do NOT return the sentinel under any circumstances!
		   *
		   *  @return the node at the back of this DList.
		   *  Performance:  runs in O(1) time.
		   */
		  public LockDListNode back() {
			  if(size==0)
			  {
				  return null;
			  }
			  else
			  {
				  return ahead.aprev;
			  }
		    // Your solution here.
		  }
		  public String toString() {
			    String result = "[  ";
			    LockDListNode current = ahead.anext;
			    
			    while (current != ahead) {
			      result = result + current.item + "  ";
			      current = current.anext;
			    }
			    return result + "]";
			  }
		  public LockDListNode next(DListNode node) {
				  if(((LockDListNode)node)==null||((LockDListNode)node)==ahead.aprev)
				  {
					  return null;
				  }
				  else
				  {
					  
					  return ((LockDListNode)node).anext;
				  }
		  }
		  public LockDListNode prev(DListNode node) {
			  if(((LockDListNode)node)==null||((LockDListNode)node)==ahead.anext)
			  {
				  return null;
			  }
			  else
			  {
				  return ((LockDListNode)node).aprev;
			  }
		    // Your solution here.
		  }
		  public void insertAfter(Object item, DListNode node) {
			  if(((LockDListNode)node)!=null)
			  {
				 
			  LockDListNode newest = new LockDListNode(item,((LockDListNode)node),((LockDListNode)node).anext);
			  ((LockDListNode)node).anext.aprev=newest;
			  ((LockDListNode)node).anext=newest;
			  size++;
			  }
			 
			  
		    // Your solution here.
		  }
		  public void insertBefore(Object item, DListNode node) {
			  if(((LockDListNode)node)!=null)
			  {
				 
		     LockDListNode newest = new LockDListNode(item,((LockDListNode)node).aprev,((LockDListNode)node));
		     ((LockDListNode)node).aprev.anext=newest;
		     ((LockDListNode)node).aprev=newest;
			  size++;
			  }
		    // Your solution here.
		  }
		  

	  
	
}
