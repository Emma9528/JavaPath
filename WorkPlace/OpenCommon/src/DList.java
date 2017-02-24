package ocean;



public class DList<TypeAndSize> {
	private static class DListNode<TypeAndSize>
	  {
		  private TypeAndSize run;
		  private DListNode<TypeAndSize> prev;
		  private DListNode<TypeAndSize> next;
		  public DListNode(TypeAndSize r,DListNode<TypeAndSize> p,DListNode<TypeAndSize> n)
		  {
			  run=r;
			  prev=p;
			  next=n;
		  }
		  public TypeAndSize getRun()
		  {
			  return run;
		  }
		  public DListNode<TypeAndSize> getPrev()
		  {
			  return prev;
		  }
		  public DListNode<TypeAndSize> getNext()
		  {
			  return next;
		  }
		  public void setPrev(DListNode<TypeAndSize> p)
		  {
			  prev=p;
		  }
		  public void setNext(DListNode<TypeAndSize> n)
		  {
			  next=n;
		  }
	  }
	  private DListNode<TypeAndSize> header;
	  private DListNode<TypeAndSize> trailer;
	  private int size=0;
	  public DList()
	  {
		  header = new DListNode(null,null,null);
	      trailer= new DListNode(null,header,null);
	      header.setNext(trailer);
	  }
	  public int size()
	  {
		  return size;
	  }
	  public boolean isEmpty()
	  {
		  return size==0;
	  }
	  private void addBetween(TypeAndSize t,DListNode<TypeAndSize> p,DListNode<TypeAndSize> n)
	  {
		  DListNode<TypeAndSize> newest=new DListNode(t,p,n);
		  p.setNext(newest);
		  n.setPrev(newest);
		  size++;	  
	  }
	  public void addFirst(TypeAndSize t)
	  {
		  addBetween(t,header,header.getNext());
	  }
}
