public class PartialSum{
	public LinkedListNode sum = null;
	public int carry = 0;
}
LinkedListNode addLists(LinkedListnode l1,LinkedListNode l2){
	int len1 = length(l1);
	int len2 = length(l2);
	if(len1 < len2){
		l1 = padList(l1, len2 - len1);
	}else{
		l2 = padList(l2, len1 - len2);
	}
	PartialSum sum = addListHelper(l1,l2);
	if(sum.carry == 0){
		return sum.sum;
	}else{
		