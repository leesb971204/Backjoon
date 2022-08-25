import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<n;i++)
		{
			String input = sc.next();
			for(int j=0;j<m;j++)
			{
				if(input.charAt(j) == '.' && cnt == 0)
					System.out.print(-1+" ");
				else if(input.charAt(j) == 'c') {
					System.out.print(0+" ");
					cnt = 1;
				}
				else if(input.charAt(j) == '.' && cnt != 0) {
					System.out.print(cnt+" ");
					cnt++;
				}
					
			}
			System.out.println();
			cnt = 0;
		}
		
	}
 }


