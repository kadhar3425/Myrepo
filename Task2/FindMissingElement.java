import java.util.Scanner;

public class FindMissingElement{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array1 size: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array1 element: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println("Enter the array2 size: ");
        int m=s.nextInt();
        int arr1[]=new int[m];
        System.out.println("Enter the array2 element: ");
        for(int i=0;i<m;i++)
            arr1[i]=s.nextInt();
        boolean flag[]=new boolean[n];
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(arr[i]==arr1[j]){
                   flag[i]=true;
                   break;
              }
           }
        }
        for(int i=0;i<n;i++){
           if(flag[i]==false)
               System.out.print(arr[i]+" ");
        }
}
}