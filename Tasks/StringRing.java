import java.util.Scanner;

public class StringRing{

   public static void main(String[] args){
         Scanner s=new Scanner(System.in);
     
         int n=s.nextInt();
         String S[]=new String[n];
        for(int i=0;i<n;i++)
             S[i]=s.next();
        int num=1;
        for(int i=0;i<n-1;i++){
           if(S[i].charAt(S[i].length()-1)==S[i+1].charAt(0))
                 num++;
          }
        if(S[n-1].charAt(S[n-1].length()-1)==S[0].charAt(0))
                 num++;
        if(num!=1)
             System.out.println(num);
        else
             System.out.println(-1);
   }
}