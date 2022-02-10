import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);
		int cnt1 = 0;
		int cnt2 = 0;
		String zero = "";
		String one = "";
		for(int i=0;i<s.length();i++)
		{
			zero += "0";
			one += "1";
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(sb.charAt(i) == '1')
			{
				while(i < sb.length() && sb.charAt(i) == '1')
				{
					sb.setCharAt(i, '0');
					i++;
				}
				cnt1++;
			}
		}
		sb = new StringBuilder(s);
		for(int i=0;i<s.length();i++)
		{
			if(sb.charAt(i) == '0')
			{
				while(i < sb.length() && sb.charAt(i) == '0')
				{
					sb.setCharAt(i, '1');
					i++;
				}
				cnt2++;
			}
		}
		System.out.println(Math.min(cnt1, cnt2));
		
		
	}
}
