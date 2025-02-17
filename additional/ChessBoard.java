package additional;

public class ChessBoard {
	
	private static int Queen = 1;
	private static int Obstacle = -1;
	private static int NonObstacle = 0;
	private static int queenRow=4;
	private static int queenCol=3;
	
	public static void main(String[] args) 
	{
		int n=5,k=3;
		
		int obstacles[]= {5,5,4,2,2,3} ;
		
		int chess[][]=new int[n+1][n+1];
		chess[queenRow][queenCol] = Queen;
		for(int pos=0; pos<k*2;pos+=2) {
			int obstacleRow = obstacles[pos];
			int obstacleCol = obstacles[pos+1];
			chess[obstacleRow][obstacleCol] = Obstacle;
		}
		
		System.out.println(queenAttack(n,k,queenRow,queenCol,obstacles,chess));

	}
	
	public static int queenAttack(int n, int k,int qr,int qc,int[] obs,int [][] chess)
	{
		chess[qr][qc]=2;
		for(int i=1;i<chess.length;i++)
		{
			for(int j=1;j<chess.length;j++)
			{
				System.out.print(chess[i][j]+" ");
			}
			System.out.println();
		}
		int ik=0,result=0;
		int pos[]= {-1,0,1};
//		for(int i=ik;ik<3;ik++)
//		{
//			int row = qr-pos[ik];
//			int jk=0;
//			for(int j=jk;jk<3;jk++)
//			{	 
//				int col = qc-pos[jk];
//				int rd=qr-row;
//				int cd=qc-col;
//				if(row!=qr && col!= qc)
//				{
//					result=result+count(1,1,5,4,chess);
//				}
//			}
//			
//		}
		result = count(1,1,5,4,chess);
		return result;
    }
	
	public static int count(int rowDiff , int colDiff, int currRow, int currCol, int [][]chess)
	{
		System.out.println(currRow +" "+currCol);
		
//		if(currRow==queenRow && currCol==queenCol)
//		{
//			return 0;
//		}
		if ( currRow > chess.length-1 || currCol>chess.length-1 || currRow<0 ||currCol<0) { // boundary check
			return 0;
		}
		
		if( chess[currRow][currCol] == Obstacle ) {
			return 0;
		}
		
			int count = 1 + count(rowDiff, colDiff, currRow+rowDiff , currCol+colDiff, chess);
			return count;
		
	}
}