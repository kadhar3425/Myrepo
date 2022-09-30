import java.util.Scanner;

public class SubStringPalindrome{
	 public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String input=s.next();
		int index1=0;
		int index2=0;
		boolean flag=false;
		char temp=' ';
		for(int i=0;i<input.length();i++){
			temp=input.charAt(i);
			index1=i;
			for(int j=i+1;j<input.length()-1;j++){
			     if(temp!=input.charAt(j))
					  index2=j;
				 else{
					 flag=true;
					 index2=j;
					 break;
				 }	 
			}
			if(flag==true)
				break;
		}
		for(int i=index1;i<=index2;i++)
			System.out.print(input.charAt(i));
		
	 }
}