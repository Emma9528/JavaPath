public class cc6 {
	
	public void rotate(int[][] myMatrix,int n){
		for(int layer = 0; layer < n/2; layer++){
			first = layer;
			last = n - 1 - layer;
			for(int i = first; i < last; i++){
				int offset = i - first;
				int temp = myMatrix[first][i];
				myMatrix[first][i] = myMatrix[last-offset][first];
				myMatrix[last-offset][first] = myMatrix[last][last - offset];
				myMatrix[last][last - offset] = myMatrix[i][last];
				myMatrix[i][last] = temp;
			}
		}
	}
	public static void main (String[] args) {
		cc6 mycc = new cc6();
		System.out.println(mycc.wiseCompress("aaacbabbbcccccaaa"));
	}
}
