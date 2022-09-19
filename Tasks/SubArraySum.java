import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
        	 arr[i]=s.nextInt();
         int sum=s.nextInt();
         int value,i,j;
         for(i=0;i<n;i++) {
        	 value=arr[i];
        	 for(j=i+1;j<=n;j++) {
        		 if(value==sum) {
        			 int p=j-1;
        			 System.out.println("true");
        		 }
        	 }
        	 if(value>sum||j==n)
        		 break;
        	 value=value+arr[j];
         }
         System.out.println("false");
    }
} 
