//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int cnt = 0;
    	while(num>0)
    	{
    		if(num%3 == 0 && num%5 != 0) {
    		num -= 3;
    		cnt++;
    		}
    		else {
    			num -= 5;
    			cnt++;
    		}
    	}
    	System.out.println(num<0?-1:cnt);
    }
}