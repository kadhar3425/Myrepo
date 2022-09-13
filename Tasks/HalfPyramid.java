/* Program to print half pyramid using * */
import java.util.Scanner;

public class HalfPyramid{
    public static void main(String[] args){
         Scanner s=new Scaner(System.in);
         int n=s.nextInt();
         for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
               System.out.print("*");
              }
             System.out.println();
         }
       }
 }