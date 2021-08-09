//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	
    	char[] arr= new char[26];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i] = (char) (65+i);
    	}
    	for(int i=0;i<num;i++)
    	{
    		String input = sc.next();
    		HashSet<Character> hs = new HashSet<>();
    		int sum = 2015;
    		for(int j=0;j<input.length();j++)
    		{
    				hs.add(input.charAt(j));
    		}
    		for(int j=0;j<arr.length;j++)
    		{
    			if(hs.contains(arr[j]))
    				sum -= arr[j];
    		}
    		
    		System.out.println(sum);
    	}
    	
    }
}