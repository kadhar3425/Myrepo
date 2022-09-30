import java.util.Scanner;

public class MobileButton{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String arr[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String digits=s.next();
		if(digits.length()==1)
			System.out.print(arr[digits.charAt(0)-'2']);
		for(int i=0;i<digits.length();i++){
			for(int j=i+1;j<digits.length();j++){
			           Combination(arr,digits.charAt(i)-'0',digits.charAt(j)-'0');
			}
		}
	}
	public static void Combination(String arr[],int x,int y){
		x=x-2;
		y=y-2;
			for(int i=0;i<arr[x].length();i++){
				for(int j=0;j<arr[y].length();j++){
					System.out.print((char)arr[x].charAt(i));
					System.out.print((char)arr[y].charAt(j)+" ");
				}
			}
		
			
	}
}