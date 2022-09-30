import java.util.Scanner;
public class MakeLargest{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		String rev="";
		for(int i=n-1;i>=0;i--){
			while(arr[i]!=0){
				rev+=arr[i]%10;
				arr[i]/=10;
			}
		}
		System.out.println(rev);
	}
}