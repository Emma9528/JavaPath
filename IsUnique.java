import java.util.HashMap;
public class cc1 {
	public static boolean isUnique(String mystr){
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		int len = mystr.length();
		for (int i = 0; i < len; i++){
			char mychar = mystr.charAt(i);
			int id = mychar - 'a';
			map.put(id, mychar);
		}
		return map.size() == len;
	}
	public static void main (String[] args) {
		System.out.println(isUnique("hello world"));
	}
}