import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		
		String a = A;
		String b = B;
		
		if(a.length() != b.length())
		{
			int len = LCM(a.length(),b.length());
			while(a.length() != len)
				a += A;
			while(b.length() != len)
				b += B;
		}
		
		System.out.println(a.equals(b) ? 1 : 0);
		
	}
	static int GCD(int a, int b){
		{
			while(b > 0) {
				int temp = a;
				a = b;
				b = temp % b;
			}
			return a;
		}
	}
	
	static int LCM(int a, int b){
		return (a*b) / GCD(a,b);
	}
 }


