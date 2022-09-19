import java.util.Scanner;

public class Coordinators{

   public static void main(String[] args){
     
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        Greater(arr,0,n-1);               
 }
  public static void Greater(int arr[],int start,int end){
         int max=0;
         int index=0;
         for(;start<=end;start++){
             if(max<arr[start]){
                 max=arr[start];
                 index=start;
              }
          }
         System.out.print(max+" ");
         max=0;
         index++;
        for(;index<=end;index++){
            if(max<arr[index])
                max=arr[index];
        }
        if(max!=0)
          System.out.print(max);
  }
}