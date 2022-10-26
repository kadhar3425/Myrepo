import java.util.Scanner;

public class ArrayMissing{
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Array size: ");
       int n=s.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the Array Element: ");
       for(int i=0;i<n;i++)
          arr[i]=s.nextInt();
       //finding minimum in the array
       int min=100000;
       for(int i=0;i<n;i++){
           if(min>arr[i])
              min=arr[i];
       }
       //sorting the array
       for(int i=0;i<n-1;i++){
          for(int j=0;j<n-i-1;j++){
              if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
          }
       }
       //finding missing element 
       for(int i=0;i<n;i++){
           if(min!=arr[i])
                break;
          min++;
       }
      System.out.println(min);
}
}