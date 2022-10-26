import java.util.Scanner;

public class Array3rdLargest{
    static int count=0;
    public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the Array size: ");
            int n=s.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the Array Element: ");
            for(int i=0;i<n;i++)
                 arr[i]=s.nextInt();
            if(arr.length==2){
                 System.out.println(-1);
                 return;
            }
            int max=FindMax(arr);
          if(max==0){
             System.out.println(-1);
             return;
          }  
          System.out.println(max);
}
  public static int FindMax(int arr[]){
           int max=0,k=0;
       for(int i=0;i<arr.length;i++){
           if(max<arr[i]){
              max=arr[i];
              k=i;
            }     
       }
       count++;
       if(count==3)
           return max;
       arr[k]=0;
       return FindMax(arr);
  }
}
                  