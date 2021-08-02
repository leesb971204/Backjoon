//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int input = sc.nextInt();
    	int[] arr = {500,100,50,10,5,1};
    	int num = 1000-input;
    	int cnt = 0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(num >= arr[i]) {
    			num -= arr[i];
    			cnt++;
    			i--;
    		}
    	}
    	System.out.println(cnt);
    }
}