public class cc7 {
	
	public void setZero(int[][] myMatrix){
		int rowLength = myMatrix.length;
		int colLength = myMatrix[0].length;
		boolean[] zerorows = new boolean[rowLength];
		boolean[] zerocols = new boolean[colLength];
		for(int row = 0; row < rowLength; row++){
				for(int col = 0; col < colLength; col++){
					if (myMatrix[row][col] == 0){
						zerorows[row] = true;
						zerocols[col] = true;
					}
			}
		}
		for(int row = 0; row < rowLength; row++){
				for(int col = 0; col < colLength; col++){
					if(zerorows[row]||zerocols[col]){
						myMatrix[row][col] = 0;
						}
					System.out.print(myMatrix[row][col] + " ");
					}
				System.out.print("\n");
			}
					
			}
	public static void main (String[] args) {
		cc7 mycc = new cc7();
		mycc.setZero(new int[][]{{1,2,0},{1,0,1},{1,2,3}});
	}
}
