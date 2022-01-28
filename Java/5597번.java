import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(31);
		for(int i=1;i<=28;i++)
		{
			list.add(sc.nextInt());
		}
		list.add(31);
		list.add(32);
		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i) != i+1) {
				list.add(i, i+1);
				System.out.println(i+1);
			}
		}
	}
}
