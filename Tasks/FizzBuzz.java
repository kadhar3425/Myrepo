import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String a[]={"Fizz","Buzz"};
		for(int i=1;i<=n;i++){
		   if(i%3==0){
			   System.out.print(a[0]);
		   }
		   else if(i%5==0){
			   System.out.print(a[1]);
		   }
		   else if(i%3==0&&i%5==0){
			   System.out.print(a[0]+a[1]);			
		   }
		   else
		       System.out.print(i+" ");
		}
	}
}