import java.util.*;
import java.util.stream.Stream;
import java.io.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
    	int num = Integer.parseInt(br.readLine());
    	String a = br.readLine();
    	int[] arr1 = Stream.of(a.split(" ")).mapToInt(Integer::parseInt).toArray();
    	String b = br.readLine();
    	String[] tmp = b.split(" ");
    	Integer[] arr2 = new Integer[num];
    	for(int i=0;i<num;i++)
    	{
    		arr2[i] = Integer.parseInt(tmp[i]);
    	}
    	Arrays.sort(arr1);
    	Arrays.sort(arr2, Collections.reverseOrder());
    	
    	for(int i=0;i<arr1.length;i++)
    	{
    		sum += arr1[i] * arr2[i]; 
    	}
    	System.out.println(sum);
    }
}