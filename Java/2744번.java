//https://velog.io/@cjhlsb
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String output = "";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i) > 96) {
				output += (char)(input.charAt(i)-32);
			}
			else {
				output += (char)(input.charAt(i)+32);
			}
		}
		System.out.println(output);
	}
} 