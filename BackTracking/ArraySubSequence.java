import java.util.Scanner;
import java.util.ArrayList;

public class ArraySubSequence{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		ArrayList<Integer> ds=new ArrayList<>();
		seq(0,arr,ds,n);
	}
	public	static void seq(int ind,int arr[],ArrayList<Integer> ds,int n){
		if(ind==n){
			System.out.println(ds);
			return;
		}
		ds.add(arr[ind]);
		seq(ind+1,arr,ds,n);
		ds.remove(ds.size()-1);
		seq(ind+1,arr,ds,n);
	}
}
