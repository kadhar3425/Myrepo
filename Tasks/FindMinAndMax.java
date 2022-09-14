import java.util.Scanner;

public class FindMinAndMax{
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
           arr[i]=s.nextInt();
       int min=arr[0];
       int max=arr[n-1];
       for(int i=0;i<n;i++){
          if(min>arr[i])
             min=arr[i];
          if(max<arr[i])
             max=arr[i];
        }
        System.out.println(min);
        System.out.println(max);
   }
}