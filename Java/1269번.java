import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<a;i++)
		{
			map.put(sc.nextInt(), 0);
		}
		int cnt = 0;
		for(int i=0;i<b;i++)
		{
			int z = sc.nextInt();
			if(!map.containsKey(z))
				map.put(z,0);
			else
				cnt++;
		}
		System.out.println(map.size()-cnt);
		
	}
}
