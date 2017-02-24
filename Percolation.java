public class Percolation{
	private int[][] grid;
	private int opentimes;
	private int row;
	public Percolation(int N){
		row = N;
		grid = new int[N][N];
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				grid[i][j]=-1;
				}
			}
	}
    // create N-by-N grid, with all sites blocked
   	public void open(int i, int j){
   		if(grid[i][j]<0){
   			grid[i][j] = i*row+j;
   			opentimes++;
   		}
   	}         // open site (row i, column j) if it is not open already
   	public boolean isOpen(int i, int j)     // is site (row i, column j) open?
   	public boolean isFull(int i, int j)     // is site (row i, column j) full?
   	public boolean percolates()             // does the system percolate?
	private void find(int i, int j)
	private void union(int i, int j)
   	public static void main(String[] args)  // test client (optional)
}