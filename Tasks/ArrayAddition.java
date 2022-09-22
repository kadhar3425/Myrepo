import java.util.Scanner;

class ArrayAddition{
public static void main(String[] args)
    {
		Scanner st=new Scanner(System.in);
		int n=st.nextInt();
        int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=st.nextInt();
		int m=st.nextInt();
		int b[]=new int[n];
		for(int i=0;i<m;i++)
			b[i]=st.nextInt();
		
        int[] sum= new int[n];
        int i = n - 1, j = m - 1, k = n - 1;
     
        int carry = 0, s = 0;
		
		while (j >= 0)
        {
			 s = a[i] + b[j] + carry;
             
            sum[k] = (s % 10);
			carry = s / 10;
     
            k--;
            i--;
            j--;
        }
		while(i>=0){
			s=a[i]+carry;
			sum[k]=(s%10);
			carry=s/10;
			k--;
			i--;
		}
        for(int index=0;index<n;index++){
		     System.out.print(sum[index]+" ");
		}
    }
}
	