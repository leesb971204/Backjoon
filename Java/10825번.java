import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args)throws Exception {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int n = Integer.parseInt(br.readLine());
	 String[] arr = new String[n];
	 for(int i=0;i<n;i++)
	 {
		 arr[i] = br.readLine();
	 }
	 Arrays.sort(arr,new Comparator<String>() {
		 @Override
		 public int compare(String o1, String o2) {
			 String[] tmp1 = o1.split(" ");
			 String[] tmp2 = o2.split(" ");
			 int compareA = Integer.parseInt(tmp1[1]) - Integer.parseInt(tmp2[1]);
			 int compareB = Integer.parseInt(tmp2[1]) - Integer.parseInt(tmp1[1]);
			 if(compareA == compareB) {
				 compareA = Integer.parseInt(tmp2[2]) - Integer.parseInt(tmp1[2]);
				 compareB = Integer.parseInt(tmp1[2]) - Integer.parseInt(tmp2[2]);
			 }
			 if(compareA == compareB) {
				 compareA = Integer.parseInt(tmp1[3]) - Integer.parseInt(tmp2[3]);
				 compareB = Integer.parseInt(tmp2[3]) - Integer.parseInt(tmp1[3]);
			 }
			 if(compareA == compareB) {
				 compareA = Integer.parseInt(tmp1[3]) - Integer.parseInt(tmp2[3]);
				 compareB = Integer.parseInt(tmp2[3]) - Integer.parseInt(tmp1[3]);
			 }
			 if(compareA == compareB) {
				 compareA = o2.compareTo(o1);
				 compareB = o1.compareTo(o2);
			 }
			 return compareB - compareA;
		 }
	 });
	 
	 for(String i : arr)
	 {
		 String[] tmp = i.split(" ");
		 System.out.println(tmp[0]);
	 }
 }
}
