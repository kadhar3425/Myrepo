import java.util.Scanner;

public class StringCompare{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the StringArray1 size: ");
    int n=s.nextInt();
    System.out.println("Enter the StringArray1 Element: ");
    String input[]=new String[n];
    for(int i=0;i<n;i++)
        input[i]=s.next();
    System.out.println("Enter the StringArray2 size: ");
    int m=s.nextInt();
    System.out.println("Enter the StringArray2 Element: ");
    String input1[]=new String[m];
    for(int i=0;i<m;i++)
        input1[i]=s.next();
    String word1=Concate(input);
    String word2=Concate(input1);
    System.out.println(CheckEquals(word1,word2));
 }
  public static String Concate(String str[]){
      String ans="";
      for(int i=0;i<str.length;i++)
            ans+=str[i];
     return ans;
  }
  public static boolean CheckEquals(String word1,String word2){
       boolean ans=true;
       for(int i=0,j=0;i<word1.length()&&j<word2.length();i++,j++){
               if(word1.charAt(i)!=word2.charAt(j))
                          return false;
        }
       return ans;
  }
}
