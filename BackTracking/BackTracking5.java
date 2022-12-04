import java.util.Scanner;
import java.util.ArrayList;
public class BackTracking5{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row and Column: ");
		int r=s.nextInt();
		int c=s.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
				arr[i][j]=s.nextInt();
		}
		String str=arr[0][0]+" ";
		int vis[][]=new int[r][c];
		int di[]={+1,0};
		int dj[]={0,+1};
		ArrayList<Integer> ans=new ArrayList<>();
		ans.add(arr[0][0]);
		findPath(0,0,arr,r,c,vis,di,dj,ans);
		
	}
	public static void findPath(int i,int j,int arr[][],int r,int c,int vis[][],int di[],int dj[],ArrayList<Integer> ans){
		if(i==r-1&&j==c-1){
		    for(int k=0;k<ans.size();k++)
				System.out.print(ans.get(k)+" ");
			System.out.println();
			return;
		}
		for(int ind=0;ind<2;ind++){
			int nexti=i+di[ind];
			int nextj=j+dj[ind];
			if(nexti>=0&&nextj>=0&&nexti<r&&nextj<c&&vis[nexti][nextj]==0){
				ans.add(arr[nexti][nextj]);
				vis[nexti][nextj]=1;
				findPath(nexti,nextj,arr,r,c,vis,di,dj,ans);
				vis[nexti][nextj]=0;
				ans.remove(ans.size()-1);
			}
		}
	}
}