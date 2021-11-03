//https://velog.io/@cjhlsb
import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = new String[input.length()];
		for(int i=0;i<input.length();i++) 
		{
			arr[i] = input.substring(i,input.length());
		}
		Arrays.sort(arr);
		for(String i : arr)
		{
			System.out.println(i);
		}
		br.close();
	}
} 