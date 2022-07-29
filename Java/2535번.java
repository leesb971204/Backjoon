import java.util.*;
public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 String[] arr = new String[n];
	 sc.nextLine();
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i] = sc.nextLine();
	 }
	 
	 Arrays.sort(arr,new Comparator<String>() {
		 @Override
		 public int compare(String o1, String o2)
		 {
			 String[] tmp1 = o1.split(" ");
			 String[] tmp2 = o2.split(" ");
			 int compareA = Integer.parseInt(tmp1[2]) - Integer.parseInt(tmp2[2]);
			 int compareB = Integer.parseInt(tmp2[2]) - Integer.parseInt(tmp1[2]);
			 return compareB - compareA;
		 }
	 });
	 HashMap<Integer,Integer> map = new HashMap<>();
	 int cnt = 0;
	 for(String i : arr)
	 {
		 String[] tmp = i.split(" ");
		 int country = Integer.parseInt(tmp[0]);
		 if(map.containsKey(country)) {
			 if(map.get(country) > 1) {
				 continue;
			 }
			 else {
				 System.out.println(tmp[0]+" "+tmp[1]);
				 map.put(country, 2);
				 cnt++;
			 }
		 }
		 else {
			 System.out.println(tmp[0]+" "+tmp[1]);
			 map.put(country, map.getOrDefault(country, 0)+1);
			 cnt++;
		 }
		 
		 if(cnt == 3)
			 break;
	 }
 }

}
