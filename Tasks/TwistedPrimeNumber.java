import java.util.Scanner;

public class TwistedPrimeNumber {
        public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    int rem=0,result=0;
		    while(n!=0) {
		    	rem=n%10;
		    	result=result*10+rem;
		    	n/=10;
		    }
		    if(CheckPrime(n)&&CheckPrime(result))
		    	System.out.println("Twisted Prime Number....");
		    else
		    	System.out.println("Not Twisted Prime Number.....");
		    
		}
        public static boolean CheckPrime(int n) {
        	for(int i=2;i<n/2;i++) {
        		if(n%i==0)
        			return false;
        	}
        	return true;
        }
}
