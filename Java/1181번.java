import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String input = sc.next();
			if(!list.contains(input)) {
				list.add(input);
			}
		}
		Collections.sort(list,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int compareA = o1.length() - o2.length();
				int compareB = o2.length() - o2.length();
				if(compareA == compareB) {
					compareA = o1.compareTo(o2);
					compareB = o2.compareTo(o1);
				}
				return compareA - compareB;
			}
		});
		
		for(String i : list)
		{
			System.out.println(i);
		}
 }
}
