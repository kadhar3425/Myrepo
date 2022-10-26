import java.util.Scanner;

public class ArrayWave{
      public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int n=s.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the array Element: ");
            for(int i=0;i<n;i++)
               arr[i]=s.nextInt();
            for(int i=0;i<n-1;i+=2){
               if(arr[i]<arr[i+1]){
                  int temp=arr[i];
                  arr[i]=arr[i+1];
                  arr[i+1]=temp;   
               }      
            }
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
      }
}