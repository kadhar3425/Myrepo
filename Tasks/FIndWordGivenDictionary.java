import java.util.Scanner;
public class FindWordGivenDictionary 
{
	static int flag = 0;
	public static void FindWord(int index , String[] arr  ,int n , String str , String given)
	{
		String str2 = str;
		str +=arr[index];
		if (flag==1)
		{
			return;
		}
		if(str.equals(given))
		{
			flag=1;
			return;
		}
		if(index==n-1)
		{
			return;
		}
		FindWord(index+1,arr,n,str,given);
		FindWord(index+1,arr,n,str2,given);
	}
	public static void main(String[]args)
	{
                Scanner s=new Scanner(System.in);
		String[] arr = { "i", "like", "sam", "sung", "samsung", "mobile", "ice","cream", "icecream", "man", "go", "mango","go","mango"};
		int n = arr.length;
		String given =s.next();
	        FindWord(0,arr,n,"",given);
		if(flag==0)
         	{
		System.out.println("No");
	        }
		else
		{
		System.out.println("Yes");
		}
}
}

	
		
		
			
