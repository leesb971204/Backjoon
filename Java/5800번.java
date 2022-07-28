import java.util.*;
public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 for(int i=0;i<n;i++)
	 {
		 int size = sc.nextInt();
		 ArrayList<Integer> list = new ArrayList<>();
		 for(int j=0;j<size;j++)
		 {
			 list.add(sc.nextInt());
		 }
		 Collections.sort(list,Collections.reverseOrder());
		 int max = Integer.MIN_VALUE;
		 for(int j=0;j<list.size()-1;j++)
		 {
			 max = Math.max(list.get(j) - list.get(j+1), max);
		 }
		 System.out.println("Class "+(i+1));
		 System.out.println("Max "+list.get(0)+", Min "+list.get(list.size()-1)+", Largest gap "+max);
	 }
 }

}
