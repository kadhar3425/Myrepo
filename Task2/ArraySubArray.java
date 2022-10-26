import java.util.Scanner;

public class ArraySubArray{
     public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=s.nextInt();
	System.out.println("Enter the array element: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println("Enter the sum value: ");
	int sum=s.nextInt();
        int curr_sum=0,index1=0,index2=0;
        for(int i=0;i<n;i++){
             curr_sum+=arr[i];
             if(curr_sum==sum)
                 index2=i;
             if(curr_sum>sum){
                i=index1;
                index1++;  
                curr_sum=0;
             }        
        } 
            System.out.println(index2);
}
}