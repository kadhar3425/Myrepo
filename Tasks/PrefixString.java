import java.util.Scanner;

public class PrefixString{
     public static void main(String[] args){
             Scanner s=new Scanner(System.in);
             int n=s.nextInt();
             String a[]=new String[n];
             for(int i=0;i<n;i++)
                 a[i]=s.next();
             String ans=a[0];
             for(int i=1;i<=n-1;i++){
                  ans=Common(ans,a[i]);
             }
             System.out.println(ans);
     }
     public static String Common(String str1,String str2){
             String ans="";
             int n=str1.length(),m=str2.length();
             for(int i=0,j=0;i<=n-1 && j<=m-1;i++,j++){
                  if(str1.charAt(i)!=str2.charAt(j))
                         break;
                 ans+=str1.charAt(i);
             }
          return ans;
    }
}