import java.util.Scanner;

public class Median{
     public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Array1 Size: ");
        int n=s.nextInt();
        System.out.println("Enter the Array1 Element: ");
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=s.nextInt();
        System.out.println("Enter the Array2 Size: ");
        int m=s.nextInt();
        System.out.println("Enter the Array2 Element: ");
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
            arr2[i]=s.nextInt();
        int temp[]=new int[m+n];
        int k=0;
        for(int i=0;i<n;i++)
             temp[k++]=arr1[i];
        for(int i=0;i<m;i++)
             temp[k++]=arr2[i];
        for(int i=0;i<k-1;i++){
           for(int j=0;j<k-i-1;j++){
               if(temp[j]>temp[j+1]){
                  int noth=temp[j];
                  temp[j]=temp[j+1];
                  temp[j+1]=noth;
              }
           }
        }
      if(k%2!=0){
         System.out.println(temp[k/2]);
         return;
      }
      double ans=temp[(k-1)/2]+0.5;
      System.out.println(ans);
}
}