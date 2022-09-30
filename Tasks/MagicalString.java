import java.util.Scanner;

public class MagicalString{
	   public static void main(String[] args){
		   Scanner s=new Scanner(System.in);
		   String magic="1221121221221121122";
		   int n=s.nextInt();
		   int count=0;
		   for(int i=0;i<n;i++){
			   if(magic.charAt(i)=='1')
				   count++;
		   }
		   System.out.println(count);
	   }
	}