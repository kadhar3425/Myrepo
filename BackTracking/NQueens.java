import java.util.Scanner;
import java.util.Arrays;

public class NQueens{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N*N size: ");
		int n=s.nextInt();
		char arr[][]=new char[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				arr[i][j]='.';
		}
		int leftRow[]=new int[n];
		int lowerDiagonal[]=new int[2*n-1];
		int upperDiagonal[]=new int[2*n-1];
		solve(0,arr,leftRow,lowerDiagonal,upperDiagonal);
	}
	public static void solve(int col,char arr[][],int leftRow[],int lowerDiagonal[],int upperDiagonal[]){
		if(col==arr.length){
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++)
					System.out.print(arr[i][j]+" ");
				System.out.println();
			}
			System.out.println();
			return;
		}
		for(int row=0;row<arr.length;row++){
			if(leftRow[row]==0&&lowerDiagonal[row+col]==0&&upperDiagonal[arr.length-1+col-row]==0){
				arr[row][col]='Q';
				leftRow[row]=1;
				lowerDiagonal[row+col]=1;
				upperDiagonal[arr.length-1+col-row]=1;
				solve(col+1,arr,leftRow,lowerDiagonal,upperDiagonal);
				arr[row][col]='.';
				leftRow[row]=0;
				lowerDiagonal[row+col]=0;
				upperDiagonal[arr.length-1+col-row]=0;
			}
		}
	}
}