//https://velog.io/@cjhlsb
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		HashSet<String> hs = new HashSet<>(); //중복검사를 위해
		ArrayList<String> list = new ArrayList<>(); //정렬,출력을 위해
		
		for(int i=0;i<N;i++)
		{
			hs.add(sc.next());
		}
		
		for(int i=0;i<M;i++)
		{
			String input = sc.next();
			if(hs.contains(input))
				list.add(input);
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(String i : list)
		{
			System.out.println(i);
		}
		
	}
}