import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			Map<String, Integer> map = new HashMap<>();
			int k = sc.nextInt();
			sc.nextLine();
			for(int j=0;j<k;j++)
			{
				String[] arr = sc.nextLine().split(" ");
				map.put(arr[1], map.getOrDefault(arr[1], 0)+1);				
			}
			int sum = 1;
			for(int v : map.values())
			{
				sum *= (v+1);
			}
			System.out.println(sum - 1);
		}
 }
}
