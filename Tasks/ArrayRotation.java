/* Given an array,rotate the array by one position in clock wise directions*/
import java.util.Scanner;
public class ArrayRotation
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
            A[i]=s.nextInt();
        reverse(A,0,n-1);
        reverse(A,1,n-1);
        for(int i=0;i<n;i++)
           System.out.print(A[i]+" ");
        
        
	}
	public static void reverse(int arr[],int start,int end){
	     while(start<=end){
	         int temp=arr[start];
	            arr[start]=arr[end];
	            arr[end]=temp;
	            start++;
	            end--;
	     }
	}
}
       