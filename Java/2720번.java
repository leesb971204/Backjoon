import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = {25,10,5,1};
		int[] ans = new int[arr.length];
		for(int i=0;i<num;i++)
		{
			int money = Integer.parseInt(br.readLine());
			int k = 0;
			while(money > 0) {
				if(money >= arr[k]) {
					money -= arr[k];
					ans[k]++;
				}
				
				if(money < arr[k])
					k++;
			}
			for(int j : ans) {
				System.out.print(j+" ");
			}
			System.out.println();
			for(int j=0;j<ans.length;j++)
			{
				ans[j] = 0;
			}
		}
		
		
	}
}
