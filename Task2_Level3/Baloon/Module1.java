import java.util.Scanner;

public class Module1 {
      public static void main(String[] args) {
	       Matrix m=new Matrix();
	       m.getInput();
	}
}
class Matrix{
	Scanner s=new Scanner(System.in);
	String matrix[][];
	public void getInput() {
		System.out.print("Enter the row: ");
		int n=s.nextInt();
		System.out.print("Enter the col: ");
		int m=s.nextInt();
		createMatrix(n,m);
		while(true) {
		System.out.print("Enter the col number: ");
		int column=s.nextInt();
		System.out.print("Enter the Ballon color: ");
		String color=s.next();
		drop(column,color);
		System.out.println("Contents of the matrix: ");
		display();
		System.out.print("Do you wish to continue(Y/N): ");
		char wish=s.next().charAt(0);
		if(wish=='Y')
			continue;
		if(wish=='N')
			break;
		}	
	}
	public void createMatrix(int n,int m) {
		matrix=new String[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				matrix[i][j]="-";
			}
		}
	}
	public void drop(int column,String color) {
		for(int i=matrix[column-1].length-1;i>=0;i--) {
			if(matrix[i][column-1]=="-") {
				matrix[i][column-1]=color;
				return;
			}
		}
	}
	public void display() {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
		       System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
  }
}
