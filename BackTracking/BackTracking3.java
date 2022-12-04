import java.util.Scanner;

public class BackTracking3{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Binary Code: ");
		String input=s.next();
		GrayCode(input,0);
	}
	public static void GrayCode(String str,int ind){
		if(ind==str.length())
			return;
		if(str.charAt(ind)=='1'){
			System.out.print(1);
			GrayCode(str,ind+1);
			return;
	    }
		else if(str.charAt(ind)!=str.charAt(ind-1)){
			System.out.print(1);
			GrayCode(str,ind+1);
			return;
		}
		System.out.print(0);
		GrayCode(str,ind+1);
	}
}