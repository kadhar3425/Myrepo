import java.util.Scanner;

public class ArrayDifference{
     public static void main(String[] args){
          Scanner s=new Scanner(System.in);
          System.out.println("Enter the array1 size: ");
          int n=s.nextInt();
          System.out.println("Enter the array1 element: ");
          int arr[]=new int[n];
          for(int i=0;i<n;i++)
               arr[i]=s.nextInt();
          System.out.println("Enter the array2 size: ");
          int m=s.nextInt();
          System.out.println("Enter the array2 element: ");
          int arr2[]=new int[m];
          for(int i=0;i<m;i++)
               arr2[i]=s.nextInt();
          int index=0;
          int k=0;
          for(int i=0;i<n;i++){
              if(arr[i]!=arr2[k++]){
                    index=i;
                    break;
              }
         }
        System.out.println(index);
}
 }