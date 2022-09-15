import java.util.Scanner;

public class Compare{
 
    public static void main(String[] args){
     
          Scanner s=new Scanner(System.in);
          
          int a=s.nextInt();
          int b=s.nextInt();
          
          System.out.print((a==b)?a+"=="+b:a+"!="+b+"\t");
          System.out.print((a<b)?a+"<"+b:a+">"+b+"\t");
          System.out.print((a<=b)?a+"<="+b:a+">="+b+"\t");
     }
}
           