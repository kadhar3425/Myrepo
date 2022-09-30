import java.util.Scanner;

public class ProgramPattern{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String input=s.next();
		char a[]=new char[input.length()];
		int len=(input.length()-1)*2;
		int k=0;
		for(int i=input.length()/2;i<input.length();i++)
			a[k++]=input.charAt(i);
		for(int i=0;i<input.length()/2;i++)
			a[k++]=input.charAt(i);
		for(int i=0;i<input.length();i++){
			if(len>i)
				System.out.print(" ");
			 for(int j=0;j<i+1;j++)
				System.out.print(a[j]);
		   len-=2;
		   System.out.println();
		}
		}
}