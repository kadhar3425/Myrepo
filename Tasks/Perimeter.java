import java.util.Scanner;

public class Perimeter{
     
     public static void main(String[] args){
           Scanner s=new Scanner(System.in);
             double radius=s.nextDouble();
             double area=3.141592653589793238*radius*radius;
             double perimeter=2*3.141592653589793238*radius;
             System.out.printf("%.14f",area);
             System.out.println();
             System.out.printf("%.14f",perimeter);
     }
}