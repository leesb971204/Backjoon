import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = sc.nextInt();
		String input = sc.next();
		int cnt = 0;
		char[] arr = input.toCharArray();
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] != 'P')
				continue;
			
			for(int j=i-len;j<=i+len;j++)
			{
				if(j >= 0 && j < n && arr[j] == 'H') {
					arr[j] = '-';
					cnt++;
					break;
				}
					
			}
		}
		System.out.println(cnt);
	}
}
