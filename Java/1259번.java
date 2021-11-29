//https://velog.io/@cjhlsb
import java.io.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String input = br.readLine();
			if(input.equals("0"))
				break;
			
			StringBuilder sb = new StringBuilder(input).reverse();
			System.out.println(input.equals(sb.toString())? "yes" : "no");
			
		}
		
	}
} 

