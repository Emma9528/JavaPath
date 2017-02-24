package list;

public class LockDListNode extends DListNode{
	boolean locked;
	protected  LockDListNode aprev;
	protected  LockDListNode anext;
	
	LockDListNode(Object i, LockDListNode p, LockDListNode n){
		aprev=p;
		anext=n;
		item=i;
		locked=false;
	}
	LockDListNode(){
		item=null;
		locked=false;
	}
}
