import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input = br.readLine();
    	int sum1 = 0;
    	int sum2 = 0;
    	for(int i=0;i<input.length()/2;i++)
    	{
    		sum1 += Character.getNumericValue(input.charAt(i));
    	}
    	
    	for(int i=input.length()/2;i<input.length();i++)
    	{
    		sum2 += Character.getNumericValue(input.charAt(i));
    	}
    	System.out.println(sum1 == sum2 ? "LUCKY" : "READY");
    	
    }
}
