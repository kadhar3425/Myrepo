import java.util.Scanner;

public class SubSequenceSum3{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Element: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println("Enter the Sum: ");
		int sum=s.nextInt();
		System.out.println(count(0,arr,0,sum,n));
	}
	public static int count(int ind,int arr[],int s,int sum,int n){
		if(ind == n){
			if(s>sum)
				return 0;
			if(s==sum)
				return 1;
			return 0;
		}
		int l=count(ind+1,arr,s+arr[ind],sum,n);
		int r=count(ind+1,arr,s,sum,n);
		return l+r;
	}
}