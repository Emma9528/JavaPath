public class cc2 {
	public static void reverse(String mystr){
		char[] charArray = mystr.toCharArray();
		int i = 0;
		int j = charArray.length - 1;
		while (j >= i){
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		mystr = new String(charArray);
		System.out.println(mystr);
	}
	public static void main (String[] args) {
		reverse("abcd");
	}
}