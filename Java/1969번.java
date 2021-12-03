import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int len = sc.nextInt();
		int cnt = 0;
		String[] input = new String[num];
		String ans = "";
		TreeMap<Character,Integer> map = new TreeMap<>();
		for(int i=0;i<num;i++)
		{
			input[i] = sc.next();
		}
		for(int i=0;i<len;i++)
		{
			map.put('A',0);
			map.put('C', 0);
			map.put('G', 0);
			map.put('T', 0);
			for(int j=0;j<num;j++)
			{
				map.put(input[j].charAt(i), map.get(input[j].charAt(i))+1);
			}
			ArrayList<Character> keySetList = new ArrayList<>(map.keySet());
			Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
			ans += keySetList.get(0);
			for(int j=0;j<num;j++)
			{
				if(input[j].charAt(i) != keySetList.get(0))
					cnt++;
			}
			map.clear();
		}
		System.out.println(ans);
		System.out.println(cnt);
	}
} 

