import java.util.Scanner;
public class Login{
	static String a[]=new String[10];
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=0;
		do{
			System.out.println("Press Below Number to proceed: ");
			System.out.println("1.Admin");
			System.out.println("2.User");
			System.out.println("3.Exit");
			n=s.nextInt();
			switch(n){
				case 1:{
					int a=0;
					do{
                    System.out.println("Press Below Number to proceed: ");
	       			System.out.println("1.AdminSignUp");
					System.out.println("2.AdminSignIn");
					System.out.println("3.Exit");
					a=s.nextInt();
					switch(a){
						case 1:{
							AdminSignUp();
							break;
						}
						case 2:{
                             AdminSignIn();
                             break;
						}
					}
				    }while(a!=3);
				    break;
				}
				case 2:{
					int u=0;
					do{
                    System.out.println("Press Below Number to proceed: ");
	       			System.out.println("1.UserSignUp");
					System.out.println("2.UserSignIn");
					System.out.println("3.Exit");
					u=s.nextInt();
					switch(u){
						case 1:{
							UserSignUp();
							break;
						}
						case 2:{
                             UserSignIn();
                             break;
						}
					}
				}while(u!=3);
				break;
			   }
			}
	}while(n!=3);
}
	public static void AdminSignUp(){
		 Scanner s=new Scanner(System.in);
		 System.out.println("--------AdminSignUp-------------");
		 System.out.println("Enter the UserName: ");
		 String uname=s.next();
		 a[0]=uname;
		 int l=8;
		 while(true){
		 	System.out.println("Enter the password(within 8 character): ");
		 	String password=s.next();
            if(password.length()>=l){
            	a[1]=password;
            	break;
            }
            else
            	System.out.println("Invalid password must be 8 character or Equal.....");
		 }
		 while(true){
            System.out.println("Enter the Mobile Number: ");
		    String Mob=s.next();
		    if(Mob.length()==10){
		    	a[2]=Mob;
		    	break;
		    }
		    else
		    	System.out.println("Invalid Mobile Number.......");
		 }
         System.out.println("AdminSign up SuccessFull......");
	}
	public static void AdminSignIn(){
		 Scanner s=new Scanner(System.in);
		 System.out.println("--------AdminSignIn-------------");
		 while(true){
		 System.out.println("Enter the UserName: ");
		 String uname=s.next();
		 System.out.println("Enter the password: ");
		 String password=s.next();
		 if(uname.equals(a[0])&&password.equals(a[1])){
		 	    System.out.println("Login SuccessFull....");
		 	    break;
		 }
		 else
		 	System.out.println("Invalid UserName And password....");
		}
		System.out.println("AdminSign in SuccessFull......");

	}
	public static void UserSignUp(){
		 Scanner s=new Scanner(System.in);
		 System.out.println("--------UserSignUp-------------");
		 System.out.println("Enter the UserName: ");
		 String uname=s.next();
		 a[0]=uname;
		 int l=8;
		 while(true){
		 	System.out.println("Enter the password(within 8 character): ");
		 	String password=s.next();
            if(password.length()>=l){
            	a[1]=password;
            	break;
            }
            else
            	System.out.println("Invalid password must be 8 character or Equal.....");
		 }
		 while(true){
            System.out.println("Enter the Mobile Number: ");
		    String Mob=s.next();
		    if(Mob.length()==10){
		    	a[2]=Mob;
		    	break;
		    }
		    else
		    	System.out.println("Invalid Mobile Number.......");
		 }
		 System.out.println("UserSign up SuccessFull......");

	}
	public static void UserSignIn(){
		 Scanner s=new Scanner(System.in);
		 System.out.println("--------UserSignIn-------------");
		 while(true){
		 System.out.println("Enter the UserName: ");
		 String uname=s.next();
		 System.out.println("Enter the password: ");
		 String password=s.next();
		 if(uname.equals(a[0])&&password.equals(a[1])){
		 	    System.out.println("Login SuccessFull....");
		 	    break;
		 }
		 else
		 	System.out.println("Invalid UserName And password....");
		}
        System.out.println("UserSign in SuccessFull......");
	}
}