import java.util.Scanner;
public class Brackets{
    public static void main(String[] args){
         Scanner s=new Scanner(System.in);
         String input=s.next();
         int count=0;
         for(int i=0;i<input.length()-1;i+=2){
              char first=input.charAt(i);
              char second=input.charAt(i+1);
              char closing=Parenthese(first);
              if(closing!=second){
                  System.out.println("false");
                  break;
               }
              else{
                  count++;
               }
              System.out.println("true"+" "+first+second+"-"+count);
              count=0;
         }
         
   }
   public static char Parenthese(char a){
        switch(a){
           case '(':
                return ')';
           case '{':
                return  '}';
           case  '[':
                 return ']';
           case  '<':
                  return '>';
           default:
                  return ' ';
           }
   }
   
}