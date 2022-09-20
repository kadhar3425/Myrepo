import java.util.Scanner;

public class NumberOccurences {
     public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int arr[]=new int[n];
	     for(int i=0;i<n;i++)
	    	 arr[i]=s.nextInt();
	     boolean flag[]=new boolean[n];
	     for(int i=0;i<n;i++) {
	    	 if(flag[i]==true)
	    		 continue;
	    	 int count=1;
	    	 for(int j=i+1;j<n;j++) {
	    		 if(arr[i]==arr[j]) {
	    			 flag[j]=true;
	    			 count++;
	    		 }
	    	 }
	    	 System.out.println(arr[i]+" "+count);
	     }
	}
}