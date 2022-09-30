import java.util.Scanner;
class StringRepetition{
	public static void main(String[] args){
	     Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 String input=s.next();
		 for(int i=0;i<n;i++)
			 System.out.print(input);
	}
}