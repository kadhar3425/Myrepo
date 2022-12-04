import java.util.Scanner;
import java.util.ArrayList;
public class SubSequenceSum2{
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
		ArrayList<Integer> ds=new ArrayList<>();
		seq(0,arr,ds,0,sum,n);
	}
	public static void seq(int ind,int arr[],ArrayList<Integer> ds,int s,int sum,int n){
	    if(s==sum){
           System.out.println(ds);
		   return;
		}
        for(int i=ind;i<n;i++){
			if(i>ind&&arr[i]==arr[i-1])
				continue;
			ds.add(arr[i]);
			s+=arr[i];
			seq(i+1,arr,ds,s,sum,n);
			ds.remove(ds.size()-1);
			s-=arr[i];
		}			
	}
}