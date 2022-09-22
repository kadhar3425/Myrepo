import java.util.Scanner;

public class SumOfPair{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int sum=s.nextInt();
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
			if(arr[i]+arr[j]==sum)
				  System.out.printf("(%d,%d)",arr[i],arr[i+1]);
			}
		}
	}
}