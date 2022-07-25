import java.util.*;
public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 HashMap<String,Boolean> map = new HashMap<>();
	 int n = sc.nextInt();
	 sc.nextLine();
	 for(int i=0;i<n;i++)
	 {
		 String record = sc.nextLine();
		 String[] tmp = record.split(" ");
		 if(tmp[1].equals("enter")) {
			 map.put(tmp[0],true);
		 }
		 else {
			 map.remove(tmp[0]);
		 }
	 }
	 
	 String[] arr = map.keySet().toArray(new String[map.size()]);
	 Arrays.sort(arr, Comparator.reverseOrder());
	 for(String i : arr)
	 {
		 System.out.println(i);
	 }
 }
}
