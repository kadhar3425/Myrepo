import java.util.Scanner;

public class Main{
	static Scanner s=new Scanner(System.in);
	static NameBook obj=new NameBook();
	public static void main(String[] args){
		int n=0;
	    do{
			System.out.println("-----Home------");
			System.out.println("1.Admin");
			System.out.println("2.User");
			System.out.println("3.Exit");
			n=s.nextInt();
			switch(n){
				case 1:
				   AdminMenu();
				   break;
				case 2:
				   UserMenu();
				   break;}}while(n!=3);}
	public static void AdminMenu(){
		int n=0;
		do{
			System.out.println("------Admin-----");
			System.out.println("1.Add");
			System.out.println("2.View");
			System.out.println("3.Delete");
			System.out.println("4.Update");
			System.out.println("5.Exit");
			n=s.nextInt();
			switch(n){
				case 1:{
					System.out.println("How Many member do you want to add?");
					int index=s.nextInt();
				    obj.setName(index);
					break;}
			    case 2:{
				    obj.viewName();
					break;}
				case 3:{
				    System.out.println("Enter the index: ");
					int index=s.nextInt();
				    obj.Delete(index);
					break;}
				case 4:{
				    System.out.println("Enter the index no: ");
					int index=s.nextInt();
					System.out.println("Enter the id: ");
					int id=s.nextInt();
					System.out.println("Enter the price:");
					int price=s.nextInt();
					System.out.println("Enter the BookName:");
					String BookName=s.next();
				    obj.upDate(index,id,price,BookName);
					break;}}}while(n!=5);}
	public static void UserMenu(){
		System.out.println("-----Home--------");
		System.out.println("1.View");
		System.out.println("2.Exit");
		int n=s.nextInt();
		if(n==1){
			obj.viewName();
			UserMenu();}}}
class NameBook{
	private Data data[];
	Scanner s=new Scanner(System.in);
	private int top=0;
	private int size=5;
	public NameBook(){
		data=new Data[size];
		for(int i=0;i<size;i++)
			data[i]=new Data();
	}
	public void setName(int no){
		if(!isFull()){
	     for(int i=0;i<no;i++){
			 System.out.println("Enter the id:");
			 data[i].id=s.nextInt();
			 System.out.println("Enter the price:");
			 data[i].price=s.nextInt();
			 System.out.println("Enter the BookName:");
			 data[i].BookName=s.next();
			 top++;}}
		else
		   System.out.println("Stack is Full");}
	public boolean isFull(){
		return size==top;}
	public void viewName(){
	   for(int i=0;i<data.length;i++){
		   if(data[i].id!=0&&data[i].price!=0&&data[i].BookName!=null){
		   System.out.println("sno   id   price  BookName");
		   System.out.println(i+" - "+data[i].id+" "+data[i].price+" "+data[i].BookName);}}}
	public void upDate(int no,int id,int price,String BookName){
		data[no].id=id;
		data[no].price=price;
		data[no].BookName=BookName;}
	public void Delete(int no){
		data[no]=null;
		for(int i=0;i<data.length-1;i++){
			if(data[i]==null){
				data[i]=data[i+1];
				data[i+1]=null;}}}
}
class Data{
	int id;
	int price;
	String BookName;
}
