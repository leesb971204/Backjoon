import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<list.size();i++) {
			list.set(i, list.get(i)+i+1);
		}
		System.out.println(Collections.max(list)+1);
		
			
	}
}
