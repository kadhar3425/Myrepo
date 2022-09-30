import java.util.Scanner;

public class StringLexico{
     public static void main(String[] args){
          Scanner s=new Scanner(System.in);
          String input=s.next();
          boolean flag[]=new boolean[input.length()];
          for(int i=0;i<input.length();i++){
               if(flag[i]==true)
                  continue;
              for(int j=i+1;j<input.length();j++)
                  if(input.charAt(i)==input.charAt(j))
                         flag[j]=true;
				System.out.print(input.charAt(i));
          }
    }
}