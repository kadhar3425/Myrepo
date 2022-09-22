import java.util.Scanner;

public class StringPalindrome{

  	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
                String str=s.nextLine();
                String org="";
                String rev="";
                for(int i=0;i<str.length();i++){
  			if('a'<=str.charAt(i)&&str.charAt(i)<='z'||'A'<=str.charAt(i)&&str.charAt(i)<='Z')
                                 org=org+str.charAt(i);
                }
                for(int i=org.length()-1;i>=0;i--)
                        rev=rev+org.charAt(i);
                boolean flag[]=new boolean[str.length()];
                for(int i=0;i<org.length();i++){
                       if(org.charAt(i)==rev.charAt(i))
                             flag[i]=true;
                }
		for(int i=0;i<flag.length;i++){
                     if(flag[i]==false){
                          System.out.println("Not Palindrome");
                          break;
			}
                      else{
			   System.out.println("Palindrome");
                           break;
                         }
                  }
           }
}
                         
                          