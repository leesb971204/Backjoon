import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(":");
		int a = Math.min(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
		int b = Math.max(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
		int tmp = 0;
		while(a != 0) {
			tmp = b % a;
			b = a;
			a = tmp;
		}
		System.out.println(Integer.parseInt(arr[0])/b+":"+Integer.parseInt(arr[1])/b);
	}
} 
