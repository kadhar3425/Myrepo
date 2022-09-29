import java.util.Scanner;
public class Library{
	static Scanner s=new Scanner(System.in);
	static Login log1=new Admin();
	static Login log2=new User();
	static Admin admin=new Admin();
	public static void main(String[] args){
		int n=0;
		do{
			System.out.println("1.CreateAccount");
			System.out.println("2.LoginAccount");
			System.out.println("3.Exit");
			n=s.nextInt();
			switch(n){
				case 1:{
                    log1.CreateAccount(log1);
					break;
				}
				case 2:{
					while(true){
					System.out.println("1.Admin");
					System.out.println("2.User");
					System.out.println("3.exit");
					n=s.nextInt();
					if(n==1){
						log1.LoginAccount(log1);
						break;
					}
					else if(n==2){
						log2.LoginAccount(log2);
						log2.AdminTemplate(admin);
						break;
					}
					else
						break;
					}
				}
			}
		}while(n!=3);
	}
}
class Data{
	int id;
	int price;
	String BookName;
	String Author;
}
abstract class Login{
	abstract public void setdetails(String username,String password);
	abstract public String getPassword();
	abstract public String getUserName();
	Scanner s=new Scanner(System.in);
	public void CreateAccount(Login log){
		log.details(log);
        System.out.println("Account created....");}
	public void LoginAccount(Login log){
		while(true){
	    log.details(log);
		if(log.checkDetails(log)){
			System.out.println("Login successFull");
		    break;
		}
		else
			System.out.println("Invalid....");}}
	public void details(Login log){
		while(true){
		System.out.println("Enter the username");
		String username=s.next();
		System.out.println("Enter the password");
		String password=s.next();
		if(password.length()>=8){
		   log.setdetails(username,password);
		   break;}
		else
			System.out.println("Invalid....");}}
	public boolean checkDetails(Login log){
		return(log.username.equals(username)&&log.password.equals(password));}
	public void Add(Data data[],int num){
		for(int i=0;i<n;i++){
			System.out.println("Enter the Id number: ");
			data[i].id=s.nextInt();
			System.out.println("Enter the price number: ");
			data[i].price=s.nextInt();
			System.out.println("Enter the BookName: ");
			data[i].BookName=s.next();
			System.out.println("Enter the  Author: ");
			data[i].Author=s.next();}}
	public void remove(Data data[],int num){
		data[i]=null;
		for(int i=0;i<data.length;i++){
			if(data[i]==null){
				data[i]=data[i+1];
				data[i+1]=null;}}}
	public void view(Data data[]){
		for(int i=0;i<data.length;i++){
			System.out.print(data[i].id+"");
			System.out.print(data[i].price+"");
			System.out.print(data[i].BookName+"");
			System.out.print(data[i].Author+"");}}
	public AdminTemplate(){
		int n=0;
		do{
			System.out.println("1.view");
			System.out.println("2.Add");
			System.out.println("3.update");
			System.out.println("4.delete");
			System.out.println("5.Exit");
			n=s.nextInt();
			switch(n){
				case 1:{
					view(data);
					break;
				}
				case 2:{
					System.out.println("How many Book do you want to store?");
					int num=s.nextInt();
					Add(data,num)
					break;
				}
				case 3:{
					System.out.println("Enter the index:");
					int num=s.nextInt();
					System.out.println("Enter the id:");
					int id=s.nextInt();
					System.out.println("Enter the price:");
					int price=s.nextInt();
					System.out.println("Enter the BookName:");
					String BookName=s.next();
					System.out.println("Enter the Author:");
					String Author=s.next();
					admin.Update(data,id,price,BookName,Author,num);
					break;
				}
				case 4:{
					System.out.println("Enter the index: ");
					int index=s.nextInt();
					log1.remove(data,index);
					break;}}}while(n!=5);}
					public void userTemplate(User user){
						int n=0;
	            	do{
						System.out.println("1.view");
						System.out.println("2.Buy");
						System.out.println("3.Read");
						System.out.println("4.Exit");
						n=s.nextInt();
						switch(n){
							case 1:{
								log1.view(log1);
								break;
							}
							case 2:{
								System.out.println("Enter the sno");
								int num=s.nextInt();
								log1.remove(data,num);
								break;
							}
						}
					}while(n!=4);
					}
class Admin{
	private String username="kadhar";
	private String password="kadhar@123";
	public void setdetails(String username,String password){
		this.username=username;
		this.password=password;}
	public String getPassword(){
		return password;}
	public Sting getUserName(){
		return username;}
	public void Update(Data data[],int id,int price,String BookName,String Author,int num){
		data[num].id=id;
		data[num].price=price;
		data[num].BookName=BookName;
		data[num].Author=Author;
	}
}
class User{
	private String username="";
	private String password="";
	public void setdetails(String username,String password){
		this.username=username;
		this.password=password;}
	public String getPassword(){
		return password;}
	public Sting getUserName(){
		return username;}}