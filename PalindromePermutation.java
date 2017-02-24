public class cc4 {
			
	public static String replaceSpace(String mystr){
		int len = mystr.length();
		char[] myArray= new char[len];
		int i = 0;
		for (int j = 0; j < len; i++){
			if (mystr.charAt(i)==' '){
				myArray[j] = '%';
				myArray[++j] = '2';
				myArray[++j] = '0';
			}
			else{
				myArray[j] = mystr.charAt(i);
			}
			j++;

		}
		mystr = new String(myArray);
		return mystr;
	}
	public static void main (String[] args) {
		System.out.println(replaceSpace("hello world  "));
	}
}