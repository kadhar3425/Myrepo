import java.util.Scanner;

public class Union{
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Array1 size: ");
       int m=s.nextInt();
       System.out.println("Enter the Array1 Element: ");
       int arr1[]=new int[m];
       for(int i=0;i<m;i++)
            arr1[i]=s.nextInt();
       System.out.println("Enter the Array2 size: ");
       int n=s.nextInt();
       System.out.println("Enter the Array2 Element: ");
       int arr2[]=new int[n];
       for(int i=0;i<n;i++)
            arr2[i]=s.nextInt();       
      int temp[]=new int[m+n];
      int k=0;
      for(int i=0;i<arr1.length;i++)
           temp[k++]=arr1[i];
      for(int i=0;i<arr2.length;i++)
           temp[k++]=arr2[i];
      for(int i=0;i<k-1;i++){
          for(int j=0;j<k-i-1;j++){
             if(temp[j]>temp[j+1]){
                 int nothing=temp[j];
                 temp[j]=temp[j+1];
                 temp[j+1]=nothing;
              }
          }
      }
     boolean flag[]=new boolean[k];
     for(int i=0;i<k;i++){
           if(flag[i]==true)
               continue;
        for(int j=i+1;j<k;j++){
             if(temp[i]==temp[j]){
                flag[j]=true;
             }
        }
        System.out.print(temp[i]+" ");
     }
}
}
       
       