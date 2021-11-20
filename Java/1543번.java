import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String input = sc.nextLine();
		int cnt = 0;
		for(int i=0;i<=a.length()-input.length();i++)
		{
			boolean flag = true;
			for(int j=0;j<input.length();j++)
			{
				if(a.charAt(i+j) != input.charAt(j)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				cnt++;
				i += input.length()-1;
			}
			
		}
		System.out.println(cnt);
			
		
			
	}
} 