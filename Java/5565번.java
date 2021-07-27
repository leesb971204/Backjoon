//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int[] arr = new int[9];
    	for(int i : arr)
    	{
    		arr[i] = sc.nextInt();
    		num -= arr[i];
    	}
    	System.out.println(num);
    }
}