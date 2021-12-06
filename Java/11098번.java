import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int p = sc.nextInt();
			HashMap<Integer,String> map = new HashMap<>();
			for(int j=0;j<p;j++)
			{
				map.put(sc.nextInt(), sc.next());
			}
			Object[] mapkey = map.keySet().toArray();
			Arrays.sort(mapkey);

			System.out.println(map.get(mapkey[mapkey.length-1]));
		}
	}
} 

