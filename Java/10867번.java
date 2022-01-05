import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i : arr) {
			if(!list.contains(i))
				list.add(i);
		}
		Collections.sort(list);
		for(int i : list) {
			sb.append(i+" ");
		}
		System.out.println(sb.toString());
	}
}
