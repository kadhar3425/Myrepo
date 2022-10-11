package ZohoInc;

import java.util.Scanner;

public class BookingMain {
	static Details1[] data=new Details1[20];
	static int sno;
	static Scanner s=new Scanner(System.in);
   public static void main(String[] args) {
	  boolean end=false;
	  while(!end){
		  System.out.println("1.Book ");
		  System.out.println("2.cancel");
		  System.out.println("3.Availbe Tickets");
		  System.out.println("4.Booked Tickets");
		  System.out.println("5.Exit");
		  int n=s.nextInt();
		  switch(n) {
		  case 1:{
			  System.out.println("Enter the How many tickets? ");
			  n=s.nextInt();
			  generate(n);
			  ticket(n);
			  break;
		  }
		  case 2:{
			  System.out.println("Enter the How many tickets? ");
			  n=s.nextInt();
			  cancelTicket(n);
			  break;
		  }
		  case 3:{
			  
		  }
		  case 5:{
			  end=true;
			  break;
		  }
		  }
	  }
 }
 public static void generate(int n) {
	  for(;sno<n;sno++) {
      System.out.println("Enter the Name: ");
      String name=s.next();
      System.out.println("Enter the Age: ");
      int age=s.nextInt();
      System.out.println("Enter the Gender: ");
      String gender=s.next();
      data[sno]=new Details1(name,age,gender);
	  }    
 }
 public static void ticket(int n) {
    for(int i=0;i<n;i++) {
    	if(data[i].getAge()<5) {
    		data[i].setBirth("Child");
    		data[i].setAmount(200);
    		data[i].sno++;
    		System.out.println("Child ticket is booked...");
    	}
    	else if(data[i].getAge()>=60) {
    			System.out.println("------------BirthPreference----------");
    			System.out.println("Enter the ur choice: ");
    			System.out.println("1.Select My Choice");
    			System.out.println("2.Select Default: ");
    			int bno=s.nextInt();
    			if(bno==1) {
    			while(true) {
    			System.out.println("Enter the birth: ");
    			System.out.println("1.lowbirth");
    			System.out.println("2.middlebirth");
    			System.out.println("3.upperbirth");
    			int n1=s.nextInt();
    			if(Details1.LB!=0&&n1==1) {
    				data[i].setBirth("lowberth");
    				data[i].LB--;
    				data[i].sno++;
    				data[i].setAmount(400);
    				data[i].setBirth("lowerberth");
    				System.out.println("LowerBirth is Booked.....");
    				break;
    			}
    			else if(Details1.LB==0&&n1==1) {
    				System.out.println("Low berth is full");
    				continue;
    			}
    			if(Details1.MB!=0&&n1==2) {
    				data[i].setBirth("middlebirth");
    				data[i].MB--;
    				data[i].sno++;
    				data[i].setAmount(400);
    				data[i].setBirth("middleberth");
    				System.out.println("MiddleBirth is Booked.....");
    				break;
    			}
    			else if(Details1.MB==0&&n1==2) {
    				System.out.println("Middle berth is full");
    				continue;
    			}
    			if(Details1.UB!=0&&n1==3) {
    				data[i].setBirth("upperbirth");
    				data[i].UB--;
    				data[i].sno++;
    				data[i].setAmount(400);
    				data[i].setBirth("upperberth");
    				System.out.println("UpperBirth is Booked.....");
    				break;
    			}
    			else if(Details1.UB==0&&n1==3) {
    				System.out.println("Upper berth is full");
    				continue;
    			}
    			if(Details1.RAC!=0) {
    				data[i].RAC--;
    				data[i].sno++;
    				data[i].setBirth("RAC");
    				System.out.println("RAC is Booked.....");
    				data[i].setAmount(400);
    			    break;
    			}
    			else if(data[i].WL!=0) {
    				data[i].WL--;
    				data[i].setBirth("WL");
    				data[i].setAmount(400);
    				System.out.println("Waiting list Booked....");
    				break;
    			}
    			else {
    				System.out.println("No tickets available....");
    				break;
    			}
    		}
    			}
    		if(n==2) {
    			if(Details1.LB!=0) {
    				data[i].setBirth("lowberth");
    				data[i].LB--;
    				data[i].sno++;
    				data[i].setAmount(400);
    				data[i].setBirth("lowerberth");
    				System.out.println("LowerBirth is Booked.....");
    				break;
    			}
    			if(Details1.MB!=0) {
    				data[i].setBirth("middlebirth");
    				data[i].MB--;
    				data[i].sno++;
    				data[i].setAmount(400);
    				data[i].setBirth("middleberth");
    				System.out.println("MiddleBirth is Booked.....");
    				break;
    			}
    			if(Details1.UB!=0) {
    				data[i].setBirth("upperbirth");
    				data[i].UB--;
    				data[i].sno++;
    				data[i].setAmount(400);
    				data[i].setBirth("upperberth");
    				System.out.println("UpperBirth is Booked.....");
    				break;
    			}
    			if(Details1.RAC!=0) {
    				data[i].RAC--;
    				data[i].sno++;
    				data[i].setBirth("RAC");
    				System.out.println("RAC is Booked.....");
    				data[i].setAmount(400);
    			    break;
    			}
    			else if(data[i].WL!=0){
    				data[i].WL--;
    				data[i].setBirth("WL");
    				data[i].setAmount(400);
    				System.out.println("Waiting list Booked....");
    				break;
    			}
    			else {
    				System.out.println("No tickets available....");
    				break;
    			}
    		}	
    	}
    	else if(data[i].getAge()>5&&data[i].getAge()<60) {
    		while(true) {
    			System.out.println("Enter the ur choice: ");
    			System.out.println("1.lowbirth");
    			System.out.println("2.middlebirth");
    			System.out.println("3.upperbirth");
    			int n2=s.nextInt();
    			if(data[i].LB!=0&&n2==1) {
    				data[i].LB--;
    				data[i].setAmount(400);
    				data[i].setBirth("lowbirth");
    				data[i].sno++;
    				System.out.println("Low birht is Booked....");
    				break;
    			}
    			else if(data[i].LB==0&&n2==1) {
    				System.out.println("lowbirth is full");
    				continue;
    			}
    			if(data[i].MB!=0&&n2==2) {
    				data[i].MB--;
    				data[i].setAmount(400);
    				data[i].setBirth("middlebirth");
    				data[i].sno++;
    				System.out.println("middle birth is Booked....");
    				break;
    			}
    			else if(data[i].MB==0&&n2==2) {
    				System.out.println("middle birth is full....");
    				continue;
    			}
    			if(data[i].UB!=0&&n2==2) {
    				data[i].UB--;
    				data[i].setAmount(400);
    				data[i].setBirth("upperbirth");
    				data[i].sno++;
    				System.out.println("upper birth is Booked....");
    				break;
    			}
    			else if(data[i].UB==0&&n2==2) {
    				System.out.println("upper birth is full....");
    				continue;
    			}
    			if(data[i].RAC!=0) {
    				data[i].RAC--;
    				data[i].setAmount(400);
    				data[i].setBirth("RAC");
    				data[i].sno++;
    				System.out.println("RAC is Booked....");
    				break;
    			}
    			else if(data[i].WL!=0) {
    				data[i].WL--;
    				data[i].setAmount(400);
    				data[i].setBirth("WL");
    				System.out.println("WaitingList is Booked....");
    				break;
    			}
    			else {
    				System.out.println("No tickets is Available...");
    				break;
    			}
    		}
    		}
    	}
    }
    public static void cancelTicket(int n) { 
           for(int i=0;i<n;i++) {
        	  System.out.println("Enter the Name: ");
        	  String name=s.next();
        	  System.out.println("Enter the Age: ");
        	  int age=s.nextInt();
        	  System.out.println("Enter the birth: ");
        	  System.out.println("1.lowbirth");
        	  System.out.println("2.middlebirth");
        	  System.out.println("3.upperbirth");
        	  int bno=s.nextInt();
        	  if(name.equals(data[i].getName())&&bno==1) {
        		   for(int k=i+1;k<data.length;k++) {
        			   if(data[k]!=null) {
        				   if(data[k].getBirth()=="RAC") {
        				   data[i].setName(data[k].getName());
        				   data[i].setAge(data[k].getAge());
        				   data[i].setGender(data[k].getGender());
        				   data[i].setBirth(data[k].getBirth());
        				   data[i].RAC++;
        				  }
        			   }
        		   }
        		  for(int k=0;k<data.length;k++) {
        			 if(data[k]!=null) {
        				if(data[k].getBirth()=="WL") {
        					data[k]=null;
        				}
        			 }
            	  }
           }
        	  else if(name.equals(data[i].getName())&&bno==2) {
       		   for(int k=i+1;k<data.length;k++) {
       			   if(data[k]!=null) {
       				   if(data[k].getBirth()=="RAC") {
       				   data[i].setName(data[k].getName());
       				   data[i].setAge(data[k].getAge());
       				   data[i].setGender(data[k].getGender());
       				   data[i].setBirth(data[k].getBirth());
       				   data[i].RAC++;
       				  }
       			   }
       		   }
       		  for(int k=0;k<data.length;k++) {
       			 if(data[k]!=null) {
       				if(data[k].getBirth()=="WL") {
       					data[k].WL++;
       					data[k]=null;
       				}
       			 }
           	  }
          }
        else if(name.equals(data[i].getName())&&bno==3) {
          		   for(int k=i+1;k<data.length;k++) {
          			   if(data[k]!=null) {
          				   if(data[k].getBirth()=="RAC") {
          				   data[i].setName(data[k].getName());
          				   data[i].setAge(data[k].getAge());
          				   data[i].setGender(data[k].getGender());
          				   data[i].setBirth(data[k].getBirth());
          				   data[i].RAC++;
          				  }
          			   }
          		   }
          		  for(int k=0;k<data.length;k++) {
          			 if(data[k]!=null) {
          				if(data[k].getBirth()=="WL") {
          					data[k].WL++;
          					data[k]=null;
          				}
          			 }
              	  }
             }	  
    }
}
 }
class Details1{
   private String name;
   private int age;
   private String gender;
   private String birth;
   static int LB=2;
   static int MB=2;
   static int UB=2;
   static int RAC=2;
   static int WL=2;
   private int amount;
   static int sno;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public  int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
public Details1(String name,int age,String gender) {
	this.name=name;
	this.age=age;
	this.gender=gender;
}
}
