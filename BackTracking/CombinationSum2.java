import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class CombinationSum2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Element: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println("Enter the sum: ");
		int sum=s.nextInt();
		ArrayList<Integer> ds=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		Sum(0,arr,ds,ans,sum);
		for(List a:ans)
			System.out.println(a);
	}
	public static void Sum(int ind,int arr[],ArrayList<Integer> ds,List<List<Integer>> ans,int sum){
		if(sum==0){
		    ans.add(new ArrayList<>(ds));
		    return;
		}
	   for(int i=ind;i<arr.length;i++){
		   if(i>ind&&arr[i]==arr[i-1])
			   continue;
		   if(arr[i]>sum)
			   break;
		   ds.add(arr[i]);
		   Sum(i+1,arr,ds,ans,sum-arr[i]);
		   ds.remove(ds.size()-1);
	   }
	}
}