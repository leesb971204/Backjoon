//https://velog.io/@cjhlsb
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = br.readLine();
		}
		StringBuilder sb = new StringBuilder(arr[0]);
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=0;k<arr[0].length();k++) {
					if(arr[i].charAt(k) != arr[j].charAt(k)) {
						sb.setCharAt(k, '?');
					}
				}
				
			}
		}
		System.out.println(sb);
	}
} 