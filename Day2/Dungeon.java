import java.util.*;

public class Dungeon{
	public static void main(String[] args)throws Exception{
		 Module1.GetInput();
    }
}
class Module1{
	public static void GetInput()throws Exception{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row and column: ");
		int r=s.nextInt();
		int c=s.nextInt();
		String dun[][]=new String[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
				dun[i][j]="-";
		}
		System.out.println("Enter the Adventurer locations: ");
		int ar=s.nextInt();
		int ac=s.nextInt();
		System.out.println("Enter the Gold locations: ");
		int gr=s.nextInt();
		int gc=s.nextInt();
		dun[ar-1][ac-1]="A";
		dun[gr-1][gc-1]="G";
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(dun[i][j]+" ");
			}
			System.out.println();
		}
		findPath(dun,r,c,ar,ac,gr,gc);
    }
	public static void findPath(String dun[][],int r,int c,int ar,int ac,int gr,int gc) throws Exception{
		int vis[][]=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				vis[i][j]=0;
			}
		}
		int di[]={+1,0,0,-1};
		int dj[]={0,-1,1,0};
		ArrayList<Integer> ans=new ArrayList<>();
		int count=0;
		solve(ar-1,ac-1,dun,r,c,gr-1,gc-1,ans,vis,di,dj,count);
		System.out.print(ans);
	}
	public static void solve(int ar,int ac,String dun[][],int r,int c,int gr,int gc,ArrayList<Integer> ans,int vis[][],int di[],int dj[],int count){
		if(ar==gr&&ac==gc){
			ans.add(count);
			return;
		}
		for(int ind=0;ind<4;ind++){
			int nexti =ar+di[ind];
			int nextj=ac+dj[ind];
			if(nexti>=0&&nextj>=0&&nexti<r&&nextj<c&&vis[nexti][nextj]==0){
				   vis[ar][ac]=1;
				   count++;
				   solve(nexti,nextj,dun,r,c,gr,gc,ans,vis,di,dj,count);
				   count--;
				   vis[ar][ac]=0;
			}
		}
	}
}