import java.util.Scanner;

public class MaximumProduct{
      static int count=0,ans=1;
      public static void main(String[] args){
          Scanner s=new Scanner(System.in);
          System.out.println("Enter the Array size: ");
          int n=s.nextInt();
          System.out.println("Enter the Array of an Element: ");
          int arr[]=new int[n];
          for(int i=0;i<n;i++)
              arr[i]=s.nextInt();
          int product=MaxProduct(arr);
          System.out.println(product);
     }
     public static int MaxProduct(int arr[]){
           int max=-1000000,k=0;
          for(int i=0;i<arr.length;i++){
             if(max<arr[i]){
                max=arr[i];
                k=i;
            }
          }
          count++;
          ans*=max;
          if(count==3)
             return ans;
         arr[k]=-10000000;
         return MaxProduct(arr); 
     }
}