import java.util.Scanner;

public class PreLarge{
     public static void main(String[] args){
           Scanner s=new Scanner(System.in);
           System.out.println("Enter the array size: ");
           int n=s.nextInt();
           int arr[]=new int[n];
           System.out.println("Enter the array Element: ");
           for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
	   int pre=0;
           for(int i=0;i<n;i++){
               int max=arr[i];
               for(int j=i+1;j<n;j++){
                    if(max>arr[j]){
                         if(pre<max){
                             pre=max;
                             System.out.print(arr[i]+" ");
                             break;
                         }
                    }
                    else if(arr[j]>max){
                       if(pre<arr[j]){
                           pre=arr[j];
                           System.out.print(arr[j]+" ");
                           break;
                       }
                    }
               }
            }
          
}
}