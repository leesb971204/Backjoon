//https://velog.io/@cjhlsb
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[10];
       for(int i=0;i<arr.length;i++)
       {
    	   arr[i] = sc.nextInt();
    	   arr[i] %= 42;
       }
       ArrayList<Integer> a = new ArrayList<>();
       for(int i : arr)
       {
    	   if(!a.contains(i))
    		   a.add(i);
       }
       System.out.println(a.size());
       
    }
}