import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		HashMap<String,Integer>map = new HashMap<>();
		for(int i=0;i<num;i++)
		{
			String input = sc.next();
			if(map.containsKey(input))
				map.put(input, map.get(input)+1);
			else
				map.put(input, 1);
		}
		List<String>tmp = new ArrayList<>(map.keySet());
		Collections.sort(tmp, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
		List<String> list = new ArrayList<>();
		list.add(tmp.get(0));
		for(int i=0;i<tmp.size();i++)
		{
			if(map.get(tmp.get(0)) == map.get(tmp.get(i)))
				list.add(tmp.get(i));
		}
		Collections.sort(list);
		System.out.println(list.get(0));
		
	}
} 

