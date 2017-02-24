import java.util.Arrays;
public class cc3 {
	public static boolean decidePermutation(String str1, String str2){
		int len = str1.length();
		if (len != str2.length()){
			return false;
		}
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1,charArray2);
		
		
	}
	public static void main (String[] args) {
		System.out.println(decidePermutation("ab c","a cb"));
	}
}