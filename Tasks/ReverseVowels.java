/*Given a string ,reverse only vowels in it,leaving rest of the string as it 
  is 
   input : abcdef
   output : ebcdaf
*/

import java.util.Scanner;

public class ReverseVowels{

  public static void main(String[] args){

       Scanner s=new Scanner(System.in);

       String input=s.nextLine();
       System.out.println(reverseVowels(input));
}
  public static boolean Vowels(char c){
     return (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'
             ||c=='O'||c=='u'||c=='U');
   }
   public static void reverseVowels(String str){
        int i=0;
        int j=str.length()-1;
        char[] str1=str.toCharArray();
        while(i<j){
           if(!Vowels(str1[i])){
              i++;
              continue;
            }
           if(!Vowels(str1[j])){
               j--;
               continue;
            }
           char temp =str1[i];
            str1[i]=str1[j];
            str1[j]=str[temp];
            i++;
            j--;
          }
          return str2;
      }
 }
                    