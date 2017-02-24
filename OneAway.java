public class cc5 {
	private String directCompress(String mystr){
		StringBuilder compressed = new StringBuilder();
		int len = mystr.length();
		char temp = mystr.charAt(0);
		int count = 1;
		for (int i = 1; i < len; i++){
			if(mystr.charAt(i)==temp){
				count++;
			}
			else{
				compressed.append(temp);
				compressed.append(count);
				temp = mystr.charAt(i);
				count = 1;
			}
		}
		compressed.append(temp);
		compressed.append(count);
		return compressed.toString();
	}
	public String wiseCompress(String mystr){
		int len1 = mystr.length();
		int len2 = directCompress(mystr).length();
		if (len2>=len1){
			return mystr;
		}
		else{
			return directCompress(mystr);
		}
	}
	public static void main (String[] args) {
		cc5 mycc = new cc5();
		System.out.println(mycc.wiseCompress("aaacbabbbcccccaaa"));
	}
}
