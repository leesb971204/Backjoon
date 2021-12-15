import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	for(int i=0;i<3;i++)
    	{
    		String input = br.readLine();
    		int[] arr = new int[input.length()];
    		int idx = 0;
    		for(int j=0;j<input.length()-1;j++)
    		{
    			if(input.charAt(j) == input.charAt(j+1))
    				arr[idx]++;
    			else
    				idx++;
    		}
    		Arrays.sort(arr);
    		System.out.println(arr[arr.length-1]+1);
    	}
    }
}
