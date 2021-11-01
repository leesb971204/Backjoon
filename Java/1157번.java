//https://velog.io/@cjhlsb
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		input = input.toUpperCase();
		int[] arr = new int[26];
		int max = -1;
		char output = '?';
		for(int i=0;i<input.length();i++)
		{
			arr[input.charAt(i)-65] +=1;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max) {
				max = arr[i];
				output = (char)(i + 65);
			}
			else if(arr[i] == max)
				output = '?';
		}
		System.out.println(output);
	}
} 