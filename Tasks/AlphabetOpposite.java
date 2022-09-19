import java.util.Scanner;
public class AlphabetOpposite {
       public static void main(String[] args) {
    	   Scanner s=new Scanner(System.in);
    	   String input=s.next();
    	   char lower ='a';
    	   char upper='A';
    	   int temp=0;
    	   for(int i=0;i<input.length();i++) {
    		   if('a'<=input.charAt(i)&&input.charAt(i)<='z') {
    			   temp='z'-input.charAt(i);
    			   System.out.printf("%c",lower+temp);
    		   }
    		   else if('A'<=input.charAt(i)&&input.charAt(i)<='Z') {
    			   temp='Z'-input.charAt(i);
    			   System.out.printf("%c",upper+temp);
    		   }
    	   }
       }
}
