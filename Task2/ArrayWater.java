import java.util.Scanner;

public class ArrayWater{
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the array size: ");
       int n=s.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the array elements: ");
       for(int i=0;i<n;i++)
           arr[i]=s.nextInt();
       int total=0;
       for(int i=0;i<n;i++){
           if(arr[i]==0||arr[0]>=arr[i]){
              int curr_sum=arr[0]-arr[i];
              total+=curr_sum;
           }
        }
      System.out.println(total);
 }
}