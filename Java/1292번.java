import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[b+1];
		int cnt = 1;
		int sum = 0;
		for(int i=1;i<=b;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(cnt == b+1)
					break;
				arr[cnt] = i;
				cnt++;
			}
		}
		
		for(int i=a;i<=b;i++)
		{
			sum += arr[i];
		}
		System.out.println(sum);
			
			
	}
}
