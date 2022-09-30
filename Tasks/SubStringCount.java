import java.util.Scanner;
public class SubStringCount{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String input=s.next();
		int k=s.nextInt();
		int ans=0;
		boolean flag[]=new boolean[input.length()];
		for(int i=0;i<input.length();i++){
			if(flag[i]==true)
				continue;
			int count=1;
			for(int j=i+1;j<input.length();j++){
				if(input.charAt(i)==input.charAt(j)){
					count++;
					flag[j]=true;
				}
			}
			if(count>=k){
               ans=ans+count;
			}
		}
		System.out.println(ans);
	}
}