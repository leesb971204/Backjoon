import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		Map<String,Integer> map = new TreeMap<>();
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.next();
			String tmp = arr[i].substring(arr[i].indexOf(".")+1,arr[i].length());
			map.put(tmp, map.get(tmp)==null?1:map.get(tmp)+1);
		}
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
}
