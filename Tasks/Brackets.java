import java.util.Scanner;

public class Brackets{
	 public static void main(String[] args){
		 Scanner s=new Scanner(System.in);
		 String a=s.next();
		 char b[]=a.toCharArray();
		 int c1=0,c2=0,c3=0;
		 for(int i=0;i<b.length;i++){
			 for(int j=i+1;j<=b.length-1;j++){
				 if(b[i]=='{'&&b[j]=='}'){
					 c1++;
					 b[j]=' ';
					 break;
				 }
				 else if(b[i]=='('&&b[j]==')'){
					 c2++;
					 b[j]=' ';
					 break;
				 }
				 else if(b[i]=='['&&b[j]==']'){
					c3++;
					b[j]=' ';
					break;
				 }
			 } 
		}
			         if(c1>0)
					 System.out.println("{} "+"-"+c1);
				     if(c2>0)
				     System.out.println("()"+"-"+c2);
					 if(c3>0)
				     System.out.println("[] "+"-"+c3);
		 
	 }
}
				 
				 
