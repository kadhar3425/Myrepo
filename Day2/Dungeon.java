package Dungeon;

import java.util.*;

public class Dungeon{
	public static void main(String[] args)throws Exception{
		Scanner s=new Scanner(System.in);
		while(true) {
		System.out.println("1.Start Game");
        System.out.println("2.Exit");
        int choice=s.nextInt();
        if(choice==1) {
        System.out.println("Enter the row and column: ");
        int r=s.nextInt();
        int c=s.nextInt();
        Menu(r,c);
        }
        else
        	break;
		}
	}
	public static void Menu(int r,int c) {
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("1.Level");
			System.out.println("2.Level");
			System.out.println("3.Level");
			System.out.println("4.Level");
			System.out.println("5.Level");
			System.out.println("6.Level");
			System.out.println("7.Level");
			System.out.println("8.Exit");
			int choice =s.nextInt();
			switch(choice) {
			case 1:{
		        Module1.getInput(r, c);
		        break;
			}
			case 2:{
		        Module2.getInput(r, c);
		        break;
			}
			case 3:{
		        Module3.getInput(r, c);
		        break;
			}
			case 4:{
		        Module4.getInput(r, c);
		        break;
			}
			case 5:{
		        Module5.getInput(r, c);
		        break;
			}
			case 6:{
		        Module6.getInput(r, c);
		        break;
			}
			case 7:{
		        Module7.getInput(r, c);
		        break;
			}
			default:
				return;
				
			}
		}
	}
}
abstract class DungeonGame{	
	public static final void solve(int r,int c,int ar,int ac,char dun[][],
			ArrayList<Integer> ans,String p,ArrayList<String> path,int gr,int gc,int vis[][],int di[],int dj[],int count) {
		if(ar==gr&&ac==gc&&Collections.min(ans)>=count) {
			ans.add(count);
			path.add(p);
			return;
		}
		for(int ind=0;ind<4;ind++) {
			int nexti=ar+di[ind];
			int nextj=ac+dj[ind];
			String temp=p;
			p+="("+(nexti+1)+","+(nextj+1)+")";
			if(nexti>=0&&nextj>=0&&nexti<r&&nextj<c&&vis[nexti][nextj]==0&&dun[nexti][nextj]!='M'&&dun[nexti][nextj]!='P') {
				vis[nexti][nextj]=1;
				++count;
				solve(r,c,nexti,nextj,dun,ans,p,path,gr,gc,vis,di,dj,count);
				vis[nexti][nextj]=0;
				--count;
				p=temp;
			}
			else
				p=temp;
		}
	}
	public static final void monsolve(int r,int c,int ar,int ac,char dun[][],ArrayList<Integer> ans,int gr,int gc,int vis[][],int di[],int dj[],int count) {
		if(ar==gr&&ac==gc) {
			ans.add(count);
			return;
		}
		for(int ind=0;ind<4;ind++) {
			int nexti=ar+di[ind];
			int nextj=ac+dj[ind];
			if(nexti>=0&&nextj>=0&&nexti<r&&nextj<c&&vis[nexti][nextj]==0) {
				vis[nexti][nextj]=1;
				count++;
				monsolve(r,c,nexti,nextj,dun,ans,gr,gc,vis,di,dj,count);
				vis[nexti][nextj]=0;
				count--;
			}
		}
	}
	public static void printArray(char dun[][],int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(dun[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
class Module1 extends DungeonGame{
	public static void getInput(int r,int c) {
		char dun[][]=new char[r][c];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Adventurer Locations: ");
		int ar=s.nextInt();
		int ac=s.nextInt();
		System.out.println("Enter the Gold Locations: ");
		int gr=s.nextInt();
		int gc=s.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				dun[i][j]='-';
			}
		}
		dun[ar-1][ac-1]='A';
		dun[gr-1][gc-1]='G';
		printArray(dun,r,c);
		findPath(r, c, ar, ac, gr, gc, dun);
	}
	public static void findPath(int r,int c,int ar,int ac,int gr,int gc,char dun[][]) {
		int vis[][]=new int[r][c];
		int di[]= {+1,0,0,-1};
		int dj[]= {0,-1,+1,0};
		int count=0;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans.add(100);
		solve(r, c, ar-1, ac-1, dun, ans, null, null, gr-1, gc-1, vis, di, dj, count);
		if(!ans.isEmpty())
			System.out.println("Shortest path count is: "+Collections.min(ans));
	}	
}
class Module2 extends DungeonGame{
	static boolean flag=false;
	static ArrayList<String> path=new ArrayList<String>();
	public static void getInput(int r,int c) {
		char dun[][]=new char[r][c];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Adventurer Locations: ");
		int ar=s.nextInt();
		int ac=s.nextInt();
		System.out.println("Enter the Monster Locations: ");
		int mr=s.nextInt();
		int mc=s.nextInt();
		System.out.println("Enter the Gold Locations: ");
		int gr=s.nextInt();
		int gc=s.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				dun[i][j]='-';
			}
		}
		dun[ar-1][ac-1]='A';
		dun[gr-1][gc-1]='G';
		dun[mr-1][mc-1]='M';
		printArray(dun,r,c);
		findPath(r, c, ar, ac, gr, gc,mr,mc, dun);
	}
	public static void findPath(int r,int c,int ar,int ac,int gr,int gc,int mr,int mc,char dun[][]) {
		int vis[][]=new int[r][c];
		int di[]= {+1,0,0,-1};
		int dj[]= {0,-1,+1,0};
		int count=0;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans.add(100);
		String p="("+ar+","+ac+")";
		int advg=0;
		solve(r, c, ar-1, ac-1, dun, ans, p, path, gr-1, gc-1, vis, di, dj, count);
		advg=Collections.min(ans);
		ans=new ArrayList<Integer>();
		int mons=0;
		ans.add(100);
		monsolve(r, c, mr-1, mc-1, dun, ans, gr-1, gc-1, vis, di, dj, count);
		mons=Collections.min(ans);
		if(advg<=mons&&advg!=0) {
		System.out.println("Shortest path count is: "+advg);
		flag=true;
		}
		else
			System.out.println("There is no possible");
	}
}
class Module3 extends Module2{
	public static void getInput(int r,int c) {
		char dun[][]=new char[r][c];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Adventurer Locations: ");
		int ar=s.nextInt();
		int ac=s.nextInt();
		System.out.println("Enter the Monster Locations: ");
		int mr=s.nextInt();
		int mc=s.nextInt();
		System.out.println("Enter the Gold Locations: ");
		int gr=s.nextInt();
		int gc=s.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				dun[i][j]='-';
			}
		}
		dun[ar-1][ac-1]='A';
		dun[gr-1][gc-1]='G';
		dun[mr-1][mc-1]='M';
		printArray(dun,r,c);
		findPath(r, c, ar, ac, gr, gc,mr,mc, dun);
		if(flag==true)
			System.out.println(Collections.min(path));
	}
}
class Module4 extends DungeonGame{
	public static void getInput(int r,int c) {
		char dun[][]=new char[r][c];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Adventurer Locations: ");
		int ar=s.nextInt();
		int ac=s.nextInt();
		System.out.println("Enter the Monster Locations: ");
		int mr=s.nextInt();
		int mc=s.nextInt();
		System.out.println("Enter the Trigger Locations: ");
		int tr=s.nextInt();
		int tc=s.nextInt();
		System.out.println("Enter the Gold Locations: ");
		int gr=s.nextInt();
		int gc=s.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				dun[i][j]='-';
			}
		}
		dun[ar-1][ac-1]='A';
		dun[gr-1][gc-1]='G';
		dun[mr-1][mc-1]='M';
		dun[tr-1][tc-1]='T';
		printArray(dun,r,c);
		findPath(dun, r, c, ar, ac, gr, gc, mr, mc, tr, tc);
	}
	public static void findPath(char dun[][],int r,int c,int ar,int ac,int gr,int gc,int mr,int mc,int tr,int tc) {
		int vis[][]=new int[r][c];
		int di[]= {+1,0,0,-1};
		int dj[]= {0,-1,+1,0};
		int count=0;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans.add(100);
		ArrayList<String> path=new ArrayList<String>();
		int advg=0,mon=0,advt=0;
		solve(r, c, ar-1, ac-1, dun, ans,"", path, gr-1, gc-1, vis, di, dj, count);
		advg=Collections.min(ans);
		ans=new ArrayList<Integer>();
		ans.add(100);
		solve(r,c,ar-1,ac-1,dun,ans,"",path,tr-1,tc-1,vis,di,dj,count);
		advt=Collections.min(ans);
		ans=new ArrayList<Integer>();
		ans.add(100);
		monsolve(r,c, mr-1, mc-1, dun, ans, gr-1, gc-1, vis, di, dj, count);
		mon=Collections.min(ans);
		if(mon<advg&&advt>=mon) {
			ans=new ArrayList<Integer>();
			ans.add(100);
			solve(r,c,tr-1,tc-1,dun,ans,"",path,gr-1,gc-1,vis,di,dj,count);
			advt+=Collections.min(ans);
			System.out.println("Minimum shortest path count is: "+advt);
		}
		else if(mon>=advg&&advg!=0) {
			System.out.println("Minimum shortest path count is: "+advg);
		}
		else{
			System.out.println("There is no possible");
		}
	}
}
class Module5 extends DungeonGame{
	public static void getInput(int r,int c) {
		char dun[][]=new char[r][c];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				dun[i][j]='-';
			}
		}
		System.out.println("Enter the Adventurer Locations: ");
		int ar=s.nextInt();
		int ac=s.nextInt();
		System.out.println("Enter the How many pits: ");
		int p=s.nextInt();
		for(int i=0;i<p;i++) {
			System.out.println("Enter the pit Locations: ");
			int pr=s.nextInt();
			int pc=s.nextInt();
			dun[pr-1][pc-1]='P';
		}
		System.out.println("Enter the Gold Locations: ");
		int gr=s.nextInt();
		int gc=s.nextInt();
		dun[ar-1][ac-1]='A';
		dun[gr-1][gc-1]='G';
		printArray(dun,r,c);
		findPath(dun, r, c, ar, ac, gr, gc);
	}
	public static void findPath(char dun[][],int r,int c,int ar,int ac,int gr,int gc) {
		int vis[][]=new int[r][c];
		int di[]= {+1,0,0,-1};
		int dj[]= {0,-1,+1,0};
		int count=0;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ArrayList<String> path=new ArrayList<String>();
		solve(r, c, ar-1, ac-1, dun, ans, "", path, gr-1, gc-1, vis, di, dj, count);
		if(!ans.isEmpty()) {
			System.out.println("minimum shortest path count is: "+Collections.min(ans));
		}
		else
			System.out.println("There is no possible");
	}
}
class Module6 extends DungeonGame{
	public static void getInput(int r,int c) {
		char dun[][]=new char[r][c];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				dun[i][j]='-';
			}
		}
		System.out.println("Enter the Adventurer Locations: ");
		int ar=s.nextInt();
		int ac=s.nextInt();
		System.out.println("Enter the Monster Locations: ");
		int mr=s.nextInt();
		int mc=s.nextInt();
		System.out.println("Enter the How many pits: ");
		int p=s.nextInt();
		for(int i=0;i<p;i++) {
			System.out.println("Enter the pit Locations: ");
			int pr=s.nextInt();
			int pc=s.nextInt();
			dun[pr-1][pc-1]='P';
		}
		System.out.println("Enter the Gold Locations: ");
		int gr=s.nextInt();
		int gc=s.nextInt();
		dun[ar-1][ac-1]='A';
		dun[gr-1][gc-1]='G';
		dun[mr-1][mc-1]='M';
		printArray(dun,r,c);
		findPath(dun, r, c, ar, ac, mr, mc, gr, gc);
	}
	public static void findPath(char dun[][],int r,int c,int ar,int ac,int mr,int mc,int gr,int gc) {
		int vis[][]=new int[r][c];
		int di[]= {+1,0,0,-1};
		int dj[]= {0,-1,+1,0};
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans.add(100);
		ArrayList<String> path=new ArrayList<String>();
		int advg=0,mon=0,count=0;
		solve(r, c, ar-1, ac-1, dun, ans, "",path, gr-1, gc-1, vis, di, dj, count);
		advg=Collections.min(ans);
		ans=new ArrayList<Integer>();
		ans.add(100);
		monsolve(r, c, mr-1, mc-1, dun, ans, gr-1, gc-1, vis, di, dj, count);
		mon=Collections.min(ans);
		if(mon>=advg&&advg!=0) {
			System.out.println("Minimum shortest path count is: "+advg);
		}
		else
			System.out.println("There is no possible");
	}
}
class Module7 extends DungeonGame{
    public static void getInput(int r,int c) {
    	char dun[][]=new char[r][c];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				dun[i][j]='-';
			}
		}
		System.out.println("Enter the Adventurer Locations: ");
		int ar=s.nextInt();
		int ac=s.nextInt();
		System.out.println("Enter the Monster Locations: ");
		int mr=s.nextInt();
		int mc=s.nextInt();
		System.out.println("Enter the How many pits: ");
		int p=s.nextInt();
		for(int i=0;i<p;i++) {
			System.out.println("Enter the pit Locations: ");
			int pr=s.nextInt();
			int pc=s.nextInt();
			dun[pr-1][pc-1]='P';
		}
		System.out.println("Enter the Trigger Locations: ");
		int tr=s.nextInt();
		int tc=s.nextInt();
		System.out.println("Enter the Gold Locations: ");
		int gr=s.nextInt();
		int gc=s.nextInt();
		dun[ar-1][ac-1]='A';
		dun[gr-1][gc-1]='G';
		dun[mr-1][mc-1]='M';
		dun[tr-1][tc-1]='T';
		printArray(dun,r,c);
		findPath(dun, r, c, ar, ac, mr, mc, tr, tc, gr, gc);
    }
    public static void findPath(char dun[][],int r,int c,int ar,int ac,int mr,int mc,int tr,int tc,int gr,int gc) {
    	int vis[][]=new int[r][c];
		int di[]= {+1,0,0,-1};
		int dj[]= {0,-1,+1,0};
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans.add(100);
		ArrayList<String> path=new ArrayList<String>();
		int advg=0,advt=0,mon=0,count=0;
		solve(r, c, ar-1, ac-1, dun, ans, "", path, gr-1, gc-1, vis, di, dj, count);
		advg=Collections.min(ans);
		ans=new ArrayList<Integer>();
		ans.add(100);
		solve(r, c, ar-1, ac-1, dun, ans, "", path, tr-1, tc-1, vis, di, dj, count);
		advt=Collections.min(ans);
		ans=new ArrayList<Integer>();
		ans.add(100);
		monsolve(r, c, mr-1, mc-1, dun, ans, gr-1, gc-1, vis, di, dj, count);
		mon=Collections.min(ans);
		if(mon<advg&&advt>=mon) {
			ans=new ArrayList<Integer>();
			ans.add(100);
			solve(r,c,tr-1,tc-1,dun,ans,"",path,gr-1,gc-1,vis,di,dj,count);
			advt+=Collections.min(ans);
			System.out.println("Minimum shortest path count is: "+advt);
		}
		else if(mon>=advg) {
			System.out.println("Minimum shortest path count is: "+advg);
		}
		else{
			System.out.println("There is no possible");
		}
    }
}
