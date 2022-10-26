import java.util.Scanner;

public class MakePalindrome{
   public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String: ");
      String input=s.next();
      String missing="";
      String rev="";
      for(int i=0,j=input.length()-1;i<input.length()&&j>=0;i++,j--){
            if(input.charAt(i)!=input.charAt(j)){
               missing+=input.charAt(j);
               i--;
            }
      }
      rev+=append(missing);
      rev+=append(input);
      System.out.println(rev);
}
  public static String append(String str){
       String ans="";      
        for(int i=0;i<str.length();i++)
             ans+=str.charAt(i);
      return ans;
  }
}
                  
      
      
