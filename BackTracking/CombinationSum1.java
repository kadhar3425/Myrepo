import java.util.Scanner;
import java.util.ArrayList;

public class CombinationSum1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int n=s.nextInt();
		System.out.println("Enter the Array Element: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println("Enter the Sum: ");
		int sum=s.nextInt();
		ArrayList<Integer> ds=new ArrayList<>();
		Sum(0,arr,ds,sum,n);
	}
	public static void Sum(int ind,int arr[],ArrayList<Integer> ds,int sum,int n){
		if(ind==n){
			if(sum==0)
				System.out.println(ds);
			return;
		}
		if(arr[ind]<=sum){
			ds.add(arr[ind]);
			Sum(ind,arr,ds,sum-arr[ind],n);
			ds.remove(ds.size()-1);
		}
		Sum(ind+1,arr,ds,sum,n);
	}
}