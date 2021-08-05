//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int[] arr = new int[num];
    	int range = 0;
    	ArrayList<Integer> list = new ArrayList<>();
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i] = sc.nextInt();
    	}
    	Arrays.sort(arr);
    	range = arr[arr.length-1];
    	
    	for(int i=1;i<=range;i++)
    	{
    		if(arr.length == 2) {
    			if(arr[0] % i == 0 && arr[1] % i == 0)
    			list.add(i);
    		}
    		else {
    			if(arr[0] % i == 0 && arr[1] % i == 0 && arr[2] % i == 0)
    			list.add(i);
    		}
    	}
    	
    	for(int i : list)
    	{
    		System.out.println(i);
    	}
    }
}