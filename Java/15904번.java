import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String ans = "UCPC";
		int idx = 0;
		for(int i=0;i<input.length();i++)
		{
			if(idx == 4)
				break;
			
			if(input.charAt(i) == ans.charAt(idx))
				idx++;
		}
		System.out.println(idx == 4 ? "I love UCPC" : "I hate UCPC");
	}
} 
