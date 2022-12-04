import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
public class BackTracking6{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Input: ");
		char arr[]=s.next().toCharArray();
		Set<List<Character>> ans=new HashSet<>();
        Arrays.sort(arr);
		SubSet(0,arr,new ArrayList<>(),ans,arr.length);
		System.out.println(ans);
	}
	public static void SubSet(int ind,char arr[],ArrayList<Character> ds,Set<List<Character>> ans,int n){
		ans.add(new ArrayList<>(ds));
		for(int i=ind;i<n;i++){
		if(i!=ind&&arr[i]==arr[i-1])
			continue;
		ds.add(arr[i]);
	    SubSet(i+1,arr,ds,ans,n);
		ds.remove(ds.size()-1);
		}
	}
}